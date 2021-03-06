package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Comissionado;

public class ComissionadoJdbcDAO {
	private Connection conn;

	public ComissionadoJdbcDAO(Connection conn) {
		this.conn = conn;
	}

	public void salvar(Comissionado c) throws SQLException {
		String sql = "insert into tbComissionado(totalVendas, taxaComissao ) values ('"+c.getTotalVenda()+ "','" + c.getTaxaComissao()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}
	        
		public List<Comissionado> listar() {
			String sql = "select * from tbComissionado";
	        System.out.println(sql);
		List<Comissionado> comissionado = new ArrayList<Comissionado>();
		try {
			PreparedStatement prepareStatement1 = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement1.executeQuery();
			while (rs.next()) {

				String totalVendas = rs.getString("totalVenda");
				
				Comissionado com = new Comissionado();

				com.setTotalVenda(totalVendas);
				

				System.out.println("\n" + com.getTotalVenda());
				

				System.out.println("\n-----------------------------");

			}
			prepareStatement1.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return comissionado;
		}
		
		public void alterar(Comissionado c) throws SQLException {
			String sql = "update tbComissionado set totalVendas ='"+c.getTotalVenda()+"',taxaComissao='"+c.getTaxaComissao()+"'where idComissionado='"+c.getIdComissionado()+"';";
			System.out.println(sql);
			PreparedStatement prepareStatement;
			try {
				prepareStatement = this.conn.prepareStatement(sql);
				prepareStatement.executeUpdate();
	            prepareStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}
		
		public void excluir(int id) {
			String sql = "delete from tbComissionado where idComissionado ='"+id+"';";
			System.out.println(sql);
	        try {
	    		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
	    		prepareStatement.executeUpdate();
				prepareStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}             		
		}
}
		
