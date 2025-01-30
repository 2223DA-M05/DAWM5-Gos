package com.lamerce.m5.gos;

public class App {

    public static void main(String[] args) {
        try {
            System.out.println(Gos.midaGos(5));
        } catch (PesIncorrecteException e) {
            System.err.println(e.getMessage());
        }
    }
}