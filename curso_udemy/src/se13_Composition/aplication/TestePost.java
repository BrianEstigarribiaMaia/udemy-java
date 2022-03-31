package se13_Composition.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import se13_Composition.entities.Comentario;
import se13_Composition.entities.Post;

public class TestePost {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Incrivel!");
		Comentario c2 = new Comentario("Boa Viagem!");
		
		Post p1 = new Post(sdf.parse("21/12/2019 13:55:44"), "Viajando para o Canadá, ",
				"Indo visitar este pais lindo! ", 12);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);

	}

}
