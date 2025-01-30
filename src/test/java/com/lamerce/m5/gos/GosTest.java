package com.lamerce.m5.gos;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GosTest {
    @Test
    void pesIncorrecte() {
        assertThrows(PesIncorrecteException.class, () -> {
            Gos.midaGos(-2);
        });
    }

    @Test
    void pesToy() throws PesIncorrecteException {
        assertThat(Gos.midaGos(3)).isEqualTo("toy");
    }

}
