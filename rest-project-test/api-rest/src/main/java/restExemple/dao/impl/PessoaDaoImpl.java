package restExemple.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.cfg.beanvalidation.IntegrationException;

import restExemple.dao.PessoaDao;
import restExemple.model.Pessoa;

@Stateless
public class PessoaDaoImpl implements PessoaDao{
	 
	@PersistenceContext
    private EntityManager em;

	@Override
	public Pessoa getPessoaBy(Long id) {
		Pessoa p = em.find(Pessoa.class, id);
		return p;
	}

	@Transactional
	public List<Pessoa> listAll() {
		TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.selectAll", Pessoa.class);
        return query.getResultList();
	}

	@Override
	public Pessoa delete(Long id) {
		Pessoa p = em.find(Pessoa.class, id);
		if(p!= null){
			em.remove(p);
			return p;
		}
		return new Pessoa();
	}

	@Override
	public Pessoa save(Pessoa pessoa) {
		try{
			em.persist(pessoa);
		}catch(IntegrationException e){
			e.getMessage();
		}
		
		return pessoa;
	}
	
	@Override
	public Pessoa update(Pessoa pessoa) {
		try{
			em.merge(pessoa);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return pessoa;
	}
}
