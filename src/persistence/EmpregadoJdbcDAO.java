package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Empregado;

public class EmpregadoJdbcDAO {
	
private Connection conn;
	
	
	public EmpregadoJdbcDAO(Connection conn) {
		this.conn = conn;
	}
	
	
	public void salvar(Empregado e) throws SQLException {
		String sql = "insert into tbempregado (nome, sobrenome, CPF) values ('"+e.getNome()+"','"+e.getSobrenome()+"','"+e.getCPF()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
                prepareStatement.close();
	}
	
	public List<Empregado> listar() {
		String sql = "select * from alunos";
        System.out.println(sql);		
        List<Empregado> clientes = new ArrayList<Empregado>();
		try {
			PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			while(rs.next()) {
				String nome = rs.getString("nome");
				String sobrenome = rs.getString("sobrenome");
				String CPF = rs.getString("CPF");
				Empregado empregado = new Empregado();
				empregado.setNome(nome);
				empregado.setSobrenome(sobrenome);
				empregado.setCPF(CPF);
				
				System.out.println("***REGISTRO***");
				System.out.println(empregado.getNome());
				System.out.println(empregado.getSobrenome());
				System.out.println(empregado.getCPF());
			}
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
	
}
