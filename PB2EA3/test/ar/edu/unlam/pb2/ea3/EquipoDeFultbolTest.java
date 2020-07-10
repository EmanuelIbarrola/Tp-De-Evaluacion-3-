package ar.edu.unlam.pb2.ea3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EquipoDeFultbolTest {

	@Test
	public void queSePuedaCrearUnEquipoVacio() {
		EquipoDeFutbol equipo = new EquipoDeFutbol("River");

		assertEquals("River", equipo.getNombre());

	}

	@Test
	public void queSePuedanAgregarJugadorAlEquipo() throws CapacidadMaximaException, JugadorDuplicadoException {
		EquipoDeFutbol equipo = new EquipoDeFutbol("River");

		Jugador jugador1 = new Jugador("Franco Armani", 1, 10000);
		Jugador jugador2 = new Jugador("Germán Lux", 14, 20000);

		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);

		assertEquals(2, equipo.getJugadores().size());
	}

	@Test(expected = JugadorDuplicadoException.class)
	public void queAlIntentarAgregarUnJugadorExistenetLanceExcepcion()
			throws CapacidadMaximaException, JugadorDuplicadoException {

		EquipoDeFutbol equipo = new EquipoDeFutbol("River");

		Jugador jugador1 = new Jugador("Franco Paredes", 6, 12000);
		Jugador jugador2 = new Jugador("Franco Paredes", 6, 12000);

		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);
	}

	@Test(expected = CapacidadMaximaException.class)
	public void queAlIntentarAgregarCantidadExcesivaDeJugadoresLanceExcepcion() throws CapacidadMaximaException {
		EquipoDeFutbol equipo = new EquipoDeFutbol("River");

		Jugador jugador1 = new Jugador("Franco Armani", 1, 100);
		Jugador jugador2 = new Jugador("Germán Lux", 14, 200);
		Jugador jugador3 = new Jugador("Franco Paredes", 6, 300);
		Jugador jugador4 = new Jugador("Lucas Martínez Quarta", 28, 400);
		Jugador jugador5 = new Jugador("Javier Pinola", 22, 500);
		Jugador jugador6 = new Jugador("Gonzalo Montiel", 29, 600);
		Jugador jugador7 = new Jugador("Milton Casco", 20, 700);
		Jugador jugador8 = new Jugador("Enzo Fernández", 16, 800);
		Jugador jugador9 = new Jugador("Ignacio Fernández", 26, 900);
		Jugador jugador10 = new Jugador("Enzo Pérez", 24, 950000);
		Jugador jugador11 = new Jugador("Leonardo Ponzio", 23, 970);
		Jugador jugador12 = new Jugador("Juan Quintero", 10, 1000);
		Jugador jugador13 = new Jugador("Santiago Sosa", 13, 1200);
		Jugador jugador14 = new Jugador("Bruno Zuculini", 5, 1300);
		Jugador jugador15 = new Jugador("Lucas Pratto", 27, 1400);
		Jugador jugador16 = new Jugador("Federico Girotti", 15, 1500);
		Jugador jugador17 = new Jugador("Rafael Borré", 19, 1600);
		Jugador jugador18 = new Jugador("Ignacio Scocco", 32, 1700);
		Jugador jugador19 = new Jugador("Matías Suárez", 7, 1800);
		Jugador jugador20 = new Jugador("Benjamín Rollheiser", 18, 1900);
		Jugador jugador21 = new Jugador("Lucas Beltrán", 18, 2000);
		Jugador jugador22 = new Jugador("Julián Álvarez", 9, 2100);
		Jugador jugador23 = new Jugador("Ogro Fabiani", 10, 2200);
		Jugador jugador24 = new Jugador("Lionel Messi", 4, 2300);
		Jugador jugador25 = new Jugador("Cristiano Ronaldo", 3, 2400);

		try {
			equipo.agregarJugador(jugador1);
			equipo.agregarJugador(jugador2);
			equipo.agregarJugador(jugador3);
			equipo.agregarJugador(jugador4);
			equipo.agregarJugador(jugador5);
			equipo.agregarJugador(jugador6);
			equipo.agregarJugador(jugador7);
			equipo.agregarJugador(jugador8);
			equipo.agregarJugador(jugador9);
			equipo.agregarJugador(jugador10);
			equipo.agregarJugador(jugador11);
			equipo.agregarJugador(jugador12);
			equipo.agregarJugador(jugador13);
			equipo.agregarJugador(jugador14);
			equipo.agregarJugador(jugador15);
			equipo.agregarJugador(jugador16);
			equipo.agregarJugador(jugador17);
			equipo.agregarJugador(jugador18);
			equipo.agregarJugador(jugador19);
			equipo.agregarJugador(jugador20);
			equipo.agregarJugador(jugador21);
			equipo.agregarJugador(jugador22);
			equipo.agregarJugador(jugador23);
			equipo.agregarJugador(jugador24);
			equipo.agregarJugador(jugador25);

		} catch (JugadorDuplicadoException e) {
			e.getMessage();
		}

	}

	@Test
	public void queSePuedaCambiarUnJugador() throws CapacidadMaximaException, JugadorDuplicadoException {
		EquipoDeFutbol equipo = new EquipoDeFutbol("River");
		Jugador jugador1 = new Jugador("Ogro Fabiani", 10, 2200);
		Jugador jugador2 = new Jugador("Lionel Messi", 4, 2300);

		equipo.agregarJugador(jugador1);

		try {
			assertTrue(equipo.cambiarJugador(jugador1, jugador2));
		} catch (JugadoreInexistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(expected = JugadoreInexistenteException.class)
	public void queAlCambiarUnJugadorInexistenteLanceExcepcion() throws JugadoreInexistenteException {
		EquipoDeFutbol equipo = new EquipoDeFutbol("River");
		Jugador jugador1 = new Jugador("Ogro Fabiani", 10, 2200);
		Jugador jugador2 = new Jugador("Germán Lux", 14, 200);

		equipo.cambiarJugador(jugador1, jugador2);

	}

	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorNombre()
			throws CapacidadMaximaException, JugadorDuplicadoException {

		EquipoDeFutbol equipo = new EquipoDeFutbol("River");
		Jugador jugador1 = new Jugador("Franco Armani", 1, 100);
		Jugador jugador2 = new Jugador("Germán Lux", 14, 200);
		Jugador jugador3 = new Jugador("Franco Paredes", 6, 300);
		Jugador jugador4 = new Jugador("Lucas Martínez Quarta", 28, 400);
		Jugador jugador5 = new Jugador("Javier Pinola", 22, 500);
		Jugador jugador6 = new Jugador("Gonzalo Montiel", 29, 600);
		Jugador jugador7 = new Jugador("Milton Casco", 20, 700);
		Jugador jugador8 = new Jugador("Enzo Fernández", 16, 800);
		Jugador jugador9 = new Jugador("Ignacio Fernández", 26, 900);
		Jugador jugador10 = new Jugador("Enzo Pérez", 24, 950000);
		Jugador jugador11 = new Jugador("Leonardo Ponzio", 23, 970);
		Jugador jugador12 = new Jugador("Juan Quintero", 10, 1000);
		Jugador jugador13 = new Jugador("Santiago Sosa", 13, 1200);
		Jugador jugador14 = new Jugador("Bruno Zuculini", 5, 1300);
		Jugador jugador15 = new Jugador("Lucas Pratto", 27, 1400);
		Jugador jugador16 = new Jugador("Federico Girotti", 15, 1500);
		Jugador jugador17 = new Jugador("Rafael Borré", 19, 1600);
		Jugador jugador18 = new Jugador("Ignacio Scocco", 32, 1700);
		Jugador jugador19 = new Jugador("Matías Suárez", 7, 1800);
		Jugador jugador20 = new Jugador("Benjamín Rollheiser", 18, 1900);
		Jugador jugador21 = new Jugador("Roberto Jojas",2, 2000);
		Jugador jugador22 = new Jugador("Julián Álvarez", 9, 2100);
		Jugador jugador23 = new Jugador("Lionel Messi", 33, 2300);

		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);
		equipo.agregarJugador(jugador3);
		equipo.agregarJugador(jugador4);
		equipo.agregarJugador(jugador5);
		equipo.agregarJugador(jugador6);
		equipo.agregarJugador(jugador7);
		equipo.agregarJugador(jugador8);
		equipo.agregarJugador(jugador9);
		equipo.agregarJugador(jugador10);
		equipo.agregarJugador(jugador11);
		equipo.agregarJugador(jugador12);
		equipo.agregarJugador(jugador13);
		equipo.agregarJugador(jugador14);
		equipo.agregarJugador(jugador15);
		equipo.agregarJugador(jugador16);
		equipo.agregarJugador(jugador17);
		equipo.agregarJugador(jugador18);
		equipo.agregarJugador(jugador19);
		equipo.agregarJugador(jugador20);
		equipo.agregarJugador(jugador21);
		equipo.agregarJugador(jugador22);
		equipo.agregarJugador(jugador23);

		assertEquals(23, equipo.devolverPlanteOrdenadoPorNombreDeJugador().size());
	}

	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorPrecioDeCompra()
			throws CapacidadMaximaException, JugadorDuplicadoException {
		EquipoDeFutbol equipo = new EquipoDeFutbol("River");
		Jugador jugador1 = new Jugador("Franco Armani", 1, 100);
		Jugador jugador2 = new Jugador("Germán Lux", 14, 200);
		Jugador jugador3 = new Jugador("Franco Paredes", 6, 300);
		Jugador jugador4 = new Jugador("Lucas Martínez Quarta", 28, 400);
		Jugador jugador5 = new Jugador("Javier Pinola", 22, 500);
		Jugador jugador6 = new Jugador("Gonzalo Montiel", 29, 600);
		Jugador jugador7 = new Jugador("Milton Casco", 20, 700);
		Jugador jugador8 = new Jugador("Enzo Fernández", 16, 800);
		Jugador jugador9 = new Jugador("Ignacio Fernández", 26, 900);
		Jugador jugador10 = new Jugador("Enzo Pérez", 24, 950000);
		Jugador jugador11 = new Jugador("Leonardo Ponzio", 23, 970);
		Jugador jugador12 = new Jugador("Juan Quintero", 10, 1000);
		Jugador jugador13 = new Jugador("Santiago Sosa", 13, 1200);
		Jugador jugador14 = new Jugador("Bruno Zuculini", 5, 1300);
		Jugador jugador15 = new Jugador("Lucas Pratto", 27, 1400);
		Jugador jugador16 = new Jugador("Federico Girotti", 15, 1500);
		Jugador jugador17 = new Jugador("Rafael Borré", 19, 1600);
		Jugador jugador18 = new Jugador("Ignacio Scocco", 32, 1700);
		Jugador jugador19 = new Jugador("Matías Suárez", 7, 1800);
		Jugador jugador20 = new Jugador("Benjamín Rollheiser", 18, 1900);
		Jugador jugador21 = new Jugador("Roberto Jojas",2, 2000);
		Jugador jugador22 = new Jugador("Julián Álvarez", 9, 2100);
		Jugador jugador23 = new Jugador("Lionel Messi", 33, 2300);

		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);
		equipo.agregarJugador(jugador3);
		equipo.agregarJugador(jugador4);
		equipo.agregarJugador(jugador5);
		equipo.agregarJugador(jugador6);
		equipo.agregarJugador(jugador7);
		equipo.agregarJugador(jugador8);
		equipo.agregarJugador(jugador9);
		equipo.agregarJugador(jugador10);
		equipo.agregarJugador(jugador11);
		equipo.agregarJugador(jugador12);
		equipo.agregarJugador(jugador13);
		equipo.agregarJugador(jugador14);
		equipo.agregarJugador(jugador15);
		equipo.agregarJugador(jugador16);
		equipo.agregarJugador(jugador17);
		equipo.agregarJugador(jugador18);
		equipo.agregarJugador(jugador19);
		equipo.agregarJugador(jugador20);
		equipo.agregarJugador(jugador21);
		equipo.agregarJugador(jugador22);
		equipo.agregarJugador(jugador23);

		assertEquals(23, equipo.devolverPlanteOrdenadoPorPrecioDeCompraDeJugador().size());
	}

	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorNumeroDeCamiseta()
			throws CapacidadMaximaException, JugadorDuplicadoException {
		EquipoDeFutbol equipo = new EquipoDeFutbol("River");
		Jugador jugador1 = new Jugador("Franco Armani", 1, 100);
		Jugador jugador2 = new Jugador("Germán Lux", 14, 200);
		Jugador jugador3 = new Jugador("Franco Paredes", 6, 300);
		Jugador jugador4 = new Jugador("Lucas Martínez Quarta", 28, 400);
		Jugador jugador5 = new Jugador("Javier Pinola", 22, 500);
		Jugador jugador6 = new Jugador("Gonzalo Montiel", 29, 600);
		Jugador jugador7 = new Jugador("Milton Casco", 20, 700);
		Jugador jugador8 = new Jugador("Enzo Fernández", 16, 800);
		Jugador jugador9 = new Jugador("Ignacio Fernández", 26, 900);
		Jugador jugador10 = new Jugador("Enzo Pérez", 24, 950000);
		Jugador jugador11 = new Jugador("Leonardo Ponzio", 23, 970);
		Jugador jugador12 = new Jugador("Juan Quintero", 10, 1000);
		Jugador jugador13 = new Jugador("Santiago Sosa", 13, 1200);
		Jugador jugador14 = new Jugador("Bruno Zuculini", 5, 1300);
		Jugador jugador15 = new Jugador("Lucas Pratto", 27, 1400);
		Jugador jugador16 = new Jugador("Federico Girotti", 15, 1500);
		Jugador jugador17 = new Jugador("Rafael Borré", 19, 1600);
		Jugador jugador18 = new Jugador("Ignacio Scocco", 32, 1700);
		Jugador jugador19 = new Jugador("Matías Suárez", 7, 1800);
		Jugador jugador20 = new Jugador("Benjamín Rollheiser", 18, 1900);
		Jugador jugador21 = new Jugador("Roberto Jojas",2, 2000);
		Jugador jugador22 = new Jugador("Julián Álvarez", 9, 2100);
		Jugador jugador23 = new Jugador("Lionel Messi", 33, 2300);

		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);
		equipo.agregarJugador(jugador3);
		equipo.agregarJugador(jugador4);
		equipo.agregarJugador(jugador5);
		equipo.agregarJugador(jugador6);
		equipo.agregarJugador(jugador7);
		equipo.agregarJugador(jugador8);
		equipo.agregarJugador(jugador9);
		equipo.agregarJugador(jugador10);
		equipo.agregarJugador(jugador11);
		equipo.agregarJugador(jugador12);
		equipo.agregarJugador(jugador13);
		equipo.agregarJugador(jugador14);
		equipo.agregarJugador(jugador15);
		equipo.agregarJugador(jugador16);
		equipo.agregarJugador(jugador17);
		equipo.agregarJugador(jugador18);
		equipo.agregarJugador(jugador19);
		equipo.agregarJugador(jugador20);
		equipo.agregarJugador(jugador21);
		equipo.agregarJugador(jugador22);
		equipo.agregarJugador(jugador23);

		assertEquals(23, equipo.devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador().size());

	}
}
