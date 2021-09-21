package es.com.manpower.notas.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import es.com.manpower.notas.modelo.Alumno;
import es.com.manpower.notas.modelo.Model;
import es.com.manpower.notas.util.ConnectionManager;

public class AlumnoDAO implements DAO {

	private Connection con;
	
	@Override
	public void agregar(Model mdl) {
		Alumno alumno = (Alumno)mdl;
		
		try {
			ConnectionManager.conectar();
		    con = ConnectionManager.getConnection();
			
			StringBuilder sql = new StringBuilder("INSERT INTO alumnos (ALU_NOMBRE,ALU_APELLIDO,ALU_ESTUDIOS,ALU_LINKGIT)VALUES"); 
			sql.append("? , ? , ? , ?");
			
			PreparedStatement psfw = con.prepareStatement(sql.toString());
			psfw.setString(1, alumno.getNombre());
			psfw.setString(2, alumno.getApellido());
			psfw.setString(3,alumno.getEstudios());
			psfw.setString(4,alumno.getGit());
			
			psfw.executeUpdate();
			
			ConnectionManager.desconectar();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void modificar(Model mdl) throws SQLException, ClassNotFoundException {
		
		Alumno alMod = (Alumno)mdl;
		
		
			ConnectionManager.conectar();
			con = ConnectionManager.getConnection();
			
			StringBuilder sql = new StringBuilder("update alumnos set ALU_NOMBRE = ? , ALU_APELLIDO = ? , ALU_ESTUDIOS = ? , ALU_LINKGIT = ? where ALU_ID = ?");
			
			PreparedStatement pe = con.prepareStatement(sql.toString());
			pe.setString(1, alMod.getNombre());
			pe.setString(2, alMod.getApellido());
			pe.setString(3, alMod.getEstudios());
			pe.setString(4, alMod.getGit());
			pe.setInt(5, alMod.getCodigo());
			
			ConnectionManager.desconectar();
		

	}

	@Override
	public void eliminar(Model mdl) throws SQLException, ClassNotFoundException {
		
		Alumno alMod = (Alumno)mdl;
		
			ConnectionManager.conectar();
			con = ConnectionManager.getConnection();
			
			StringBuilder sql = new StringBuilder("delete from alumnos where ALU_ID = ?");
			
			PreparedStatement pe = con.prepareStatement(sql.toString());
			pe.setInt(1, alMod.getCodigo());
			
			ConnectionManager.desconectar();
			

	}

	@Override
	public List<Model> leer(Model mdl) {
		// TODO Auto-generated method stub
		return null;
	}

}
