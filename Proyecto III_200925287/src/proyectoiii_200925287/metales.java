package proyectoiii_200925287;

import java.util.Random;
import javax.swing.ImageIcon;

public class metales {

    nodo inicio;
    // Variable Random
    private Random Randomx = new Random();

    static int contador_metales;

public metales(){
        inicio = null;
        contador_metales = 0;
}

public void insertarmetales(){

    // 2 numeros aleatorios para el Random
    int Ranx = Randomx.nextInt(10);
    int Rany = 2 + Randomx.nextInt(6);

     //nodo temporal que indica el resultado de la busqueda
     nodo temp = busquedametales(Ranx, Rany);

     if(temp == null)
     {
        if(inicio == null)
        {
        nodo temp1 = new nodo();
        temp1.posicionx = Ranx;
        temp1.posiciony = Rany;
        temp1.unidad = "metal";
        temp1.cantidad = 1;

        inicio = temp1;

        contador_metales++;
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
         nodo temp2 = new nodo();
         temp2.posicionx = Ranx;
         temp2.posiciony = Rany;
         temp2.unidad = "metal";
         temp2.cantidad = 1;

         aux.siguiente = temp2;

         contador_metales++;
      } 
     }
   else
   {
        // si temp no es null no hace nada
   } 
} 

public void insertar(int cant, int pos_x, int pos_y, String unid){

    nodo tmp = new nodo();

    tmp.cantidad = cant;
    tmp.posicionx = pos_x;
    tmp.posiciony = pos_y;
    tmp.unidad = unid;

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

public void eliminarmetales(int x, int y){
        if(inicio == null) 
            return;

        metales listatmp = new metales(); 
        nodo aux = inicio;

        while(true)
        {
            
            if((aux.posicionx == x && aux.posiciony == y ))
            {
                // Si no son Iguales no Inserta Nodo, no Hace Nada
            }
            else
            { // Como no son iguales inserta el nodo en la lista temporal
                listatmp.insertar(aux.cantidad, aux.posicionx, aux.posiciony, aux.unidad); 
            }
            
            if(aux.siguiente == null)
                break;
            else
                aux = aux.siguiente;
        } 
        
        inicio = listatmp.inicio;   // reemplaza la lista inicial por la temporal
        listatmp = null;    // nullo esta lista no contiene el nodo que se queria eliminar
}

public nodo busquedametales(int Rx, int Ry){

        if(inicio == null)
        {
            return null;
        }
        else
        {
            nodo aux1 = inicio;

        while(true)
        {
            if(aux1 == null)
            {
                break;
            }
            else if(aux1.posicionx == Rx && aux1.posiciony == Ry)
            {
                break;
            }
            else
            {
                aux1 = aux1.siguiente;
            } 

         }
            return aux1;
         }
}

public void imagenesmetales(){

        nodo aux3 = inicio;

        if(aux3 == null)
        {
            return;
        } 
        while(true)
        {
          Tablero.tablerobotones[aux3.posicionx][aux3.posiciony].setIcon(new ImageIcon(getClass().getResource("/proyectoiii_200925287/metal.png")));
          Tablero.tablerobotones[aux3.posicionx][aux3.posiciony].posicionx = aux3.posicionx;
          Tablero.tablerobotones[aux3.posicionx][aux3.posiciony].posiciony = aux3.posiciony;
          Tablero.tablerobotones[aux3.posicionx][aux3.posiciony].unidad = aux3.unidad;
          Tablero.tablerobotones[aux3.posicionx][aux3.posiciony].cantidad = aux3.cantidad;

            if(aux3.siguiente == null)
            {
                break;
            }
            else
            {
                aux3 = aux3.siguiente;
            } 
        } 
    }
}