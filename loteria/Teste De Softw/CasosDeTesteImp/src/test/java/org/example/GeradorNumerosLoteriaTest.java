package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashSet;


import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeradorNumerosLoteriaTest {

    @Test
    public void testPremioParaTresNumerosCorretos() {
        GeradorNumerosLoteria gerador = new GeradorNumerosLoteria();
        double premio = gerador.verificarPremio(Arrays.asList(1, 2, 3, 10, 15, 20), 10.0);
        assertEquals(0.0, premio, 0.0);
    }

    @Test
    public void testGerarNumerosDiferentes() {
        GeradorNumerosLoteria gerador = new GeradorNumerosLoteria();
        int[] numeros1 = gerador.gerarNumerosLoteria();
        int[] numeros2 = gerador.gerarNumerosLoteria();

        assertNotEquals(numeros1, numeros2);
    }
    @Test
    public void testVerificarPremio_NumerosMenorQueSeis() {
        GeradorNumerosLoteria gerador = new GeradorNumerosLoteria();
        List<Integer> numerosEscolhidos = new ArrayList<>();
        numerosEscolhidos.add(1);
        double premio = gerador.verificarPremio(numerosEscolhidos, 10.0);
        assertEquals(0.0, premio);
    }

    @Test
    public void testVerificarPremio_NumerosMaiorQueQuinze() {
        GeradorNumerosLoteria gerador = new GeradorNumerosLoteria();
        List<Integer> numerosEscolhidos = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numerosEscolhidos.add(i);
        }
        double premio = gerador.verificarPremio(numerosEscolhidos, 10.0);
        assertEquals(0.0, premio);
    }


    @Test
    public void testNumerosInvalidos() {
        GeradorNumerosLoteria gerador = new GeradorNumerosLoteria();
        List<Integer> numerosEscolhidos = Arrays.asList(-5, 10, 70, 30, 40, 50);
        double premio = gerador.verificarPremio(numerosEscolhidos, 10.0);
        assertEquals(0.0, premio);
    }

    @Test
    public void testGerarNumerosSorteados() {
        GeradorNumerosLoteria gerador = new GeradorNumerosLoteria();
        Set<Integer> numerosSorteados = gerador.gerarNumerosSorteados();
        assertEquals(6, numerosSorteados.size());
        for (int numero : numerosSorteados) {
            assertTrue(numero >= 1 && numero <= 60);
        }
    }
    @Test
    public void testCalcularPremio() {
        GeradorNumerosLoteria gerador = new GeradorNumerosLoteria();
        assertEquals(10.0, gerador.calcularPremio(6, 10.0));
        assertEquals(2.0, gerador.calcularPremio(5, 10.0));
        assertEquals(0.5, gerador.calcularPremio(4, 10.0));
        assertEquals(0.0, gerador.calcularPremio(3, 10.0));
    }

    @Test
    public void testGerarNumerosLoteria() {
        GeradorNumerosLoteria gerador = new GeradorNumerosLoteria();
        int[] numeros = gerador.gerarNumerosLoteria();
        assertEquals(6, numeros.length);
        for (int numero : numeros) {
            assertTrue(numero >= 1 && numero <= 60);
        }
        Set<Integer> numerosSet = new HashSet<>();
        for (int numero : numeros) {
            assertTrue(numerosSet.add(numero));
        }
    }

    @Test
    public void testGerarNumerosLoteria_Diferentes() {
        GeradorNumerosLoteria gerador = new GeradorNumerosLoteria();
        int[] numeros1 = gerador.gerarNumerosLoteria();
        int[] numeros2 = gerador.gerarNumerosLoteria();
        assertNotEquals(numeros1, numeros2);
    }


}
