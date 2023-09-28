

import java.util.Scanner;

public class Main {
 

    public static void main(String[] args) {

        int nombreProfessionnelSanté = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Principal :");
            System.out.println("1.Ajouter un professionel de santé:");
            System.out.println("2.afficher un professionel de santé:");
            System.out.println("2.modifierun professionel de santé:");

            System.out.println(". Quitter");
            System.out.print("Choix : ");
            int choixPrincipal = scanner.nextInt();

            int choix = 0;
            switch (choixPrincipal) {
                case 1:
                    System.out.println("Menu Ajout de professionnel de santé:");
                    System.out.println("1. Ajouter un Medecin");
                    System.out.println("2. Ajouter un infermier ");
                    System.out.println("3. Ajouter une secretaire medicale");
                    System.out.println("3. Ajouter un  stagiere ");
                    System.out.print("Choix : ");
                    int choixAjout = scanner.nextInt();
                    scanner.nextLine();

                    switch (choixAjout) {
                        case 1:
                            System.out.print("ID : ");
                            int medecinId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nom : ");
                            String medecinNom = scanner.nextLine();
                            System.out.print("Prénom : ");
                            String medecinPrenom = scanner.nextLine();
                            System.out.print("Date de naissance (jj/mm/aaaa) : ");
                            String medecinDateNaissance = scanner.nextLine();
                            System.out.print("Téléphone : ");
                            String medecinTel = scanner.nextLine();
                            System.out.print("Email : ");
                            String medecinEmail = scanner.nextLine();
                            System.out.print("Shift: ");
                            String medecinShift = scanner.nextLine();
                            System.out.print("Specialite : ");
                            String medecinSpecialite = scanner.nextLine();

                            nombreProfessionnelSanté++;

                            System.out.println("Medecin ajouté avec succès.");
                            break ;
                        case 2:
                            System.out.print("ID : ");
                            int InfermierId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nom : ");
                            String InfermierNom = scanner.nextLine();
                            System.out.print("Prénom : ");
                            String InfermierPrenom = scanner.nextLine();
                            System.out.print("Date de naissance (jj/mm/aaaa) : ");
                            String InfermierDateNaissance = scanner.nextLine();
                            System.out.print("Téléphone : ");
                            String InfermierTel = scanner.nextLine();
                            System.out.print("Email : ");
                            String InfermierEmail = scanner.nextLine();
                            System.out.print("Shift: ");
                            String InfermierShift = scanner.nextLine();
                            System.out.print("Service : ");
                            String InfermierService = scanner.nextLine();

                            nombreProfessionnelSanté++;

                            System.out.println("Infermier ajouté avec succès.");
                            break ;
                        case 3:
                            System.out.print("ID : ");
                            int secretaireMedicaleId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nom : ");
                            String secretaireMedicaleNom = scanner.nextLine();
                            System.out.print("Prénom : ");
                            String secretaireMedicalePrenom = scanner.nextLine();
                            System.out.print("Date de naissance (jj/mm/aaaa) : ");
                            String secretaireMedicaleDateNaissance = scanner.nextLine();
                            System.out.print("Téléphone : ");
                            String secretaireMedicaleTel = scanner.nextLine();
                            System.out.print("Email : ");
                            String secretaireMedicaleEmail = scanner.nextLine();
                            System.out.print("Shift: ");
                            String secretaireMedicaleShift = scanner.nextLine();
                            System.out.print("Service : ");
                            String secretaireMedicaleService = scanner.nextLine();


                            System.out.println("Secretaire medicale ajouté avec succès.");
                            break ;
                        case 4:
                            System.out.print("ID : ");
                            int stagiereId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nom : ");
                            String stagiereNom = scanner.nextLine();
                            System.out.print("Prénom : ");
                            String stagierePrenom = scanner.nextLine();
                            System.out.print("Date de naissance (jj/mm/aaaa) : ");
                            String stagiereDateNaissance = scanner.nextLine();
                            System.out.print("Téléphone : ");
                            String stagiereTel = scanner.nextLine();
                            System.out.print("Email : ");
                            String stagiereEmail = scanner.nextLine();
                            System.out.print("Shift: ");
                            String stagiereShift = scanner.nextLine();
                            System.out.print("Service : ");
                            String stagiereService = scanner.nextLine();

                            nombreProfessionnelSanté++;

                            System.out.println("Stagiere ajouté avec succès.");
                            break ;
                        case 5:
                            System.out.print("ID : ");
                            int alternantId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nom : ");
                            String alternantNom = scanner.nextLine();
                            System.out.print("Prénom : ");
                            String alternantPrenom = scanner.nextLine();
                            System.out.print("Date de naissance (jj/mm/aaaa) : ");
                            String alternantDateNaissance = scanner.nextLine();
                            System.out.print("Téléphone : ");
                            String alternantTel = scanner.nextLine();
                            System.out.print("Email : ");
                            String alternantEmail = scanner.nextLine();
                            System.out.print("Shift: ");
                            String alternantShift = scanner.nextLine();
                            System.out.print("Service : ");
                            String alternantService = scanner.nextLine();


                            nombreProfessionnelSanté++;

                            System.out.println("Alternant ajouté avec succès.");
                            break ;
                        default:
                            System.out.println("Choix invalide.");
                            break;
                            
                    }


            }
            }

    }

    }
