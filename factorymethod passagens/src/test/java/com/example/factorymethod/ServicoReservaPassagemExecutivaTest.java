package com.example.factorymethod;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoReservaPassagemExecutivaTest {

    @Test
    void deveReservarPassagemExecutiva() {
        IServicoPassagem servico = ServicoReservaPassagemFactory.obterServico("Executiva");
        assertEquals("Passagem executiva reservada.", servico.reservar());
    }

    @Test
    void deveCancelarReservaPassagemExecutiva() {
        IServicoPassagem servico = ServicoReservaPassagemFactory.obterServico("Executiva");
        assertEquals("Reserva de passagem executiva cancelada.", servico.cancelar());
    }
}
