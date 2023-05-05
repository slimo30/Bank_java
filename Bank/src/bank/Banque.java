package bank;
import java.util.Iterator;
import java.util.Vector;


public class Banque {
	private String nom;
	private String prenom;
	public Banque() {
		super();
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


	public Vector<Client> getDients() {
		return dients;
	}


	public void setDients(Vector<Client> dients) {
		this.dients = dients;
	}


	public Vector<Banque.Compte> getComptes() {
		return comptes;
	}


	public void setComptes(Vector<Banque.Compte> comptes) {
		this.comptes = comptes;
	}
	private Vector<Client> dients = new Vector<Client>();
	public Banque(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	private Vector<Banque.Compte> comptes = new Vector<Banque.Compte>();

	public Compte cherche_compte (int n) {
	    Iterator<Banque.Compte> itrcmp = comptes.iterator();
	    while(itrcmp.hasNext()) {
	        Compte c = itrcmp.next();
	        if(c.numero == n) {
	            return c;
	        }
	    }
	    return null;
	}

	public void Ajouter_compte (Compte c) {
	    comptes.add(c);
	}

	public void affichier_vector_compte () {
	    Iterator<Banque.Compte> itrcmp = comptes.iterator();
	    while(itrcmp.hasNext()) {
	        Banque.Compte c = itrcmp.next();
	        c.affichier();
	    }
	}

	public void Ajouter_client (Client c)
	{
		dients.add(c);
	}
	public void Supremer_compte(int n) {
	    Iterator<Compte> itrcmp = comptes.iterator();
	    while (itrcmp.hasNext()) {
	        Compte c = itrcmp.next();
	        if (c.numero == n) {
	            itrcmp.remove(); 
	            return; 
	        }
	    }
	}

	public int nb_compte ()
	{
		return comptes.size();
	}
	
	public int nb_client ()
	{
		return dients.size();
	}
	public void modifier_client (int num ,String nom ,String prenom)
	{
		Iterator<Client> itrcl = dients.iterator();
		while(itrcl.hasNext())
		{
			Client c = itrcl.next();
			if(c.getNumero() == num)
			{
				c.setNom(nom);
				c.setPrenom(prenom);
			}
		}
	}
	
	

	public void affichier_vector_client () {
	    Iterator<Client> itrcl = dients.iterator();
	    while(itrcl.hasNext()) {
	        Client c = itrcl.next();
	        System.out.println(c);
	    }
	}

	
	
	public abstract class Compte {
		private int numero ;
		private double solde;
		private Client client ;
		public Compte (Client cl ,int num ,double solde)
		{
			this.client=cl;
			this.numero= num;
			this.solde = solde;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public double getSolde() {
			return solde;
		}
		public void setSolde(double solde) {
			this.solde = solde;
		}
		public Client getClient() {
			return client;
		}
		public void setClient(Client client) {
			this.client = client;
		}
		public void deposer (double m)
		{
			setSolde(m + getSolde()); 
		}
		abstract public void retirer(double m);
		
		@Override
		
		public abstract  String toString();
		public void affichier()
		{
			System.out.println("Compte [numero=" + numero + ", solde=" + solde + ", client=" + client + "]");
		}
		

	}
}
