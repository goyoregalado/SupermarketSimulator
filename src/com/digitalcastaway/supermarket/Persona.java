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
        return new Persona(SupermarketUtils.generarNombreAleatorio());
    }

    public String getNombre() {
        return nombre;
    }

    public void anyadirProducto() {
        carrito.push(Producto.generarProducto());
    }
}

