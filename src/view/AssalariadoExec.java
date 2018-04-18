package view;

import java.sql.Connection;
import model.Assalariado;
import persistence.AssalariadoJdbcDAO;
import persistence.ConnectionClass;

public class AssalariadoExec {
	public static void main (String args[]) {
	
		Assalariado assalariado = new Assalariado();
	
		try {	
	
		assalariado.setSalario("1500.00");
		
		Connection connection = ConnectionClass.getConnection();
		AssalariadoJdbcDAO AssalariadoJdbcDao = new AssalariadoJdbcDAO(connection);
		
		
		AssalariadoJdbcDao.salvar(assalariado);
		AssalariadoJdbcDao.listar();
		AssalariadoJdbcDao.alterar(assalariado);
		AssalariadoJdbcDao.excluir(1);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}