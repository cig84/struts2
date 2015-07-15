package clasesDAO;


import org.hibernate.Session;

/**
 * 
 * @author Francesco
 *Esta clase es una superclase que implementa una sesión y los métodos getSession() y setSession() que
 *devuelven y setean una nueva sesión para el objeto llamante.
 *Las clases que implementen esta superclase pueden llamar a estos métodos cuando necesiten de una
 *nueva sesión.
 *
 */

public class SuperClaseDAO {
	

	private Session session;

	public Session getSession() {

		return session;
	}

	public void setSession(Session session) {
		this.session = session;

	}

}
