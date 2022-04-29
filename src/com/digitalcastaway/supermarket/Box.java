package com.digitalcastaway.supermarket;

import com.digitalcastaway.datastructures.GenericQueue;
import com.digitalcastaway.utils.SupermarketUtils;

public class Box {
    private String responsable;
    private GenericQueue<Persona> clientes = new GenericQueue<Persona>();

    public Box(String responsable) {
        this.responsable = responsable;
    }

    public static Box generarBox() {
        return new Box(SupermarketUtils.generarNombreAleatorio());
    }

    public void ponerEnCola(Persona cliente){
        System.out.println("El cliente " + cliente.getNombre() + " llega a la cola");
        clientes.enqueue(cliente);
    }

    public Persona atenderCliente() {
        Persona cliente = clientes.dequeue();
        System.out.println("Atendiendo a: " + cliente.getNombre());
        return cliente;
    }
}
