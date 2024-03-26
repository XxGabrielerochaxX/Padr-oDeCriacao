package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GeradorNumerosLoteria {

    public double verificarPremio(List<Integer> numerosEscolhidos, double valorApostado) {
        List<Integer> numerosValidos = validarNumeros(numerosEscolhidos);

        if (numerosValidos.size() < 6 || numerosValidos.size() > 15) {
            return 0.0;
        }

        Set<Integer> numerosSorteados = gerarNumerosSorteados();
        int numerosCorretos = contarNumerosCorretos(numerosValidos, numerosSorteados);

        return calcularPremio(numerosCorretos, valorApostado);
    }

    private List<Integer> validarNumeros(List<Integer> numeros) {
        List<Integer> numerosValidos = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero >= 1 && numero <= 60 && !numerosValidos.contains(numero)) {
                numerosValidos.add(numero);
            }
        }
        return numerosValidos;
    }

    public Set<Integer> gerarNumerosSorteados() {
        Set<Integer> numerosSorteados = new HashSet<>();
        Random random = new Random();
        while (numerosSorteados.size() < 6) {
            int numeroSorteado = random.nextInt(60) + 1;
            numerosSorteados.add(numeroSorteado);
        }
        return numerosSorteados;
    }

    private int contarNumerosCorretos(List<Integer> numerosEscolhidos, Set<Integer> numerosSorteados) {
        int numerosCorretos = 0;
        for (Integer numero : numerosEscolhidos) {
            if (numerosSorteados.contains(numero)) {
                numerosCorretos++;
            }
        }
        return numerosCorretos;
    }

    public double calcularPremio(int numerosCorretos, double valorApostado) {
        switch (numerosCorretos) {
            case 6:
                return valorApostado;
            case 5:
                return valorApostado * 0.2;
            case 4:
                return valorApostado * 0.05;
            default:
                return 0.0;
        }
    }


    public int[] gerarNumerosLoteria() {
        int[] numeros = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            numeros[i] = random.nextInt(60) + 1;
        }
        return numeros;
    }
}
