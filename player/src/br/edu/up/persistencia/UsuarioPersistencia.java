package br.edu.up.persistencia;
import br.edu.up.entidades.Usuario;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
public class UsuarioPersistencia {
    public static boolean incluir(Usuario usuario){
		try{
			EntityManager manager = EntityManagerFactory.getInstance();
			manager.getTransaction().begin();
			manager.persist(usuario);
			manager.getTransaction().commit();
			return true;			
		}
		catch(Exception e){
			return false;
		}
	}
    public static boolean alterar(Usuario usuario){
		try{
			EntityManager manager = EntityManagerFactory.getInstance();
			manager.getTransaction().begin();
			manager.persist(usuario);
			manager.getTransaction().commit();
			return true;			
		}
		catch(Exception e){
			return false;
		}
	}
    public static boolean excluir(Usuario usuario){
		try{
			EntityManager manager = EntityManagerFactory.getInstance();
			manager.getTransaction().begin();
			manager.remove(usuario);
			manager.getTransaction().commit();
			return true;			
			
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
    }
    public static Usuario procurarPorCPF(Usuario usuario){
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from usuario where cpf = :param");
		consulta.setParameter("param", usuario.getCpf());
		List<Usuario> usuarios = consulta.getResultList();
		if(!usuarios.isEmpty()){
			return usuarios.get(0);
		}
		return null;
	}
    public static Usuario procurarPorNome(Usuario usuario){
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from usuario where nome = :param");
		consulta.setParameter("param", usuario.getNome());
		List<Usuario> usuarios = consulta.getResultList();
		if(!usuarios.isEmpty()){
			return usuarios.get(0);
		}
		return null;
	}
	public static Usuario procurarPorId(Usuario usuario){
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from usuario where id = :param");
		consulta.setParameter("param", usuario.getId());
		List<Usuario> usuarios = consulta.getResultList();
		if(!usuarios.isEmpty()){
			return usuarios.get(0);
		}
		return null;
	}
	public static List<Usuario> getUsuarios(Usuario usuario){
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from usuario where nome like :param");
		consulta.setParameter("param", "%" + usuario.getNome() + "%");
		List<Usuario> usuarios = consulta.getResultList();
		return usuarios;
	}
}
