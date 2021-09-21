package connectionTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/manpower","root","sistema");
			
			Statement stm = conexion.createStatement();
			
			ResultSet rs = stm.executeQuery("SELECT alu_id , alu_apellido , alu_nombre , alu_estudios , alu_linkgit FROM alumnos");
			
			while(rs.next()) {
				
				System.out.println("apellidos = " + rs.getString("alu_nombre"));
				System.out.println(" , nombre = " + rs.getString("alu_apellido"));
				
			}
			
			conexion.close();
			rs.close();
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
