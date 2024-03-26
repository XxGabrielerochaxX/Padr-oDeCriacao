package com.example.escritorioadvocacia;

public class FabricaBrasileira implements FabricaAbstrata{

    @Override
    public Sobremesa createSobremesa() {
        return new SobremesaBrasileira();
    }

    @Override
    public Refeicao createRefeicao() {
        return new RefeicaoBrasileira();
    }
}
