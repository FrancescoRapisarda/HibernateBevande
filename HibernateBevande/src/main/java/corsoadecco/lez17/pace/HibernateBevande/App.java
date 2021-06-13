package corsoadecco.lez17.pace.HibernateBevande;

import java.util.List;

import corsoadecco.lez17.pace.HibernateBevande.models.Bevanda;
import corsoadecco.lez17.pace.HibernateBevande.models.crud.BevandaDAO;

public class App 
{
    public static void main( String[] args )
    {
     
    	BevandaDAO bevDao = new BevandaDAO();
    	
    	//INSERT
    	
//    	Bevanda redbull = new Bevanda("RB123456", "Redbull", 0.75f);
//		Bevanda levissima = new Bevanda("LV123456", "Levissima", 1.00f);
//		Bevanda lemonsoda = new Bevanda("LS123456", "Lemonsoda", 0.33f);
//		
//		bevDao.insert(redbull);
//		bevDao.insert(levissima);
//		bevDao.insert(lemonsoda);
    	
    	
    	
    	//FIND BY ID
    	
//    	Bevanda ricercatoUno = bevDao.findById(2);
//    	System.out.println(ricercatoUno);
    	
    	
    	
    	//REMOVE
    	
//    	if(bevDao.delete(1)) {
//    		System.out.println("Tutto ok!");
//    	} else {
//    		System.out.println("Errore ;(");
//    	}
    	
    	
    	
    	//UPDATE
    	
//    	Bevanda bevandaUno = bevDao.findById(2);
//    	bevandaUno.setCodice("UV123456");
//    	bevandaUno.setNome("Uliveto");
//    	bevandaUno.setVolume(0.75f);
//    	
//    	
//    	if(bevDao.update(bevandaUno)) {
//    		System.out.println("Tutto ok!");
//    	} else {
//    		System.out.println("Errore ;(");
//    	}
    	
    	
    	
    	//FINDALL
    	
    	List<Bevanda> elencoBevande = bevDao.findAll();
    	
    	for(int i=0; i<elencoBevande.size(); i++) {
    		Bevanda temp = elencoBevande.get(i);
    		System.out.println(temp);
    	}
    	
    }
}
