package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class OrdenPorNombre  implements Comparator<Jugador>{

	@Override
	public int compare(Jugador j1, Jugador j2) {
		return  j1.getNombre().compareTo(j2.getNombre());
	}

}
