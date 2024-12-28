package calculatrice;

public class Division extends OperationBinaire {
    public Division(double valeur1, double valeur2) {
        super(valeur1, valeur2);
    }

    
    public double Calculer() {
        if (valeur2 == 0) {
            throw new ArithmeticException("Division par zéro !");
        }
        return valeur1 / valeur2;
    }
}
