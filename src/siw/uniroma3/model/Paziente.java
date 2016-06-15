package siw.uniroma3.model;

import java.util.ArrayList;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"nome","cognome"}))
@NamedQuery(name = "findAllPazienti", query = "SELECT p FROM Paziente p")
public class Paziente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String cognome;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE},fetch = FetchType.EAGER)
	@JoinColumn(name = "paziente_id")
	private List<Esame> esami;
	
	public Paziente(){
		this.esami = new ArrayList<>();
	}
	
	public Paziente(String nome, String cognome, List<Esame> esami){
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.esami = esami;
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

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	public Long getId() {
		return id;
	}
	
	public void addEsame(Esame esame){
		this.esami.add(esame);
	}
	
	@Override
	public int hashCode(){
		return this.getId().hashCode();
	}
	
	@Override
	public boolean equals(Object o){
		Paziente paziente = (Paziente)o;
		if(this.getId()!= null && this.getId() == paziente.getId())
			return true;
		else if(this.getNome() == paziente.getNome() && this.getCognome() == paziente.getCognome())
			return true;
		else return false;
	}
}
