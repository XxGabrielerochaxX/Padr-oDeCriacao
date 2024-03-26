package com.example.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoReservaPassagemEconomicaTest {

    @Test
    void deveReservarPassagemEconomica() {
        IServicoPassagem servico = ServicoReservaPassagemFactory.obterServico("Economica");
        assertEquals("Passagem econômica reservada.", servico.reservar());
    }

    @Test
    void deveCancelarReservaPassagemEconomica() {
        IServicoPassagem servico = ServicoReservaPassagemFactory.obterServico("Economica");
        assertEquals("Reserva de passagem econômica cancelada.", servico.cancelar());
    }
}
