package es.studium.pelicula;

public class testpelicula
{

	public static void main(String[] args)
	{
		pelicula raf = new pelicula("La sirenita", 1985, 116);
		pelicula erl = new pelicula("El rey león", 1994, 1.45f);
		pelicula im = new pelicula("Iron Man", 2008, 1.26f);
		pelicula ldm = new pelicula("Los diez mandamientos", 1956, 2.20f);
		pelicula v3 = new pelicula("Vengadores: Endgame", 2019, 1.81f);
		
		System.out.println(erl.getTitulo());
		System.out.println(raf.getTitulo());

	}

}
