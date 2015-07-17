package clasesDAO;

import interfaces.InterfazRecuperable;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dataBaseHR.Departments;
import dataBaseHR.Employees;

public class DepartmentsDAO extends SuperClaseDAO implements InterfazRecuperable{
	
	public ArrayList<Departments> obtenerDepartamentos() {
		
		DepartmentsDAO deptDAO = new DepartmentsDAO();
		Session session = null;
		Transaction trans = null;
		ArrayList<Departments> depts = null;
		try {
			session = SessionManager.obtenerSession();
			trans = session.beginTransaction();
			deptDAO.setSession(session);
			depts = deptDAO.read();
			trans.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
		finally {
			SessionManager.cerrar(session);

		}
		return depts;
	}
		
	public ArrayList<Departments> read() {
		
		ArrayList<Departments> depts = (ArrayList<Departments>) getSession().createSQLQuery("Select * from departments").addEntity(Departments.class).list();
		return depts;
	}

	public ArrayList<Employees> leerEmpleados(String id) {
		ArrayList<Employees> emps = (ArrayList<Employees>) getSession().createSQLQuery("Select * from Employees where department_id = " + id).addEntity(Employees.class).list();
		return emps;
	}

	@Override
	public Object leerEmpleado(int n) {
		// TODO Auto-generated method stub
		return null;
	}

}
