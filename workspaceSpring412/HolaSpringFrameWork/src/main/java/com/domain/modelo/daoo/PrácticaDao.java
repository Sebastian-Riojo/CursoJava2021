package com.domain.modelo.daoo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.domain.modelo.*;
import com.domain.util.*;

public class PrácticaDao implements DAO{

	private Connection con;
	
	@Override
	public void agregar(Model mdl) throws ClassNotFoundException, SQLException {
		
		Practica pr = (Practica) mdl;
		
		try {
			ConnectionManager.conectar();
		    con = ConnectionManager.getConnection();
			
			StringBuilder sql = new StringBuilder("INSERT INTO practicas (PRAC_NOMBRE) VALUES("); 
			sql.append("?)");
			
			PreparedStatement psfw = con.prepareStatement(sql.toString());
			psfw.setString(1, pr.getPracticaNombre());
			
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
	public void modificar(Model mdl) throws ClassNotFoundException, SQLException {
		
		Practica pr = (Practica) mdl;
		
		
		ConnectionManager.conectar();
		con = ConnectionManager.getConnection();
		
		StringBuilder sql = new StringBuilder("update practicas set PRAC_NOMBRE = ? where PRAC_ID = ?");
		
		PreparedStatement pe = con.prepareStatement(sql.toString());
		pe.setString(1, pr.getPracticaNombre());
		pe.setInt(2, pr.getPracticaID());
		
		pe.executeUpdate();
		ConnectionManager.desconectar();
		
	}

	@Override
	public void eliminar(Model mdl) throws ClassNotFoundException, SQLException {
		
		Practica pr = (Practica) mdl;
		
		ConnectionManager.conectar();
		con = ConnectionManager.getConnection();
		
		StringBuilder sql = new StringBuilder("delete from practicas where PRAC_ID = ?");
		
		PreparedStatement pe = con.prepareStatement(sql.toString());
		pe.setInt(1, pr.getPracticaID());
		
		pe.executeUpdate();
		ConnectionManager.desconectar();
		
	}

	@Override
	public List<Model> leer(Model mdl) throws ClassNotFoundException, SQLException {
		
		Practica pr = (Practica) mdl;
		List<Model> practicas = new ArrayList<Model>();
		
		ConnectionManager.conectar();
		con = ConnectionManager.getConnection();
		
		StringBuilder sql = new StringBuilder("select PRAC_ID , PRAC_NOMBRE ");
		sql.append("from practicas ");
		
		if(pr.getPracticaID() > 0) {
			
			sql.append("where PRAC_ID = ?");
			
		}
		
		PreparedStatement pe = con.prepareStatement(sql.toString());
		
		if(pr.getPracticaID() > 0) {
			
			pe.setInt(1, pr.getPracticaID());
			
		}
		
		ResultSet rs = pe.executeQuery();
		
		while(rs.next()) {
			
			practicas.add(new Practica(pr.getPracticaID(),pr.getPracticaNombre()));
			
		}
		
		rs.close();
		ConnectionManager.desconectar();
		
		return practicas;
	
	}

}
