package br.com.alura.forum.reopository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	static Curso findBynome(String nomeCurso) {
		return null;
	}

	
	
}
