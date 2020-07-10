package ar.edu.unlam.pb2.ea3;

public class Jugador implements Comparable<Jugador> {

	private Integer numero;
	private String nombre;
	private Integer precio;

	public Jugador(String nombre, Integer numero, Integer precio) {

		this.numero = numero;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Jugador jugador) {
		return this.nombre.compareTo(jugador.getNombre());
	}

}// fin class
