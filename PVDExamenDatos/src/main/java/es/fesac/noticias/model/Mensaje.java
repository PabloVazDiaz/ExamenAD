package es.fesac.noticias.model;


import java.util.List;
import javax.persistence.*;

@Entity
public class Mensaje {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private String contenido;
	
	@ManyToOne
	private Usuario autor;
	
	private List<Comentario> comentarios; 
}
