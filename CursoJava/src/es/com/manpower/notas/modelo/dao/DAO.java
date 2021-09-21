package es.com.manpower.notas.modelo.dao;

import java.sql.SQLException;
import java.util.List;

import es.com.manpower.notas.modelo.*;

public interface DAO {

	public void agregar(Model mdl)throws ClassNotFoundException , SQLException;
	public void modificar(Model mdl)throws ClassNotFoundException , SQLException;
	public void eliminar(Model mdl)throws ClassNotFoundException , SQLException;
	public List<Model> leer(Model mdl)throws ClassNotFoundException , SQLException;
	
}
