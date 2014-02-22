package proyectoiii_200925287;

public class nodo{
    String jugador;
    String unidad;
    String estado;
    int posicionx;
    int posiciony;
    int cantidad;
    int poder;
    nodo siguiente;

    public nodo() {
        jugador = "";
        unidad = "";
        estado = "";
        posicionx = -1; // ya que asi ala Hora de Sumar nos Dara la posicion Exacta que es Cero
        posiciony = -1;
        cantidad = 0;
        poder = 0;
        siguiente = null; //Debe Apuntar a Null
    }
}


