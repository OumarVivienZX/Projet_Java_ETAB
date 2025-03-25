package Utilisateur;

public class Professeur extends Personne {
    public boolean vacant;

    public Professeur(int id, String dateNaissance, String ville, String Prenom, String Nom, boolean vacant) {
        super(id, dateNaissance, ville, Prenom, Nom);
        this.vacant = vacant;
    }

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public void ajouter(Professeur professeur) {
        System.out.println("Ajout du professeur : " + professeur.getNom());
        System.out.println("ID : " + professeur.getid());
        System.out.println("Date de naissance : " + professeur.getdateNaissance());
        System.out.println("Ville : " + professeur.getville());
        System.out.println("Prenom : " + professeur.getPrenom());
        System.out.println("Vacant : " + professeur.isVacant());
    }

    public void mettreAJour(Professeur professeur, int id, String dateNaissance, String ville, String Prenom, String Nom, boolean vacant) {
        professeur.setid(id);
        professeur.setdateNaissance(dateNaissance);
        professeur.setville(ville);
        professeur.setPrenom(Prenom);
        professeur.setNom(Nom);
        professeur.setVacant(vacant);

        System.out.println("Mise a jour des informations du professeur : ");
        System.out.println("Nouvel ID : " + professeur.getid());
        System.out.println("Nouvelle date de naissance : " + professeur.getdateNaissance());
        System.out.println("Nouvelle ville : " + professeur.getville());
        System.out.println("Nouveau prenom : " + professeur.getPrenom());
        System.out.println("Nouveau nom : " + professeur.getNom());
        System.out.println("Nouvel etat vacant : " + professeur.isVacant());
    }
}
