package restExemple.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hibernate.cfg.beanvalidation.IntegrationException;

import restExemple.dao.PessoaDao;
import restExemple.model.Pessoa;

@Path("/pessoas")
@Produces("application/json")
@Consumes("application/json")
public class PessoaResource {

	@EJB
	private PessoaDao pessoaDao;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Pessoa add(Pessoa p) {
		//Pessoa p = new Pessoa ();
		try {
			pessoaDao.save(p);
		} catch (IntegrationException e) {
			e.printStackTrace();
		}
		
		return p;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Pessoa update(Pessoa p) {
		try {
			pessoaDao.update(p);
		} catch (IntegrationException e) {
			e.printStackTrace();
		}
		return p;
	}
	
	
	@GET
	@Path("/list")
	public List<Pessoa> listAll() {
		return pessoaDao.listAll();
	}

	
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") String id) {
		String pessoa = pessoaDao.delete(Long.parseLong(id)).getNome();
		if(pessoa==null){
			pessoa = "Ninguem foi encontrado nem ";
		}
		
		return Response.status(200).entity(pessoa+": removido").build();
	}

	@GET
	@Path("{id}")
	public Pessoa getPessoa(@PathParam("id") String id) {
		Pessoa 	p = new Pessoa();
		try{
			p = pessoaDao.getPessoaBy(Long.parseLong(id));
			if(p == null){
				p = new Pessoa();
				p.setNome("Maluco inexistente...");
				return p;
			}
			return p;
		}catch(Exception e){
			e.printStackTrace();
		}
		return p;

	}
	

}
