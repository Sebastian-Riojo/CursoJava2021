package com.domain.modelo.dao.selectStrategy;

import java.util.ArrayList;
import java.util.List;

import com.domain.modelo.*;

public abstract class SelectStrategy {
	
		protected boolean 		isUltimo	;
		protected static StringBuilder sql	;
		protected static boolean 		tengoWhere	;
		protected static Alumno alumno		;
		
		public SelectStrategy() {}
		
		public static String getSql(Alumno palu){
			alumno = palu;
			sql = new StringBuilder ("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos");
			//conoce a todos sus hijos SIEMPRE, voy a armar mi pasamanos
			List<SelectStrategy> strategies = new ArrayList<SelectStrategy>();
			strategies.add(new NullStrategy())		;
			strategies.add(new VacioStrategy())		;
			strategies.add(new Codigo0Strategy())	;
			strategies.add(new NombreStrategy())	;
			strategies.add(new ApellidoStrategy())  ;
			strategies.add(new EstudioStrategy()) 	;
			strategies.add(new LinkStrategy()) 		;
			
			for (SelectStrategy selectStrategy : strategies) {
				if(selectStrategy.isMe())
					sql.append(selectStrategy.getCondicion());
				if(selectStrategy.isUltimo)
					return sql.toString();
				
			}
			
			return sql.toString();
		
	}
	
	public abstract String getCondicion();
	public abstract boolean isMe();
}

