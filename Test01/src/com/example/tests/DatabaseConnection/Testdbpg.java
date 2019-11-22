package com.example.tests.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author postgresqltutorial.com
 */
public class Testdbpg {
	public String idcusto = null;
	public String[] listFilhoCusto = new String [80];
	public String[] listaFila = new String[80];
    public int asfilhos=1;
    public int asfilas=0;
    public String rsnull= "null";


    private final String url = "jdbc:postgresql://10.3.0.208:5432/ncall";
    private final String user = "sa_ncall";
    private final String password = "@%NcalL%@";

	/**
	 * Connect to the PostgreSQL database
	 *
	 * @return a Connection object
	 * @throws java.sql.SQLException
	 */
	public Connection connect() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

		
	
	/**
	 * get ID's dos filhos do centro de custo
	 */
		public void getFilhoCusto (String ccName) {

		int i = 0;
		
		////// Get ID Centro de custo pelo o var ccName
		String SQL = "SELECT id FROM custo WHERE nome ='" + ccName + "'";
		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {	
			listFilhoCusto[0] = rs.getString("id");
			i=i+1;
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			}		
		//////
		
		////// Get ID's dos filhos de ID "ccName"
		String SQLPAI = "SELECT id FROM custo WHERE idpai ='" + listFilhoCusto[0] + "'";

		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQLPAI)) {
		ResultSet rs = pstmt.executeQuery();

		while( rs.next() ) {
			
			listFilhoCusto[i] = rs.getString("id");
			System.out.println("id centro de custo filho:" +  listFilhoCusto[i] );
			i=i+1;
			asfilhos= i;

		}
		rs.close();
		for (int d=1; d< asfilhos;) {
			getFilhoId(listFilhoCusto[d]);
			
			d = d +1;
		}
		
		}catch (SQLException ex) {
			System.out.println(ex.getMessage());
			}
		//////
		}
	
		//////
		public void getFilhoId (String filhoId) {


			String result = filhoId;	

			String SQLPAI1 = "SELECT id FROM custo WHERE idpai ='" + Integer.parseInt(result) + "'";
			try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQLPAI1)) {
			ResultSet rs  = pstmt.executeQuery();
				
				while( rs.next() ) {
					listFilhoCusto[asfilhos] = rs.getString("id");
					System.out.println("id centro de custo filhos dos filhos:" +  listFilhoCusto[asfilhos] );

					asfilhos=asfilhos+1;
				}
				
				rs.close();
			
			}catch (SQLException ex) {
				System.out.println(ex.getMessage());
				}
//		}
		}

		//////
		
	/**
	* Esse Função para obter "ID's e nome das filas" pelo usar o função "getFilhoCusto"
	*/		
		public void getFIlaNome (String ccName, int tipoFila) {
			
		getFilhoCusto(ccName);
		for ( int k=0; k < asfilhos; k++ )
		{
			
		
		String SQL = "SELECT id, name FROM fila WHERE cc ='" + listFilhoCusto[k] + "' AND tipofila = '" + tipoFila + "'";
		
		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
			ResultSet rs = pstmt.executeQuery();
//			String[] listaFila = new String[80];

			while (rs.next()) {
			listaFila[asfilas] =  rs.getString("name") + " - " + rs.getString("id");
			System.out.println(listaFila[asfilas]);
			asfilas=asfilas+1;
			System.out.println("-------------");
			}

			
//			System.out.println(idcusto);
			
			//displayActor(rs);
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		}
	}
	

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Testdbpg main = new Testdbpg();
//		main.centroCusto("Nexacore");
		main.getFIlaNome("Raiz", 2);
//		main.getFilhoCusto("Raiz");
	}
}