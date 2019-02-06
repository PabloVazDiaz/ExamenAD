package es.fesac.noticias.model;

import javax.persistence.*;

import org.hibernate.annotations.ColumnTransformer;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

	private String nombre;
	
	private String email;
	@ColumnTransformer(write=" MD5(?) ")
	private String contraseña;
}
