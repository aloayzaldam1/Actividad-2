package ende;

/**
 *
 */

public class Jugador {

    int exitos;      // número de partidas ganadas
    int winTotal;

    public Jugador()    {
        exitos = 0;
        winTotal = 0;
    }

    public int getExitos() {
        return (exitos);
    }

    public void setExitos() {
        exitos++;
    }

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar() {
        String opcion = "";
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                opcion = ("piedra");
                break;
            case 1:
                opcion = ("papel");
                break;
            case 2:
                opcion = ("tijeras");
        }
        return opcion;
    }
}
