/*package musuario;


import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;

import sun.util.calendar.BaseCalendar.Date;


@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
@ManagedBean(name="ManejadorUsuario")
@javax.persistence.PersistenceContext(unitName="SuperBet_UNIT" )

@SessionScoped
public class ManejadorUsuario  {
	public String usuario;
	public String contrasena;

    public ManejadorUsuario() {
        // TODO Auto-generated constructor stub
    }
    public String login(){
    	
    	return usuario.concat(contrasena);
    }
	
    private javax.persistence.EntityManager em;   
	
    public void NuevoUsuario(String login, String pass, String nom, String ape, Date fecnac){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Usuario");

 	    	
    	Usuario usuario=new Usuario();
    	usuario.setLogin(login);
    	usuario.setPassword(pass);
    	usuario.setNombre(nom);
    	usuario.setApellido(ape);
    	usuario.setFechaNac(fecnac);
    	em.persist(usuario);
    }
    

}
*/