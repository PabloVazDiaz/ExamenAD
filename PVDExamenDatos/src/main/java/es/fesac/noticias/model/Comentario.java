package es.fesac.noticias.model;

import javax.persistence.*;

public class Comentario {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private String contenido;
	
	private Usuario autor;
	
	private Mensaje mensaje;
}
