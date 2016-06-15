package siw.uniroma3.model;

import java.util.Map;


import java.text.ParseException;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.HashMap;

@Entity
@Table(name = "Esame")
@NamedQuery(name = "findAllEsami", query = "SELECT p FROM Esame p")
public class Esame {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	@Temporal(TemporalType.DATE)
	private Date dataPrenotazione;

	@Column
	@Temporal(TemporalType.DATE)
	private Date dataEsame;

	@ManyToOne (cascade = {CascadeType.ALL})
	private Paziente paziente;

	@ManyToOne (cascade = {CascadeType.ALL})
	private Medico medico;

	@ManyToOne (cascade = {CascadeType.ALL})
	private TipologiaEsame tipologiaEsame;

	@ElementCollection
	private Map<String,String> risultati;

	public Esame(){
		this.dataPrenotazione = new java.util.Date();
	}

	public Esame(Date dataEsame,Paziente paziente, Medico medico, TipologiaEsame tipologia) throws ParseException{

		this.dataPrenotazione = new Date();
		this.dataEsame = dataEsame;
		this.risultati = new HashMap<>();
		this.paziente = paziente;
		this.medico = medico;
		this.tipologiaEsame = tipologia;

	}

	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	public Date getDataEsame() {
		return dataEsame;
	}

	public void setDataEsame(Date dataEsame) {
		this.dataEsame = dataEsame;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}

	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}

	public Map<String, String> getRisultati() {
		return risultati;
	}

	public void setRisultati(Map<String, String> risultati) {
		this.risultati = risultati;
	}


	public Long getId() {
		return id;
	}

	public boolean equals(Object o){
		Esame esame = (Esame)o;
		return this.getId().equals(esame.getId());
	}
	
	public  int hashCode(){
		return this.dataEsame.hashCode();
	}
}
