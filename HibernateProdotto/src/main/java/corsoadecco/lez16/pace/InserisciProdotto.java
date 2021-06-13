package corsoadecco.lez16.pace;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import corsoadecco.lez16.pace.models.Prodotto;

public class InserisciProdotto {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("/resources/hibernate_prodotto.cfg.xml")
				.addAnnotatedClass(Prodotto.class)
				.buildSessionFactory();
		
		Session sessione = factory.getCurrentSession();
		
		try {			
			Prodotto kinderBrioss = new Prodotto("KB123420", "Kinder Brioss", 2.55f);
			Prodotto kinderFAL = new Prodotto("KFAL123450", "Kinder Fetta A Latte", 2.80f);
			Prodotto kinderDelice = new Prodotto("KD123440", "Kinder Delice", 2.90f);
			
			sessione.beginTransaction();
			
			sessione.save(kinderBrioss);
			sessione.save(kinderFAL);
			sessione.save(kinderDelice);
			
			sessione.getTransaction().commit();
			
			System.out.println(kinderBrioss.toString());
			System.out.println(kinderFAL.toString());
			System.out.println(kinderDelice.toString());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			sessione.close();
		}
		

	}

}
