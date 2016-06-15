package siw.uniroma3.model;


import java.text.ParseException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;





@Stateless(name="eFacade")
public class Facade  {

	@PersistenceContext(unitName = "clinica-unit") 
	private EntityManager em;

	public Facade(EntityManager em){
		this.em=em;
	}

	public Facade() {
	}



	//	public Esame createEsame(Date dataEsame,Paziente paziente, Medico medico, TipologiaEsame tipologia) {
	//		 Esame esame = new Esame(dataEsame,paziente,medico,tipologia); 
	//		 em.persist(esame); 
	//		 return esame;   
	//		 }


	public Medico getMedico(Long codiceMedico){

		Medico medico = this.em.find(Medico.class, codiceMedico);
		return medico;
	}


	public List<Medico> getAllMedici(){
		CriteriaQuery<Medico> cq = em.getCriteriaBuilder().createQuery(Medico.class);
		cq.select(cq.from(Medico.class));
		List<Medico> medici = em.createQuery(cq).getResultList();
		return medici;
	}

	public Esame createEsame(Date dataEsame,String paziente, Long medico, String tipologia) throws ParseException {

		Paziente p = this.em.find(Paziente.class, paziente);
		Medico m = this.em.find(Medico.class, medico);
		TipologiaEsame t = this.em.find(TipologiaEsame.class, tipologia);

		if(p == null || m == null || t == null )
			return null;

		Esame esame = new Esame(dataEsame,p,m,t); 
		m.getEsami().add(esame);
		em.persist(esame); 
		return esame;   
	}

	public Esame getEsame(Long id) {
		Esame esame = em.find(Esame.class, id);
		return esame;
	}


	public List<Esame> getAllEsami() {
		CriteriaQuery<Esame> cq = em.getCriteriaBuilder().createQuery(Esame.class);
		cq.select(cq.from(Esame.class));
		List<Esame> esami = em.createQuery(cq).getResultList();
		return esami;
	}



	public TipologiaEsame createTipologiaEsame(String codice,String nome,int costo,String descrizione) {
		TipologiaEsame tipologiaEsame = new TipologiaEsame(codice,nome,costo,descrizione); 
		em.persist(tipologiaEsame); 
		return tipologiaEsame;   
	}

	public TipologiaEsame getTipologiaEsame(String codice) {
		TipologiaEsame tipologia = em.find(TipologiaEsame.class, codice);
		return tipologia;
	}

	public List<TipologiaEsame> getAllTipologieEsami() {
		CriteriaQuery<TipologiaEsame> cq = em.getCriteriaBuilder().createQuery(TipologiaEsame.class);
		cq.select(cq.from(TipologiaEsame.class));
		List<TipologiaEsame> tipologie = em.createQuery(cq).getResultList();
		return tipologie;
	}


	public List<Esame> getAllEsami(Medico medico) {

		List<Esame> esami = this.getAllEsami();

		List<Esame> esamiMedico = new ArrayList<>();

		for(Esame esame : esami){

			if(esame.getMedico().equals(medico))
				esamiMedico.add(esame);
		}
		return esamiMedico;
	}

	public Medico createMedico(Long id,String nomeMedico, String cognomeMedico, String specializzazione) {
		Medico medico = new Medico(id,nomeMedico,cognomeMedico,specializzazione); 
		em.persist(medico); 
		return medico; 
	}



}
