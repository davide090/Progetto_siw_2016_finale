package siw.uniroma3.model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"nome"}))
@NamedQuery(name = "findAllTipologieEsami", query = "SELECT p FROM TipologiaEsame p")
public class TipologiaEsame {


	@Id
	@Column(name = "codice")
	private String codice;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private int costo;

	@Column
	private String descrizione;

	@ElementCollection
	private Map<String,String> prerequisiti;

	@ElementCollection
	private List<String> indicatoriRisultati;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "tipologiaEsame_codice")
	private List<Esame> esami;




	public TipologiaEsame(){
		this.esami = new ArrayList<>();
	}

	public TipologiaEsame(String codice,String nome, int costo, String descrizione){

		this.codice = codice;
		this.costo = costo;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prerequisiti = new HashMap<>();
		this.esami = new ArrayList<>();
		this.indicatoriRisultati = new ArrayList<>();
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
	
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public Map<String, String> getPrerequisiti() {
		return prerequisiti;
	}

	public void setPrerequisiti(Map<String, String> prerequisiti) {
		this.prerequisiti = prerequisiti;
	}

	public List<String> getIndicatoriRisultati() {
		return indicatoriRisultati;
	}


	public void setIndicatoriRisultati(List<String> indicatoriRisultati) {
		this.indicatoriRisultati = indicatoriRisultati;
	}

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	@Override
	public int hashCode(){
		return this.getCodice().hashCode();
	}

	@Override
	public boolean equals(Object o){
		TipologiaEsame tipologiaEsame = (TipologiaEsame)o;
		return this.getCodice() == tipologiaEsame.getCodice();
	}
}
