package calculatrice;

public class Multiplication extends OperationBinaire{
    public Multiplication(double valeur1, double valeur2) {
        super(valeur1, valeur2);
    }

    
    public double Calculer() {
        return valeur1 * valeur2;
    }
}

