package com.example.escritorioadvocacia;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ComidaTests {

    @Test
    void deveFazerSobremesaBrasileira() {
        FabricaAbstrata fabrica = new FabricaBrasileira();
        Comida comida = new Comida(fabrica);
        assertEquals("Pudim", comida.fazerSobremesa());
    }

    @Test
    void deveFazerSobremesaItaliana() {
        FabricaAbstrata fabrica = new FabricaItaliana();
        Comida comida = new Comida(fabrica);
        assertEquals("Tiramisu", comida.fazerSobremesa());
    }

    @Test
    void deveFazerRefeicaoBrasileira() {
        FabricaAbstrata fabrica = new FabricaBrasileira();
        Comida comida = new Comida(fabrica);
        assertEquals("Feijoada", comida.fazerRefeicao());
    }

    @Test
    void deveFazerRefeicaoItaliana() {
        FabricaAbstrata fabrica = new FabricaItaliana();
        Comida comida = new Comida(fabrica);
        assertEquals("Pizza", comida.fazerRefeicao());
    }

}
