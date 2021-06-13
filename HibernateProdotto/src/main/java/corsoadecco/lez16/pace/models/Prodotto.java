package corsoadecco.lez16.pace.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prodotto")
public class Prodotto {
	
	@Id															//Dice ad Hibernate che si tratta di una PK!
	@GeneratedValue(strategy = GenerationType.IDENTITY)			//IDENTITY è la strategia di generazione degli ID AUTO_INCREMENT su MySQL!
	@Column(name="id_prodotto")
	private int id;
	
	@Column(name="codice")										//potrei evitare di inserire il (name=...) perchè l'attributo ha lo stesso nome della colonna su mySQL!
	private String codice;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="prezzo")
	private Float prezzo;
	
	
	//COSTRUTTORE
	public Prodotto() {
		
	}
	
	
	//COSTRUTTORE CON PARAMETRI
	public Prodotto(String codice, String nome, Float prezzo) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
	}
	

	
	
	//GETTERS AND SETTERS

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		this.codice = codice;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Float getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}



	
	//TO STRING
	@Override
	public String toString() {
		return "Prodotto [id=" + id + ", codice=" + codice + ", nome=" + nome + ", prezzo=" + prezzo + "]";
	}

}
