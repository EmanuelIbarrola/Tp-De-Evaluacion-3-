package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class OrdenPorPrecio implements Comparator<Jugador> {

	@Override
	public int compare(Jugador jugador1, Jugador jugador2) {
		return jugador1.getPrecio().compareTo(jugador2.getPrecio());
	}

	
}
