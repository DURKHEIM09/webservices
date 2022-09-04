package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/*import java.sql.ResultSet;
import java.util.ArrayList;*/

public class DAO {
	/** Módulo de conxao **/
	// parametros de conexao
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:musql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";

	private String user = "root";
	private String password = "22071998";

	// método de conexao
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/** CRUD CREATE **/
	public void inserirContato(JavaBeans contato) {
		String create = "insert into contatos (nome,ra,email) values (?,?,?)";
		try {
			// abrir a conexao
			Connection con = conectar();
			// Preparar a query para execuçao no banco
			PreparedStatement pst = con.prepareStatement(create);
			// Substituir os parametros (?) pelo conteúdo das Variáveis
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getRa());
			pst.setString(3, contato.getEmail());

			// executar a query
			pst.executeUpdate();
			// encerrar a conexao com o banco
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** CRUD READ **/
	/*
	 * public ArrayList<JavaBeans> listarContatos() { // Criando um objeto para
	 * acessar a classe JavaBeans ArrayList<JavaBeans> contatos = new ArrayList<>();
	 * String read = "select * from contatos order by nome"; try { Connection con =
	 * conectar(); PreparedStatement pst = con.prepareStatement(read); ResultSet rs
	 * = pst.executeQuery(); // o laço abaixo será executado enquanto houver
	 * contatos while (rs.next()) { // variaveis de apoio que recebem os dados do
	 * banco String idcon = rs.getString(1); String nome = rs.getString(2); String
	 * ra = rs.getString(3); String email = rs.getString(4);
	 * 
	 * // populando o arraulist contatos.add(new JavaBeans( idcon, nome, ra,
	 * email));
	 * 
	 * } con.close(); return contatos;
	 * 
	 * } catch (Exception e) { System.out.println(e); return null;
	 */

}
