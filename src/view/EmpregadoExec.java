package view;

import java.sql.Connection;

import model.Empregado;
import persistence.EmpregadoJdbcDAO;
import persistence.ConnectionClass;

public class EmpregadoExec {
	public static void main (String args[]) {
		Empregado empregado = new Empregado();
		try {	
		
			empregado.setNome("João");
			empregado.setSobrenome("Marcelo");
			empregado.setCPF("000.000.000-00");
			
			
			Connection connection = ConnectionClass.getConnection();
			EmpregadoJdbcDAO EmpregadoJdbcDao = new EmpregadoJdbcDAO(connection);
			
			EmpregadoJdbcDao.salvar(empregado);
			EmpregadoJdbcDao.listar();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
