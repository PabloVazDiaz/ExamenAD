package es.fesac.noticias.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {

	@Query(
			  value = "SELECT * FROM Usuario WHERE nombre = :nombre AND contraseña = MD5(:contraseña)", 
			  nativeQuery = true
			  )
			public Usuario getByNombreAndContraseña(String nombre, String contraseña);
}
