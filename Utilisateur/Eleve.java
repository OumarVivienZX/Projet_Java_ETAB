package Utilisateur;

public class Eleve extends Personne {
    private String classe;

    public Eleve(int id, String dateNaissance, String ville, String Prenom, String Nom, String classe) {
        super(id, dateNaissance, ville, Prenom, Nom);
        this.classe = classe;
    }

    public void ajouter(Eleve eleve) {
        System.out.println("Ajout de l'élève : " + eleve.Nom);
        System.out.println("ID : " + eleve.id);
        System.out.println("Date de naissance : " + eleve.dateNaissance);
        System.out.println("Ville : " + eleve.ville);
        System.out.println("Prénom : " + eleve.Prenom);
        System.out.println("Classe : " + eleve.classe);
    }

    public void mettreAJour(Eleve eleve, int id, String dateNaissance, String ville, String prenom, String nom, String classe) {
        eleve.id = id;
        eleve.dateNaissance = dateNaissance;
        eleve.ville = ville;
        eleve.Prenom = prenom;
        eleve.Nom = nom;
        eleve.classe = classe;

        System.out.println("Mise à jour des informations de l'élève : ");
        System.out.println("Nouvel ID : " + eleve.id);
        System.out.println("Nouvelle date de naissance : " + eleve.dateNaissance);
        System.out.println("Nouvelle ville : " + eleve.ville);
        System.out.println("Nouveau prénom : " + eleve.Prenom);
        System.out.println("Nouveau nom : " + eleve.Nom);
        System.out.println("Nouvelle classe : " + eleve.classe);
    }
}
