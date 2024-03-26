package com.example.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoReservaPassagemFactoryTests {

    @Test
    void deveRetornarExcecaoParaTipoDePassagemInexistente() {
        try {
            IServicoPassagem servico = ServicoReservaPassagemFactory.obterServico("PassagemInexistente");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de passagem inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaTipoDePassagemInvalido() {
        try {
            IServicoPassagem servico = ServicoReservaPassagemFactory.obterServico("PassagemInvalida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de passagem inválido", e.getMessage());
        }
    }
}
