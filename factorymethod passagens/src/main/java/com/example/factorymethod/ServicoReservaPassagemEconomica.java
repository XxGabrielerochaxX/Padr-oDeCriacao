package com.example.factorymethod;

public class ServicoReservaPassagemEconomica implements IServicoPassagem {
    @Override
    public String reservar() {
        return "Passagem econômica reservada.";
    }

    @Override
    public String cancelar() {
        return "Reserva de passagem econômica cancelada.";
    }
}

