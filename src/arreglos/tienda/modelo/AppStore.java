package arreglos.tienda.modelo;

public class AppStore {
    private static final int MAX = 4;
    private Juego juegos[];
    private int indice;

    public AppStore(){
        juegos  = new Juego[MAX];
        indice = -1;
    }

    public Juego getJuegos() {
        return juegos;
    }

    /*
    No se utilizaron pq se deberia ingresar una a una los juegos
    public void setJuegos(Juego juegos[])
        this.juegos = juegos;
     */

    public boolean agregarJuego(Juego j){
        if( j != null && indice < MAX-1){
            juegos[++indice] = j;
            return true
        }
        return false:
    }


    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
