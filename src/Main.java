import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProfessionnelSanté[] professionnelSantés = new ProfessionnelSanté[1000];
        int nombreProfessionnelSanté = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Principal :");
            System.out.println("1.Ajouter un professionel de santé:");
            System.out.println(". Quitter");
            System.out.print("Choix : ");
            int choixPrincipal = scanner.nextInt();

            int choix = 0;
            switch (choixPrincipal) {
                case 1:
                    System.out.println("Menu Ajout de professionnel de santé:");
                    System.out.println("1. Ajouter un Medecin");
                    System.out.println("2. Ajouter un infermier ");
                    System.out.println("3. Ajouter un Stagiere");
                    System.out.print("Choix : ");
                    int choixAjout = scanner.nextInt();
                    scanner.nextLine();


            }
            }

    }
}
