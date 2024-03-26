package com.example.escritorioadvocacia;

public class Comida {

    private  Refeicao  refeicao;
    private Sobremesa sobremesa;

    public Comida(FabricaAbstrata fabrica) {
        this.sobremesa = fabrica.createSobremesa();
        this.refeicao= fabrica.createRefeicao();
    }

    public String fazerRefeicao() {
        return this.refeicao.fazer();
    }

    public String fazerSobremesa() {
        return this.sobremesa.fazer();
    }
}
