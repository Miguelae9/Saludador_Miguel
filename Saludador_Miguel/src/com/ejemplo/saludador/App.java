package com.ejemplo.saludador;

public class App {
    public static void main(String[] args) {
    	String nombre = args.length > 0 ? args[0] : "invitado";
    	System.out.println("¡Hola, " + nombre + "!");


    }

}
