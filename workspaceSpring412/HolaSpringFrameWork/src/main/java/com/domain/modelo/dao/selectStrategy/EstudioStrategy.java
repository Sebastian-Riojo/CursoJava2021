package com.domain.modelo.dao.selectStrategy;

public class EstudioStrategy extends SelectStrategy{

	public EstudioStrategy() {
		
	}

	@Override
	public String getCondicion() {
		
		StringBuilder sb = new StringBuilder();
		
		if(tengoWhere) {
			
			sb.append(" and alu_estudios like '%");
			sb.append(alumno.getEstudios());
			sb.append("%'");
			
		}else {
			
			sb.append(" where alu_estudios like '%");
			sb.append(alumno.getEstudios());
			sb.append("%'");
			tengoWhere = true;
			
		}
		
		return sb.toString();
	}

	@Override
	public boolean isMe() {
		
		tengoWhere = alumno.getEstudios() != null &&
				!alumno.getEstudios().isEmpty()   &&
				(alumno.getNombre() != null       ||
				alumno.getApellido() != null)	  ;
		
		return alumno.getEstudios() != null &&
				!alumno.getEstudios().isEmpty();
	}
	
}
