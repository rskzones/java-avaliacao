package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Assalariado;



public class AssalariadoJdbcDAO {
	private Connection conn;

	public AssalariadoJdbcDAO(Connection conn) {
		this.conn = conn;
	}

	public void salvar(Assalariado a) throws SQLException {
		String sql = "insert into assalariado(salario) values ('"+a.getSalario()+"')";
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}
	public List<Assalariado> listar() {
		String sql = "select * from assalariado";
	    System.out.println(sql);
		List<Assalariado> Assalariado = new ArrayList<Assalariado>();
		try {
			PreparedStatement prepareStatement1 = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement1.executeQuery();
			while (rs.next()) {

				String salario = rs.getString("Salario");
				
				Assalariado assalariado = new Assalariado();

				assalariado.setSalario(salario);
				

				System.out.println("\n" + assalariado.getSalario());
				

				System.out.println("\n------------------------------");

			}
			prepareStatement1.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*public void alterar(Assalariado c) throws SQLException {
			String sql = "update tb_clientes set nome='"+c.getNome()+"',endereco='"+c.getEndereco()+"',fone='"+c.getFone()+"',email='"+c.getEmail()+"' where id_cliente='"+c.getId_cliente()+"';";
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
			String sql = "delete from tb_clientes where id_cliente='"+id+"';";
			System.out.println(sql);
	        try {
	    		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
	    		prepareStatement.executeUpdate();
				prepareStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}             */   		
		
		return Assalariado;
	}
}
