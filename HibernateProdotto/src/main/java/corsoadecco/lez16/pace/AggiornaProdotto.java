package corsoadecco.lez16.pace;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import corsoadecco.lez16.pace.models.Prodotto;

public class AggiornaProdotto {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration()
				.configure("/resources/hibernate_prodotto.cfg.xml")
				.addAnnotatedClass(Prodotto.class)
				.buildSessionFactory();
		
		Session sessione = factory.getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			int idRicercato = 1;
			Prodotto temp = sessione.load(Prodotto.class, idRicercato); 	//Caricamento certo, se non lo trovo vado in Exception!
			
			temp.setNome("Kinder deliziosa");
			temp.setCodice("KD123456");
			
			sessione.save(temp);
			
			sessione.getTransaction().commit();
			
			System.out.println(temp.toString());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
	}

}
