package corsoadecco.lez17.pace.HibernateBevande.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bevanda")
public class Bevanda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_bevanda")
	private int id;
	
	@Column(name="codice")
	private String codice;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="volume")
	private Float volume;
	
	
	//COSTRUTTORE
	public Bevanda() {
		
	}


	//COSTRUTTORE CON P.
	public Bevanda(String codice, String nome, Float volume) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.volume = volume;
	}
	
	
	
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		this.codice = codice;
	}


	public Float getVolume() {
		return volume;
	}


	public void setVolume(Float volume) {
		this.volume = volume;
	}


	//TO STRING
	@Override
	public String toString() {
		return "Bevanda [id=" + id + ", codice=" + codice + ", nome=" + nome + ", volume=" + volume + "]";
	}	

}
