
public abstract class ProfessionnelSanté {
    private static int id ;
    private static String nom;
    private static String prenom;
    private static String dateNaissance;
    private static String tel ;
    private static String email ;
    private static String shift ;

    public ProfessionnelSanté(int id, String nom, String prenom, String dateNaissance, String tel, String email, String shift) {
    }

    public ProfessionnelSanté(int medecinId, String medecinNom, String medecinPrenom, String medecinDateNaissance, String medecinTel, String medecinShift, String medecinEmail, String medecinSpecialite) {
    }

    public ProfessionnelSanté(int id, String nom, String prenom, String shift) {

    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    public String setEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }
    public String setTel() {
        return tel;
    }
    public void setTel(String nouveauTel) {
    }
    public void setAdresse(String nouvelleAdresse) {
    }

    public void setEmail(String nouveauEmail) {
    }
    public void setShift(String nouveauShift) {
}
    public void afficher() {

    }

    public static class Medecin extends ProfessionnelSanté {


        private String  specialite ;


        public Medecin(int medecinId, String medecinNom, String medecinPrenom, String medecinDateNaissance, String medecinTel, String medecinShift, String medecinEmail, String medecinpecialite) {
            super(medecinId, medecinNom, medecinPrenom, medecinDateNaissance, medecinTel , medecinShift, medecinEmail);
            this.specialite = specialite ;
        }

        public String getSpecialite() {
            return specialite;
        }

        @Override
        public void afficher() {
            System.out.println("ID : " + id);
            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("Date de naissance : " + dateNaissance);
            System.out.println("Téléphone : " + tel);
            System.out.println("Email : " + email);
            System.out.println("Shift : " + shift );
            System.out.println("Specialite : " +specialite);

        }
    }
    public static class Infermier extends ProfessionnelSanté {


        private String  service ;


        public Infermier(int id,  String nom , String prenom , String DateNaissance , String tel
                , String email , String Shift  , String service ) {

            super(id , nom , prenom , DateNaissance , tel , email , Shift );
            this.service = service;

        }

        public Infermier(int id,  String nom , String prenom ,String Shift   ){
            super(id , nom , prenom , Shift );


        }



        public String getService() {
            return service;
        }


        @Override
        public void afficher() {
            System.out.println("ID : " + id);
            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("Date de naissance : " + dateNaissance);
            System.out.println("Téléphone : " + tel);
            System.out.println("Email : " + email);
            System.out.println("Shift : " + shift );
            System.out.println("Service : " +service);

        }
    }
    public static class stagiere extends ProfessionnelSanté {


        private String  service ;


        public stagiere(int id,  String nom , String prenom , String DateNaissance , String tel
                , String email , String Shift  , String service ) {

            super(id , nom , prenom , DateNaissance , tel , email , Shift );
            this.service = service;

        }

        public String getService() {
            return service;
        }


        @Override
        public void afficher() {
            System.out.println("ID : " + id);
            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("Date de naissance : " + dateNaissance);
            System.out.println("Téléphone : " + tel);
            System.out.println("Email : " + email);
            System.out.println("Shift : " + shift );
            System.out.println("Service : " +service);

        }
    }
    public static class secretaireMedicale extends ProfessionnelSanté {


        private String  service ;


        public secretaireMedicale(int id,  String nom , String prenom , String DateNaissance , String tel
                , String email , String Shift  , String service ) {

            super(id , nom , prenom , DateNaissance , tel , email , Shift );
            this.service = service;

        }

        public String getService() {
            return service;
        }


        @Override
        public void afficher() {
            System.out.println("ID : " + id);
            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("Date de naissance : " + dateNaissance);
            System.out.println("Téléphone : " + tel);
            System.out.println("Email : " + email);
            System.out.println("Shift : " + shift );
            System.out.println("Service : " +service);

        }
    }
    public static class alternant extends ProfessionnelSanté {


        private String  service ;


        public alternant(int id,  String nom , String prenom , String DateNaissance , String tel
                , String email , String Shift  , String service ) {

            super(id , nom , prenom , DateNaissance , tel , email , Shift );
            this.service = service;

        }

        public String getService() {
            return service;
        }


        @Override
        public void afficher() {
            System.out.println("ID : " + id);
            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("Date de naissance : " + dateNaissance);
            System.out.println("Téléphone : " + tel);
            System.out.println("Email : " + email);
            System.out.println("Shift : " + shift );
            System.out.println("Service : " +service);

        }
}
}



