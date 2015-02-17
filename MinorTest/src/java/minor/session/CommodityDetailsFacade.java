/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import minor.ejb.CommodityDetails;

/**
 *
 * @author chanakya
 */
@Stateless
public class CommodityDetailsFacade extends AbstractFacade<CommodityDetails> implements CommodityDetailsFacadeLocal {
    @PersistenceContext(unitName = "MinorTestPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CommodityDetailsFacade() {
        super(CommodityDetails.class);
    }
    
}
