package com.example.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoReservaPassagemPrimeiraClasseTest {

    @Test
    void deveReservarPassagemPrimeiraClasse() {
        IServicoPassagem servico = ServicoReservaPassagemFactory.obterServico("PrimeiraClasse");
        assertEquals("Passagem da classe Primeira Classe reservada.", servico.reservar());
    }

    @Test
    void deveCancelarReservaPassagemPrimeiraClasse() {
        IServicoPassagem servico = ServicoReservaPassagemFactory.obterServico("PrimeiraClasse");
        assertEquals("Reserva de passagem da classe Primeira Classe cancelada.", servico.cancelar());
    }
}
