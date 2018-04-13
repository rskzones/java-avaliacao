package view;

import java.sql.Connection;

import persistence.HoristaJdbcDAO;
import persistence.ConnectionClass;

import model.Horista;

public class HoristaExec {
	public static void main (String args[]) {
		
		Horista horista = new Horista();
		
		try {	
		
			horista.setHorasTrabalhadas("100");
			horista.setPrecoHora("1095");
			
			Connection connection = ConnectionClass.getConnection();
			HoristaJdbcDAO horistaJdbcDao = new HoristaJdbcDAO(connection);
			
			horistaJdbcDao.salvar(horista);
			horistaJdbcDao.listar();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}