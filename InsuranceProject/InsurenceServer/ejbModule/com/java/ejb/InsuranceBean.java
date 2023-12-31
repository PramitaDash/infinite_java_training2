package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class InsuranceBean
 */
@Stateless
@Remote(InsuranceBeanRemote.class)
public class InsuranceBean implements InsuranceBeanRemote {
	
	@PersistenceContext(unitName="InsuranceMgmt")
	  private EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public InsuranceBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<InsuranceDetails> showInsurance() {
		System.out.println("Entity Manager is "+entityManager);
		Query query = entityManager.createQuery("SELECT i FROM InsuranceDetails i");
		return (List<InsuranceDetails>) query.getResultList();
	}

}
