package proyectoiii_200925287;

import javax.swing.ImageIcon;

public class listajugadores {

    nodo inicio;

public listajugadores()
{
    inicio = null;
}


public void insertarunidadjugadores(String jugadorx, int xposicion, int yposicion, String unidadx, int cantidadx, int poderx, String estadox){

    nodo nodo_buscado = buscarunidadjugadores(xposicion, yposicion, unidadx);

    nodo tmp = new nodo();
    tmp.jugador = jugadorx;
    tmp.posicionx = xposicion;
    tmp.posiciony = yposicion;
    tmp.unidad = unidadx;
    tmp.cantidad = cantidadx;
    tmp.poder = poderx;
    tmp.estado = estadox;

    if(nodo_buscado == null)
    {
       if(inicio == null)
       {
          inicio = tmp;
       }
       else
       {
          nodo aux = inicio;
     while(true)
     {
          if(aux.siguiente == null)
          {
             break;
          }
          else
          {
             aux = aux.siguiente;
          }
      }
             aux.siguiente = tmp;
      }

      }
      else
      {     
          nodo_buscado.cantidad = nodo_buscado.cantidad + cantidadx;
      }
    } 


public void modificarposicionesunidadjugadores(int posactx, int posacty, int pospostx, int posposty){

        nodo tmp = buscarunidadjugadores(posactx, posacty);

        if(tmp == null){
            return;
        }
        else
        {
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].jugador = "";
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].unidad = "";
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].cantidad = 0;
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].poder = 0;
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].estado = "";
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].setText("");
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].setIcon(null);

            tmp.posicionx = pospostx;
            tmp.posiciony = posposty;
        }
}


public void limpiarunidadjugadores(int posactx, int posacty){

        nodo tmp = buscarunidadjugadores(posactx, posacty);

        if(tmp == null)
        {
            return;
        }
        else
        {
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].jugador = "";
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].unidad = "";
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].cantidad = 0;
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].poder = 0;
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].estado = "";
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].setText("");
            Tablero.tablerobotones[tmp.posicionx][tmp.posiciony].setIcon(null);
       }
    }


public void modificarposicionllenaunidadjugadores(int pospostx, int posposty, int cantidadx){

        nodo tmp = buscarunidadjugadores(pospostx, posposty);

        if(tmp == null)
        {
            return;
        }
        else
        {
            tmp.cantidad = tmp.cantidad + cantidadx;
        }
}


public nodo buscarunidadjugadores(int x, int y, String unidadx){

        if(inicio == null)
        {
            return null;
        }
        else
        {
            nodo aux = inicio;

            while(true)
          {
             if(aux == null)
             {
                break;
             }
             else if(aux.posicionx == x && aux.posiciony == y && aux.unidad.equals(unidadx))
             {
                    break;
             }
             else
             {
                 aux = aux.siguiente;
             }
            }
            return aux;
        }

} 


public nodo buscarunidadjugadores(int x, int y){

        if(inicio == null)
        {
            return null;
        }
        else
        {
            nodo aux = inicio;

            while(true)
            {
                if(aux == null)
                {
                    break;
                }
                else if(aux.posicionx == x && aux.posiciony == y)
                {
                    break;
                }
                else
                {
                aux = aux.siguiente;
                }
            }
           return aux;
        }
}


public void insertar(int cantidadx, String estadox, String jugadorx, int poderx, int xposicion, int yposicion, String unidadx){

        nodo tmp = new nodo(); 

        tmp.cantidad = cantidadx;
        tmp.estado = estadox;
        tmp.jugador = jugadorx;
        tmp.poder = poderx;
        tmp.posicionx = xposicion;
        tmp.posiciony = yposicion;
        tmp.unidad = unidadx;

        if (inicio == null)
        {
            inicio = tmp;
        }
        else
        {
            nodo aux = inicio; 
         while (true)
         {
                if (aux.siguiente == null)
                {
                    break;
                } 
                else
                {
                    aux = aux.siguiente;
                }
           }
                 aux.siguiente = tmp;
        }
    }


public void eliminarunidadjugadores(int x, int y){

    if(inicio == null)
            return;

    listajugadores listatmp = new listajugadores(); 
    nodo aux = inicio; 
    
    while(true)
    {
        if((aux.posicionx == x && aux.posiciony == y ))
        {
            // Como son Iguales no hace Nada
        }
        else
        { // Como no son iguales inserta el nodo en la lista
                listatmp.insertar(aux.cantidad, aux.estado, aux.jugador, aux.poder, aux.posicionx, aux.posiciony, aux.unidad);
        }
        
        if(aux.siguiente == null)
                break;
        else
           aux = aux.siguiente;
        }

        inicio = listatmp.inicio;
        
        listatmp = null; 
}


public void generar_imagen_unidad_boton(){

    int contadorsoldadosjugador1 = 0;
    int contadorrobotsjugador1 = 0;
    int contadortanquesjugador1 = 0;
    int contadorsoldadosjugador2 = 0;
    int contadorrobotsjugador2 = 0;
    int contadortanquesjugador2 = 0;

    nodo aux = inicio;

    if(aux == null)
    {
       return;
    }

    while(true)
    {
        // aki pondra si es Jugador 1 las Unidades que estan posicionadas
       if(aux.jugador.equals(Tablero.Jugador1))
       {
            Tablero.jLabel65.setText(Integer.toString(contadorsoldadosjugador1));
            Tablero.jLabel66.setText(Integer.toString(contadortanquesjugador1));
            Tablero.jLabel68.setText(Integer.toString(contadorrobotsjugador1));
       }


       // aki pondra si es Jugador 2 las Unidades que estan posicionara
       if(aux.jugador.equals(Tablero.Jugador2))
       {
            Tablero.jLabel74.setText(Integer.toString(contadorsoldadosjugador2));
            Tablero.jLabel72.setText(Integer.toString(contadortanquesjugador2));
            Tablero.jLabel70.setText(Integer.toString(contadorrobotsjugador2));
       }



       // SI ES SOLDADO Y ES JUGADOR 1 UNO ENTONCES COLOCARA LA IMAGEN AL BOTON
 if(aux.unidad.equals("soldado") && aux.jugador.equals(Tablero.Jugador1))
  {
       Tablero.tablerobotones[aux.posicionx][aux.posiciony].setIcon(new ImageIcon(getClass().getResource("/proyectoiii_200925287/soldado.png")));
       contadorsoldadosjugador1 = contadorsoldadosjugador1 + aux.cantidad;

       Tablero.jLabel65.setText(Integer.toString(contadorsoldadosjugador1));

              
  }


       // SI ES SOLDADO Y ES JUGADOR 2 UNO ENTONCES COLOCARA LA IMAGEN AL BOTON
 else if(aux.unidad.equals("soldado") && aux.jugador.equals(Tablero.Jugador2))
 {
       Tablero.tablerobotones[aux.posicionx][aux.posiciony].setIcon(new ImageIcon(getClass().getResource("/proyectoiii_200925287/soldado.png")));

       contadorsoldadosjugador2 = contadorsoldadosjugador2 + aux.cantidad;

       Tablero.jLabel74.setText(Integer.toString(contadorsoldadosjugador2));

 }



       // SI ES TANGUEGT Y ES JUGADOR 1 UNO ENTONCES COLOCARA LA IMAGEN AL BOTON
 else if(aux.unidad.equals("tanque") && aux.jugador.equals(Tablero.Jugador1))
 {
       Tablero.tablerobotones[aux.posicionx][aux.posiciony].setIcon(new ImageIcon(getClass().getResource("/proyectoiii_200925287/tanqueGT.png")));

       contadortanquesjugador1 = contadortanquesjugador1 + aux.cantidad;

       Tablero.jLabel66.setText(Integer.toString(contadortanquesjugador1));

 }


       // SI ES TANQUEGT Y ES JUGADOR 2 UNO ENTONCES COLOCARA LA IMAGEN AL BOTON
 else if(aux.unidad.equals("tanque") && aux.jugador.equals(Tablero.Jugador2))
 {
       Tablero.tablerobotones[aux.posicionx][aux.posiciony].setIcon(new ImageIcon(getClass().getResource("/proyectoiii_200925287/tanqueGT.png")));

       contadortanquesjugador2 = contadortanquesjugador2 + aux.cantidad;

       Tablero.jLabel72.setText(Integer.toString(contadortanquesjugador2));
 }



            // SI ES SEGADOR Y ES JUGADOR 1 UNO ENTONCES COLOCARA LA IMAGEN AL BOTON
 else if(aux.unidad.equals("segador") && aux.jugador.equals(Tablero.Jugador1))
 {
       Tablero.tablerobotones[aux.posicionx][aux.posiciony].setIcon(new ImageIcon(getClass().getResource("/proyectoiii_200925287/Segador.png")));

       contadorrobotsjugador1 = contadorrobotsjugador1 + aux.cantidad;

       Tablero.jLabel68.setText(Integer.toString(contadorrobotsjugador1));


 }


       // SI ES SEGADOR Y ES JUGADOR 2 UNO ENTONCES COLOCARA LA IMAGEN AL BOTON
 else if(aux.unidad.equals("segador") && aux.jugador.equals(Tablero.Jugador2))
 {
       Tablero.tablerobotones[aux.posicionx][aux.posiciony].setIcon(new ImageIcon(getClass().getResource("/proyectoiii_200925287/Segador.png")));

       contadorrobotsjugador2 = contadorrobotsjugador2 + aux.cantidad;

       Tablero.jLabel70.setText(Integer.toString(contadorrobotsjugador2));

 }


       // asigna todas las posiciones del nodo al boton
    Tablero.tablerobotones[aux.posicionx][aux.posiciony].jugador = aux.jugador;
    Tablero.tablerobotones[aux.posicionx][aux.posiciony].posicionx = aux.posicionx;
    Tablero.tablerobotones[aux.posicionx][aux.posiciony].posiciony = aux.posiciony;
    Tablero.tablerobotones[aux.posicionx][aux.posiciony].unidad = aux.unidad;
    Tablero.tablerobotones[aux.posicionx][aux.posiciony].cantidad = aux.cantidad;
    Tablero.tablerobotones[aux.posicionx][aux.posiciony].poder = aux.poder;
    Tablero.tablerobotones[aux.posicionx][aux.posiciony].estado = aux.estado;
    Tablero.tablerobotones[aux.posicionx][aux.posiciony].setText(Integer.toString(aux.cantidad));

  if(aux.siguiente == null)
  {
      break;
  }
  else
  {
      aux = aux.siguiente;
  }

  }
}


}