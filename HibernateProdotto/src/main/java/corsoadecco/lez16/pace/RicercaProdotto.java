package corsoadecco.lez16.pace;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import corsoadecco.lez16.pace.models.Prodotto;

public class RicercaProdotto {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration()
				.configure("/resources/hibernate_prodotto.cfg.xml")
				.addAnnotatedClass(Prodotto.class)
				.buildSessionFactory();
		
		Session sessione = factory.getCurrentSession();
		
		try {
			
			//Codice per prendere TUTTO il contenuto della tabella mappata con la classe
//			sessione.beginTransaction();
//			
//			int idRicercato = 1;
//			Prodotto temp = sessione.get(Prodotto.class, idRicercato);
//			
//			sessione.getTransaction().commit();
//			
//			System.out.println(temp.toString());
			
			
			//Codice SQL per il reperimento di un solo campo della tabella!
			sessione.beginTransaction();
			
			String nomeProdotto = (String) sessione.createQuery("SELECT nome FROM Prodotto WHERE id = 2").uniqueResult();
			System.out.println(nomeProdotto);
			
			sessione.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}

	}

}
