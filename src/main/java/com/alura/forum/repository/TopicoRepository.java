package com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.alura.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	
	/*@Query("select t from Topico t where t.curso.nombre = :cursoNombre")
	List<Topico>buscaTopicosPorNombreDelCurso(@Param("cursoNombre") String cursoNombre);
	
	

	@Query(value = "select t.* from topico t join curso c on c.id = t.curso_id where c.nombre = :cursoNombre ", nativeQuery = true )
	List<Topico>buscaNativaPorNombreDelCurso(@Param("cursoNombre") String cursoNombre);*/
	
	//List<Topico>findByCurso_Nombre(String nombreCurso);
	
	List<Topico>findByCursoNombre(String nombreCurso);
	
}
