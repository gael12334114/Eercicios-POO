public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Juan");
        Jugador jugador2 = new Jugador("Pedro");

        System.out.println("DATOS INICIALES");
        mostrarJugador(jugador1);
        mostrarJugador(jugador2);

        jugador1.ganarPuntos(100);
        jugador2.ganarPuntos(50);
        jugador1.ganarPuntos(-20);
        jugador1.subirNivel();

        System.out.println("\nDATOS FINALES");
        mostrarJugador(jugador1);
        mostrarJugador(jugador2);
    }

    public static void mostrarJugador(Jugador jugador) {
        System.out.println(jugador.getNombre() + " - Nivel: " + jugador.getNivel()
                + " - Puntos: " + jugador.getPuntos());
    }
}
