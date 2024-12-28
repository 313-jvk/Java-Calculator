package calculatrice;

public class Exp extends OperationUnaire {
    public Exp(double valeur) {
        super(valeur);
    }

    
    public double Calculer() {
        return Math.exp(valeur); // Utilisation de Math.exp
    }
}

