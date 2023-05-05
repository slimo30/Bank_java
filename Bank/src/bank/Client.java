package bank;

public class Client {
	private String nom;
	private String prenom;
	private int numero;
	public Client(String nom, String prenom, int numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", numero=" + numero + "]";
	}
	public Client() {
		super();
	}
	
	public void affichier()
	{
		System.out.println(toString());
	}
	
}
