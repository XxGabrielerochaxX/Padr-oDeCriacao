package com.example.builder;
import com.example.builder.Funcionario;
import com.example.builder.FuncionarioBuilder;
import org.junit.jupiter.api.Test;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioBuilderTest {

    @Test
    void deveRetornarExcecaoParaFuncionarioSemNome() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setIdFuncionario(1)
                    .setCargo("Analista")
                    .setSalario(5000.0)
                    .setEnderecoLogradouro("Rua XYZ")
                    .setEnderecoNumero(123)
                    .setEnderecoBairro("Bairro ABC")
                    .setEnderecoCidade("Cidade XYZ")
                    .setEnderecoUF("UF")
                    .setCep("12345-678")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemCargo() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setIdFuncionario(1)
                    .setNome("João")
                    .setSalario(5000.0)
                    .setEnderecoLogradouro("Rua XYZ")
                    .setEnderecoNumero(123)
                    .setEnderecoBairro("Bairro ABC")
                    .setEnderecoCidade("Cidade XYZ")
                    .setEnderecoUF("UF")
                    .setCep("12345-678")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cargo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarFuncionarioValido() {
        FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
        Funcionario funcionario = funcionarioBuilder
                .setIdFuncionario(1)
                .setNome("João")
                .setDataNascimento(new Date())
                .setCargo("Analista")
                .setSalario(5000.0)
                .setEnderecoLogradouro("Rua XYZ")
                .setEnderecoNumero(123)
                .setEnderecoBairro("Bairro ABC")
                .setEnderecoCidade("Cidade XYZ")
                .setEnderecoUF("UF")
                .setCep("12345-678")
                .build();

        assertNotNull(funcionario);
    }
}
