package bank;

public class App {

	public static void main(String[] args) {
		Banque banque = new Banque("Banque Populaire", "Casablanca");

        
        Client client1 = new Client("Ali", "Ahmed", 1);
        Client client2 = new Client("Salma", "Mohamed", 2);
        
        banque.Ajouter_client(client1);
        banque.Ajouter_client(client2);

        
        Banque.Compte compte1 = new Comptecourant(banque, client1, 1, 1000);
        Banque.Compte compte2 = new Comptecourant(banque, client2, 2, 500);

     
        banque.Ajouter_compte(compte1);
        banque.Ajouter_compte(compte2);

       
        System.out.println("Number of clients: " + banque.nb_client());
        System.out.println("Number of accounts: " + banque.nb_compte());

       
        System.out.println("Clients:");
        banque.affichier_vector_client();
        System.out.println("Accounts:");
        banque.affichier_vector_compte();

        
        compte1.deposer(500);
        compte2.retirer(200);

      
        System.out.println("Updated accounts:");
        banque.affichier_vector_compte();

       
        banque.modifier_client(1, "Ahmed", "Ali");

       
        System.out.println("Updated clients:");
        banque.affichier_vector_client();

      
        banque.Supremer_compte(2);

             System.out.println("Updated accounts:");
        banque.affichier_vector_compte();
        
        Comptecourant checkingAccount = new Comptecourant(banque, client1, 101, 5000.00);
        System.out.println("Checking account created: ");
        checkingAccount.affichier();
        
      
        checkingAccount.deposer(1000.00);
        System.out.println("\nAfter deposit: ");
        checkingAccount.affichier();
        
       
        checkingAccount.retirer(500.00);
        System.out.println("\nAfter withdrawal: ");
        checkingAccount.affichier();
        
        
        Comptedebiteur debtorAccount = new Comptedebiteur(banque, client1, 102, -1000.00);
        System.out.println("\nDebtor account created: ");
        debtorAccount.affichier();
        

        Comptedebiteur.setSeuil(-2000.00);
        
        
        debtorAccount.retirer(1500.00);
        System.out.println("\nAfter withdrawal from debtor account: ");
        debtorAccount.affichier();
        
        Comptedebiteur compte = new Comptedebiteur(banque, client1, 1, 1000);

     
        Comptedebiteur.setSeuil(500);

 
        compte.retirer(200);

       
        compte.affichier();


	}

}
