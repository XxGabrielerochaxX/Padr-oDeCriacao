package com.example.factorymethod;

public class ServicoReservaPassagemPrimeiraClasse implements IServicoPassagem {
    @Override
    public String reservar() {
        return "Passagem da classe Primeira Classe reservada.";
    }

    @Override
    public String cancelar() {
        return "Reserva de passagem da classe Primeira Classe cancelada.";
    }
}
