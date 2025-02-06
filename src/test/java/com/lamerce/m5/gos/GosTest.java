package com.lamerce.m5.gos;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GosTest {
    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, -1, 111, Integer.MAX_VALUE})
    void pesIncorrecte(int pes) {
        assertThrows(PesIncorrecteException.class, () -> {
            Gos.midaGos(pes);
        });
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 60, 110})
    void pesCorrecte(int pes) {
        assertDoesNotThrow(() -> {
            Gos.midaGos(pes);
        });
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 5})
    void pesToy(int pes) throws PesIncorrecteException {
        assertThat(Gos.midaGos(pes)).isEqualTo("toy");
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 10, 15})
    void pesPetit(int pes) throws PesIncorrecteException {
        assertThat(Gos.midaGos(pes)).isEqualTo("petit");
    }

    @ParameterizedTest
    @ValueSource(ints = {16, 20, 25})
    void pesMitja(int pes) throws PesIncorrecteException {
        assertThat(Gos.midaGos(pes)).isEqualTo("mitjà");
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 37, 50})
    void pesGran(int pes) throws PesIncorrecteException {
        assertThat(Gos.midaGos(pes)).isEqualTo("gran");
    }

    @ParameterizedTest
    @ValueSource(ints = {51, 70, 110})
    void pesGegant(int pes) throws PesIncorrecteException {
        assertThat(Gos.midaGos(pes)).isEqualTo("gegant");
    }

}
