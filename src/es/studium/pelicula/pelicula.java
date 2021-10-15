package es.studium.pelicula;

public class pelicula
{



	
		/* atributos  */
		private String titulo;
		private int anio;
		private float duracion;

		/* constructores */

		//constructores por defecto
		public pelicula() {
			titulo = "";
			anio = 0;
			duracion = 0.0f;
		}


		//constructor con parametros

		public pelicula (String t, int a, float d) {
			titulo = t;
			anio = a;
			duracion = d;

		}


		/**
		 * @return the titulo
		 */
		public String getTitulo()
		{
			return titulo;
		}


		/**
		 * @return the anio
		 */
		public int getAnio()
		{
			return anio;
		}


		/**
		 * @return the duracion
		 */
		public float getDuracion()
		{
			return duracion;
		}


		/**
		 * @param titulo the titulo to set
		 */
		public void setTitulo(String titulo)
		{
			this.titulo = titulo;
		}


		/**
		 * @param anio the anio to set
		 */
		public void setAnio(int anio)
		{
			this.anio = anio;
		}


		/**
		 * @param duracion the duracion to set
		 */
		public void setDuracion(float duracion)
		{
			this.duracion = duracion;
		}
		
	
}