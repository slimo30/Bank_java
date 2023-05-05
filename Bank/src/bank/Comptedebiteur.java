package bank;

public class Comptedebiteur extends Banque.Compte{
	static double seuil;
	public Comptedebiteur (Banque banque  ,Client cl, int num, double solde)
	{
		 banque.super(cl, num, solde);
	}
	@Override
	public void retirer(double m) {
		   setSolde(getSolde() - m);
	}
	public static double getSeuil() {
		return seuil;
	}
	public static void setSeuil(double seuil) {
		Comptedebiteur.seuil = seuil;
	}
	public String toString() {
		 return "Client [nom=" + super.getClient() + ", num=" + super.getNumero() +" solde=" + super.getSolde() + "]";
		}
	
	public void affichier()
	{
		System.out.println(toString());
	}
	
	
}
