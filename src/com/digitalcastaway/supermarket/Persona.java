package com.digitalcastaway.supermarket;

import com.digitalcastaway.datastructures.GenericStack;
import com.digitalcastaway.utils.SupermarketUtils;

public class Persona {
    private String nombre;
    private GenericStack<Producto> carrito = new GenericStack<Producto>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public static Persona generatePersona() {
        Persona cliente = new Persona(SupermarketUtils.generarNombreAleatorio());
        int numProductos = (int) SupermarketUtils.generarNumeroAleatorio(4);
        for (int i = 0; i < numProductos; i++) {
            cliente.anyadirProducto();
        }
        return cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void anyadirProducto() {
        Producto producto = Producto.generarProducto();
        System.out.println("El cliente " + getNombre() + " compra " + producto);
        carrito.push(producto);
    }
}

