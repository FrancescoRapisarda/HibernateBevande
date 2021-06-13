package corsoadecco.lez17.pace.HibernateBevande.models.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import corsoadecco.lez17.pace.HibernateBevande.models.Bevanda;

public class GestoreSessioni {

	private static GestoreSessioni ogg_gestore;
	private SessionFactory factory;

	public static GestoreSessioni getIstanza() {
		if(ogg_gestore == null) {
			ogg_gestore = new GestoreSessioni();
		}
		
		return ogg_gestore;
	}
	
	public SessionFactory getFactory() {
		if(factory == null) {
			factory = new Configuration()
					.configure("/resources/hibernate_bevanda.cfg.xml")
					.addAnnotatedClass(Bevanda.class)
					.buildSessionFactory();
		}
		
		return factory;
	}
}

