package com.domain.modelo.daoo;

import java.sql.SQLException;
import java.util.List;

import com.domain.modelo.*;

public interface DAO {

	public void agregar(Model mdl)throws ClassNotFoundException , SQLException;
	public void modificar(Model mdl)throws ClassNotFoundException , SQLException;
	public void eliminar(Model mdl)throws ClassNotFoundException , SQLException;
	public List<Model> leer(Model mdl)throws ClassNotFoundException , SQLException;
	
}
