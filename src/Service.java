
public abstract class Service {
    private String nom;

    public Service(String nom) {
        this.nom = nom;
    }

    public abstract void fournirService();

    public String getNom() {
        return nom;
    }

    public static class Urgences extends Service {
        public Urgences() {
            super("Service des urgences");
        }

        @Override
        public void fournirService() {

        }
    }

    public static class MedecineInterne extends Service {
        public MedecineInterne() {
            super("Médecine interne");
        }

        @Override
        public void fournirService() {

        }
    }
}

