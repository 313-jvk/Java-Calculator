package calculatrice;

public class Sin extends OperationUnaire {
    public Sin(double valeur) {
        super(valeur);
    }

    
    public double Calculer() {
        return Math.sin(valeur); // Utilisation de Math.sin
    }
}
