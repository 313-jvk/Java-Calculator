package calculatrice;

public class Cos extends OperationUnaire {
    public Cos(double valeur) {
        super(valeur);
    }

    
    public double Calculer() {
        return Math.cos(valeur); // Utilisation de Math.cos
    }
}

