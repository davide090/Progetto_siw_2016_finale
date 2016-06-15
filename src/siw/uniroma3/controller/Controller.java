package siw.uniroma3.controller;

import java.text.ParseException;

import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.apache.commons.validator.routines.DateValidator;

import siw.uniroma3.model.Esame;
import siw.uniroma3.model.Facade;
import siw.uniroma3.model.Medico;
import siw.uniroma3.model.TipologiaEsame;


@ManagedBean
public class Controller{


	@EJB
	private Facade eFacade;



	/* Creazione Prenotazione Esame */
	private Esame esame;
	private String dataEsame;
	private String codicePaziente;
	private long codiceMedico;
	private String nomeTipologiaEsame;

	/* Creazione Tipologia Esame */
	@ManagedProperty(value="#{param.codice}")
	private String codice;
	private TipologiaEsame tipologiaEsame;
	private String nome; 
	private int costo;	
	private String descrizione;

	/* Catalogo Tipologie Esami */
	private List<TipologiaEsame> tipologieEsami;
	private List<Medico> medici;

	/* Lista Esami di un Medico */
	private Medico medico;
	private List<Esame> esamiMedico;
	private Long idEsame;
	private int numeroEsami;


	public Controller(){
	}

	public String createEsame() {

		DateValidator validator = DateValidator.getInstance();
		Date data = validator.validate(dataEsame, "dd/MM/yyyy");


		if(!validator.isValid(dataEsame))
			return "error.jsp";
		try {

			if(this.eFacade.createEsame(data, codicePaziente, codiceMedico, nomeTipologiaEsame) == null)
				return "error.jsp";

			this.esame = this.eFacade.createEsame(data, codicePaziente, codiceMedico, nomeTipologiaEsame);

			return "esameCreato.jsp";

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error.jsp";
		}
	}


	public String getAllMedici(){
		this.medici = this.eFacade.getAllMedici();
		return "amministrazione.jsp";
	}

	public String createTipologiaEsame(){
		this.tipologiaEsame = this.eFacade.createTipologiaEsame(codice, nome, costo, descrizione);
		return "tipologiaEsameCreata.jsp";
	}

	public String findTipologiaEsame(){
		this.tipologiaEsame = this.eFacade.getTipologiaEsame(codice);
		return "tipologiaEsame.jsp";
	}

	public String getAllTipologieEsami(){
		this.tipologieEsami = this.eFacade.getAllTipologieEsami();
		return "catalogoTipologieEsamiDisponibili.jsp";
	}

	//	public String findEsame(){
	//		this.esame = this.eFacade.getEsame(idMedico);
	//		return "esame.jsp";
	//	}

	public String findMedico(){

		if(	this.eFacade.getMedico(codiceMedico) == null)
			return "medicoNotFound.jsp";

		this.medico = this.eFacade.getMedico(codiceMedico);
		this.esamiMedico = this.eFacade.getAllEsami(medico);
		this.numeroEsami = this.esamiMedico.size();


		return "listaEsamiMedico.jsp";
	}

	public List<Esame> getAllEsami() {
		return this.eFacade.getAllEsami();
	}


	// Getters & Setters

	public Facade geteFacade() {
		return eFacade;
	}

	public void seteFacade(Facade eFacade) {
		this.eFacade = eFacade;
	}

	public Esame getEsame() {
		return esame;
	}

	public void setEsame(Esame esame) {
		this.esame = esame;
	}

	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}

	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}

	public List<TipologiaEsame> getTipologieEsami() {
		return tipologieEsami;
	}

	public void setTipologieEsami(List<TipologiaEsame> tipologieEsami) {
		this.tipologieEsami = tipologieEsami;
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


	public int getCosto() {
		return costo;
	}


	public void setCodiceMedico(long codiceMedico) {
		this.codiceMedico = codiceMedico;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public List<Medico> getMedici() {
		return medici;
	}


	public void setMedici(List<Medico> medici) {
		this.medici = medici;
	}




	public List<Esame> getEsamiMedico() {
		return esamiMedico;
	}


	public Long getIdEsame() {
		return idEsame;
	}


	public void setIdEsame(Long idEsame) {
		this.idEsame = idEsame;
	}

	public void setEsamiMedico(List<Esame> esamiMedico) {
		this.esamiMedico = esamiMedico;
	}


	public int getNumeroEsami() {
		return numeroEsami;
	}



	public void setNumeroEsami(int numeroEsami) {
		this.numeroEsami = numeroEsami;
	}

	public String getCodicePaziente() {
		return codicePaziente;
	}



	public void setCodicePaziente(String codicePaziente) {
		this.codicePaziente = codicePaziente;
	}



	public String getNomeTipologiaEsame() {
		return nomeTipologiaEsame;
	}



	public void setNomeTipologiaEsame(String nomeTipologiaEsame) {
		this.nomeTipologiaEsame = nomeTipologiaEsame;
	}



	public Long getCodiceMedico() {
		return codiceMedico;
	}

	public String getDataEsame() {
		return dataEsame;
	}



	public void setDataEsame(String dataEsame) {
		this.dataEsame = dataEsame;
	}

	public void setCodiceMedico(Long codiceMedico) {
		this.codiceMedico = codiceMedico;
	}



}