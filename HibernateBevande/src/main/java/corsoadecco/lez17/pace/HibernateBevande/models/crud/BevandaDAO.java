package corsoadecco.lez17.pace.HibernateBevande.models.crud;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import corsoadecco.lez17.pace.HibernateBevande.models.Bevanda;
import corsoadecco.lez17.pace.HibernateBevande.models.db.GestoreSessioni;

public class BevandaDAO implements Dao<Bevanda> {

	
	@Override
	public void insert(Bevanda t) {

		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			sessione.beginTransaction();
			sessione.save(t);
			sessione.getTransaction().commit();
			System.out.println(t.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
	}

	@Override
	public Bevanda findById(int id) {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();

		try {
			sessione.beginTransaction();
			
			Bevanda temp = sessione.get(Bevanda.class, id);
			
			sessione.getTransaction().commit(); 

			return temp;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return null;
	}

	
	@Override
	public List<Bevanda> findAll() {

		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();

		try {
			sessione.beginTransaction();
			
			TypedQuery<Bevanda> bev = sessione.createQuery("FROM Bevanda", Bevanda.class);
			List<Bevanda> elenco = bev.getResultList();
//			List<Bevanda> elenco = sessione.createQuery("FROM Bevanda").list();
			
			sessione.getTransaction().commit(); 
			
			return elenco; 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			return null;
		} finally {
			sessione.close();
		}
	}

	
	@Override
	public boolean delete(int id) {

		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();

		try {
			sessione.beginTransaction();
			
			//.get(...)				Cerca l'oggetto, se non esiste restituisce NULL
			//.load(...)			Cerca l'oggetto, se non esiste va in EXCEPTION

			Bevanda temp = sessione.load(Bevanda.class, id);
			sessione.delete(temp);
			
			sessione.getTransaction().commit(); 
			
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			sessione.close();
		}
	}
	

	@Override
	public boolean delete(Bevanda t) {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();

		try {
			sessione.beginTransaction();
			
			sessione.delete(t);
			
			sessione.getTransaction().commit(); 
			
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			sessione.close();
		}
	}

	
	@Override
	public boolean update(Bevanda t) {
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();

		try {
			sessione.beginTransaction();
			
//			int id = t.getId();											//id del bevanda inserito nel metodo
//			Prodotto temp = sessione.load(Prodotto.class, id);			//Bevanda sul DB che devo modificare
//			
//			temp.setNome(t.getNome());
//			temp.setCodice(t.getCodice());
//			temp.setPrezzo(t.getPrezzo());
//			
//			sessione.update(temp);
			
			sessione.update(t);
			
			sessione.getTransaction().commit(); 
			
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			sessione.close();
		}
	
	}
}
