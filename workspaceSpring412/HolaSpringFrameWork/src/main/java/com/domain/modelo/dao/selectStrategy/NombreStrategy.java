package com.domain.modelo.dao.selectStrategy;

public class NombreStrategy extends SelectStrategy{

	public NombreStrategy() {
		
	}

	@Override
	public String getCondicion() {
		
		StringBuilder sb = new StringBuilder();

			sb.append(" where alu_nombre like '%");
			sb.append(alumno.getNombre());
			sb.append("%'");
			
		return sb.toString();
		
	}

	@Override
	public boolean isMe() {
		tengoWhere = alumno.getNombre()!= null &&
				!alumno.getNombre().isEmpty();
		
		return alumno.getNombre() != null &&
				!alumno.getNombre().isEmpty();
	}
	
}
