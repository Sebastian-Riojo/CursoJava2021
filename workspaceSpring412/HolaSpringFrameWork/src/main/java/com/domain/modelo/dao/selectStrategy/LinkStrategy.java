package com.domain.modelo.dao.selectStrategy;

public class LinkStrategy extends SelectStrategy{

	public LinkStrategy() {
		
		
		
	}

	@Override
	public String getCondicion() {
		StringBuilder sb = new StringBuilder();
		
		if(tengoWhere) {
			sb.append(" and alu_linkgit like '%");
			sb.append(alumno.getGit());
			sb.append("%'");
			
		}else {
			
			sb.append(" where alu_linkgit like '%");
			sb.append(alumno.getGit());
			sb.append("%'");
			tengoWhere = true;
			
		}
		
		return sb.toString();
	}

	@Override
	public boolean isMe() {
		
		tengoWhere = alumno.getGit() != null &&
				!alumno.getGit().isEmpty();
		
		return alumno.getGit() != null &&
				!alumno.getGit().isEmpty();
		
	}
	
}
