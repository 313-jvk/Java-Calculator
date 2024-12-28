package calculatrice;

public abstract class OperationUnaire implements CalculMath {
    protected double valeur; // Valeur unique

    // Constructeur
    public OperationUnaire(double valeur) {
        this.valeur = valeur;
    }
}

