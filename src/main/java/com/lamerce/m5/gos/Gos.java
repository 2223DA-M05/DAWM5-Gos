package com.lamerce.m5.gos;

public class Gos {
    public static String midaGos(int pes) throws PesIncorrecteException {
        if (pes >= 0 && pes <= 110) {
            if(pes <= 5) return "toy";
            else if (pes <= 15) return "petit";
            else if (pes <= 25) return "mitjà";
            else if (pes <= 50) return "gran";
            else return "gegant";
        }
        else throw new PesIncorrecteException(pes);
    }
}
