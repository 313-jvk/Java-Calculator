package calculatrice;

public class Sqrt extends OperationUnaire {
    public Sqrt(double valeur) {
        super(valeur);
    }

    
    public double Calculer() {
        if (valeur < 0) {
            throw new ArithmeticException("Racine carrée d'une valeur négative !");
        }
        return Math.sqrt(valeur); // Utilisation de Math.sqrt
    }
}
