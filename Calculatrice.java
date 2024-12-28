package calculatrice;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("Choisissez une opération :");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Sinus");
            System.out.println("6. Cosinus");
            System.out.println("7. Logarithme");
            System.out.println("8. Exponentielle");
            System.out.println("9. Racine carrée");
            System.out.println("0. Quitter");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1: // Addition
                    System.out.println("Entrez deux valeurs :");
                    double a1 = scanner.nextDouble();
                    double b1 = scanner.nextDouble();
                    Addition addition = new Addition(a1, b1);
                    System.out.println("Résultat : " + addition.Calculer());
                    break;

                case 2: // Soustraction
                    System.out.println("Entrez deux valeurs :");
                    double a2 = scanner.nextDouble();
                    double b2 = scanner.nextDouble();
                    Soustraction soustraction = new Soustraction(a2, b2);
                    System.out.println("Résultat : " + soustraction.Calculer());
                    break;

                case 3: // Multiplication
                    System.out.println("Entrez deux valeurs :");
                    double a3 = scanner.nextDouble();
                    double b3 = scanner.nextDouble();
                    Multiplication multiplication = new Multiplication(a3, b3);
                    System.out.println("Résultat : " + multiplication.Calculer());
                    break;

                case 4: // Division
                    System.out.println("Entrez deux valeurs :");
                    double a4 = scanner.nextDouble();
                    double b4 = scanner.nextDouble();
                    if (b4 != 0) {
                        Division division = new Division(a4, b4);
                        System.out.println("Résultat : " + division.Calculer());
                    } else {
                        System.out.println("Erreur : division par zéro !");
                    }
                    break;

                case 5: // Sinus
                    System.out.println("Entrez une valeur :");
                    double valeur5 = scanner.nextDouble();
                    Sin sinus = new Sin(valeur5);
                    System.out.println("Résultat : " + sinus.Calculer());
                    break;

                case 6: // Cosinus
                    System.out.println("Entrez une valeur :");
                    double valeur6 = scanner.nextDouble();
                    Cos cosinus = new Cos(valeur6);
                    System.out.println("Résultat : " + cosinus.Calculer());
                    break;

                case 7: // Logarithme
                    System.out.println("Entrez une valeur (positive) :");
                    double valeur7 = scanner.nextDouble();
                    if (valeur7 > 0) {
                        Log log = new Log(valeur7);
                        System.out.println("Résultat : " + log.Calculer());
                    } else {
                        System.out.println("Erreur : le logarithme est défini uniquement pour les valeurs positives !");
                    }
                    break;

                case 8: // Exponentielle
                    System.out.println("Entrez une valeur :");
                    double valeur8 = scanner.nextDouble();
                    Exp exponentielle = new Exp(valeur8);
                    System.out.println("Résultat : " + exponentielle.Calculer());
                    break;

                case 9: // Racine carrée
                    System.out.println("Entrez une valeur (positive) :");
                    double valeur9 = scanner.nextDouble();
                    if (valeur9 >= 0) {
                        Sqrt racineCarree = new Sqrt(valeur9);
                        System.out.println("Résultat : " + racineCarree.Calculer());
                    } else {
                        System.out.println("Erreur : la racine carrée est définie uniquement pour les valeurs positives !");
                    }
                    break;

                case 0: // Quitter
                    continuer = false;
                    System.out.println("Merci d'avoir utilisé la calculatrice !");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
