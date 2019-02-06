package es.fesac.noticias.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.model.Mensaje;


public interface MensajeRepository extends CrudRepository<Mensaje,Long> {

	@Query(
			  value = "SELECT * FROM Mensaje WHERE id = :id", 
			  nativeQuery = true
			  )
			public Mensaje getById(Integer id);

}
