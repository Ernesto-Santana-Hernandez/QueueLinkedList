
package queuelinkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

    public static void main(String[] args) {
        Queue<String>queue=new LinkedList();
        //Insertar datos
        //retorna un Exception en caso de no poder almacenar el elemento
        queue.add("Adrian");
        queue.add("Jesús");
        queue.add("Daniel");
        //Insertar dato
        //Retorna null en caso de no poder almacenar el elemento.
        queue.offer("Francisco");
        System.out.println(queue);
        //Eliminar un elemento, retorna si la cola esta vacía
        System.out.println("Se elimino: "+queue.remove());
        //muestra el frente de la cola
        System.out.println("Frente de la cola: " + queue.element());
        //queue.element();
        //elimina un elemento de la cola, retorna null si la cola esta vacia.
        System.out.println("se elimino el elemento :" + queue.peek());
        //
        System.out.println(queue.toString());
    }
    
}
