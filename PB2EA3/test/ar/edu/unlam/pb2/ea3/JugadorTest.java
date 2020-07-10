package ar.edu.unlam.pb2.ea3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JugadorTest {
	
	@Test
	public void queUnJugadorSeaIgualAOtroPorSuNombre() throws JugadorDuplicadoException {
		Jugador jugador1 = new Jugador("Messi", 10, 50000);
		Jugador jugador2 = new Jugador("Messi", 9, 30000);

		EquipoDeFutbol equipo1 = new EquipoDeFutbol("Boca");
		EquipoDeFutbol equipo2 = new EquipoDeFutbol("messi");

		try {
			equipo1.agregarJugador(jugador1);
			equipo2.agregarJugador(jugador2);
			
			assertEquals(jugador1.getNombre(), jugador2.getNombre());
		} catch (CapacidadMaximaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
