package calculatrice;


	public abstract class OperationBinaire implements CalculMath {
	    protected double valeur1; 
	    protected double valeur2; 

	    // Constructeur
	    public OperationBinaire(double valeur1, double valeur2) {
	        this.valeur1 = valeur1;
	        this.valeur2 = valeur2;
	    }
	}



