package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego {
    public static void main(String[] args) {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean fin_de_juego = false;
        int Rondasjugadas = 0;    // Número de rondas jugadas
        int exitosJugador1 = p1.exitos;
        int exitosJugador2 = p2.exitos;
        int empates = 0;
        String opcion_JUGADOR1, opcion_JUGADOR2;

        // Bucle de juego
        do {
            System.out.println("***** Ronda: " + Rondasjugadas + " *********************\n");
            System.out.println("Numero de empates: " + empates + "\n");
            opcion_JUGADOR1 = p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcion_JUGADOR1 + "\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            opcion_JUGADOR2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcion_JUGADOR2 + "\t Jugador 2 - Partidas ganadas: " + exitosJugador2);

            if ((opcion_JUGADOR1.equals("piedra")) && (opcion_JUGADOR2.equals("papel"))) {
                System.out.println("Jugador 2 GANA");
                exitosJugador2 = ++p2.exitos;

            } else if ((opcion_JUGADOR1.equals("papel")) && (opcion_JUGADOR2.equals("piedra"))) {
                exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            } else if ((opcion_JUGADOR1.equals("piedra")) && (opcion_JUGADOR2.equals("tijeras"))) {
                exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            } else if ((opcion_JUGADOR1.equals("tijeras")) && (opcion_JUGADOR2.equals("piedra"))) {
                exitosJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            } else if ((opcion_JUGADOR1.equals("tijeras")) && (opcion_JUGADOR2.equals("papel"))) {
                exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            } else if ((opcion_JUGADOR1.equals("papel")) && (opcion_JUGADOR2.equals("tijeras"))) {
                exitosJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            if (opcion_JUGADOR1.equals(opcion_JUGADOR2)) {
                empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            Rondasjugadas++;
            
            if ((p1.exitos >= 3) || (p2.exitos >= 3)) {
                fin_de_juego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while (!fin_de_juego);
    }
}


