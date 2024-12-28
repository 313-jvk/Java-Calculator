package calculatrice;

public class Log extends OperationUnaire {
    public Log(double valeur) {
        super(valeur);
    }

    
    public double Calculer() {
        if (valeur <= 0) {
            throw new ArithmeticException("Logarithme d'une valeur négative ou zéro !");
        }
        return Math.log(valeur); // Utilisation de Math.log
    }
}

