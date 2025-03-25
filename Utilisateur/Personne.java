package Utilisateur;

public class Personne {
	 public int id;
	 public String dateNaissance;
	 public String ville;
	 public String Prenom;
	 public String Nom;
	
	public Personne (int id, String dateNaissance, String ville, String Prenom, String Nom) {
		this.id = id;
		this.dateNaissance = dateNaissance;
		this.ville = ville;
		this.Prenom = Prenom;
		this.Nom = Nom;
	}
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	
	public String getdateNaissance() {
		return dateNaissance;
	}
	public void setdateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public String getville() {
		return dateNaissance;
	}
	public void setville(String ville) {
		this.ville = ville;
	}
	
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String Prenom) {
		this.Prenom = Prenom;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String Nom) {
		this.Nom = Nom;
	}
}