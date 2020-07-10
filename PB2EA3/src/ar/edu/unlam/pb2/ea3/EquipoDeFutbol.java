package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol {
	private String nombre;
	private Set<Jugador> jugadores;

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new TreeSet<Jugador>();
	}

	/*
	 * La capacidad máxima de un equipo es 23. Cualquier intento de agregar más
	 * jugadores generará una excepción (CapacidadMaximaException). Además, no
	 * deberá permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	public void agregarJugador(Jugador jugador) throws CapacidadMaximaException, JugadorDuplicadoException {
		if (jugadores.size() <= 23) {
			if (!jugadores.contains(jugador)) {
				jugadores.add(jugador);
			} else {
				throw new JugadorDuplicadoException();
			}
		} else {
			throw new CapacidadMaximaException();
		}
	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generará una excepción (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) throws JugadoreInexistenteException {

		if (jugadores.contains(saliente)) {
			jugadores.remove(saliente);
			jugadores.add(entrante);
			return true;
		}
		if (!jugadores.contains(saliente)) {

			throw new JugadoreInexistenteException();

		}
		return false;

	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {

		OrdenPorNombre orden = new OrdenPorNombre();

		return this.ordenarELPlantelParaDevolver(orden);
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		OrdenPorPrecio orden = new OrdenPorPrecio();

		return this.ordenarELPlantelParaDevolver(orden);
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		OrdenPorCamiseta orden = new OrdenPorCamiseta();

		return this.ordenarELPlantelParaDevolver(orden);
	}

	private TreeSet<Jugador> ordenarELPlantelParaDevolver(Comparator criterioDeOrdenacion) {
		TreeSet<Jugador> equipoOrdenado = new TreeSet<>(criterioDeOrdenacion);
		equipoOrdenado.addAll(jugadores);
		jugadores = equipoOrdenado;
		return equipoOrdenado;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}
