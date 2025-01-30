package com.lamerce.m5.gos;

public class PesIncorrecteException extends Exception {
    public PesIncorrecteException(int pes) {
        super("Pes " + pes + " incorrecte.");
    }
}
