package bank;

public class Comptecourant extends Banque.Compte{
    public Comptecourant(Banque banque, Client cl, int num, double solde) {
        banque.super(cl, num, solde);
    }

    @Override
    public void retirer(double m) {
        setSolde(getSolde() - m);
    }

	@Override
	public String toString() {
		 return "Client [nom=" + super.getClient() + ", num=" + super.getNumero() +" solde=" + super.getSolde() + "]";
		}
	public void affichier()
	{
		System.out.println(toString());
	}
	
}
