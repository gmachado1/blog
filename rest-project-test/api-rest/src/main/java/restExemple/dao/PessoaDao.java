package restExemple.dao;

import java.util.List;

import javax.ejb.Local;

import restExemple.model.Pessoa;

@Local
public interface PessoaDao {
	
	Pessoa getPessoaBy(Long id);
	
	public List<Pessoa> listAll();
	
	public Pessoa delete(Long id);
	
	public Pessoa save(Pessoa pessoa);

	public Pessoa update(Pessoa pessoa);

}
