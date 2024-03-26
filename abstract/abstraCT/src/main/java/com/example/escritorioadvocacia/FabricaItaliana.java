package com.example.escritorioadvocacia;

public class FabricaItaliana implements FabricaAbstrata{

    @Override
    public Sobremesa createSobremesa() {
        return new SobremesaItaliana();
    }

    @Override
    public Refeicao createRefeicao() {
        return new RefeicaoItaliana();
    }
}
