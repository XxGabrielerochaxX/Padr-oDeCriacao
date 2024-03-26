package com.example.factorymethod;

public class ServicoReservaPassagemExecutiva implements IServicoPassagem {
    @Override
    public String reservar() {
        return "Passagem executiva reservada.";
    }

    @Override
    public String cancelar() {
        return "Reserva de passagem executiva cancelada.";
    }
}

