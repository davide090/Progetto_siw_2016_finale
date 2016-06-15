package siw.uniroma3.model;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQuery(name = "findAllMedici", query = "SELECT p FROM Medico p")
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	@Column
	private String specializzazione;
	
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "medico_id")
	private List<Esame> esami;
	
	public Medico(){
		this.esami = new ArrayList<Esame>();
	}
	
	public Medico(Long id,String nome, String cognome, String specializzazione){
		
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.specializzazione = specializzazione;
		this.esami = new ArrayList<Esame>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public int hashCode(){
		return this.getId().hashCode();
	}
	
	@Override
	public boolean equals(Object o){
		Medico medico = (Medico)o;
		return this.getId().equals(medico.getId());
	}

}
