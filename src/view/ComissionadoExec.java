package view;

import java.sql.Connection;
import model.Comissionado;
import persistence.ComissionadoJdbcDAO;
import persistence.ConnectionClass;

public class ComissionadoExec {
	public static void main (String args[]) {
		Comissionado comissionado = new Comissionado();
		try {	
		
			comissionado.setTotalVenda("677.5");
			comissionado.setTaxaComissao("8");
			
			Connection connection = ConnectionClass.getConnection();
			ComissionadoJdbcDAO ComissionadoJdbcDao = new ComissionadoJdbcDAO(connection);
			
			ComissionadoJdbcDao.salvar(comissionado);
			ComissionadoJdbcDao.listar();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}