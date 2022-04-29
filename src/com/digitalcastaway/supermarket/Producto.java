package com.digitalcastaway.supermarket;

import com.digitalcastaway.utils.SupermarketUtils;

public class Producto {
    private final static int PRECIO_MAXIMO = 20;
    private final static int CANTIDAD_MAXIMA = 6;

    private String nombre;
    private float precio;
    private int cantidad;

    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public static Producto generarProducto() {
        String nombre = SupermarketUtils.generarNombreProductoAleatorio();
        float precio = (float) SupermarketUtils.generarNumeroAleatorio(PRECIO_MAXIMO);
        int cantidad = (int) SupermarketUtils.generarNumeroAleatorio(CANTIDAD_MAXIMA);
        return new Producto(nombre, precio, cantidad);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + String.format("%.2f", precio) +
                ", cantidad=" + cantidad +
                '}';
    }
}
