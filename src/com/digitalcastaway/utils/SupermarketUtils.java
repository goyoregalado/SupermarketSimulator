package com.digitalcastaway.utils;

public class SupermarketUtils {
    private static final String []NOMBRES_PERSONA = {
            "Goyo",
            "Lucrecia",
            "Montxo",
            "Montse",
            "Lionel",
            "Francisco",
            "Nicolás",
            "Yolanda",
            "Matías",
            "Igor"
    } ;

    public static final String []NOMBRES_PRODUCTOS = {
            "Pistachos",
            "Millo",
            "Leche",
            "Tortilla precocinada",
            "Pasticho",
            "Gofio",
            "Plátano",
            "Pan de pipas",
            "Merengue",
            "Tacos salmón",
            "Takis",
            "Chetos Pelotazo"
    };

    public static String generarNombreAleatorio() {
        return NOMBRES_PERSONA[(int) (Math.random() * NOMBRES_PERSONA.length)];
    }

    public static String generarNombreProductoAleatorio() {
        int indice = (int) (Math.random() * NOMBRES_PRODUCTOS.length);
        return NOMBRES_PRODUCTOS[indice];
    }
}
