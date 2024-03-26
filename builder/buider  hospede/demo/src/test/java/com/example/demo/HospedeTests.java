package com.example.demo;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class HospedeBuilderTest {

    @Test
    void deveRetornarExcecaoParaHospedeSemNome() {
        try {
            HospedeBuilder hospedeBuilder = new HospedeBuilder();
            Hospede hospede = hospedeBuilder
                    .setIdHospede(1)
                    .setEmail("joao@example.com")
                    .setTelefone("123456789")
                    .setNacionalidade("Brasileiro")
                    .setDocumentoIdentidade("123456789")
                    .setEnderecoRua("Rua XYZ")
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
    void deveRetornarExcecaoParaHospedeSemEmail() {
        try {
            HospedeBuilder hospedeBuilder = new HospedeBuilder();
            Hospede hospede = hospedeBuilder
                    .setIdHospede(1)
                    .setNome("João")
                    .setTelefone("123456789")
                    .setNacionalidade("Brasileiro")
                    .setDocumentoIdentidade("123456789")
                    .setEnderecoRua("Rua XYZ")
                    .setEnderecoNumero(123)
                    .setEnderecoBairro("Bairro ABC")
                    .setEnderecoCidade("Cidade XYZ")
                    .setEnderecoUF("UF")
                    .setCep("12345-678")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Email inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarHospedeValido() {
        HospedeBuilder hospedeBuilder = new HospedeBuilder();
        Hospede hospede = hospedeBuilder
                .setIdHospede(1)
                .setNome("João")
                .setDataNascimento(new Date())
                .setEmail("joao@example.com")
                .setTelefone("123456789")
                .setNacionalidade("Brasileiro")
                .setDocumentoIdentidade("123456789")
                .setEnderecoRua("Rua XYZ")
                .setEnderecoNumero(123)
                .setEnderecoBairro("Bairro ABC")
                .setEnderecoCidade("Cidade XYZ")
                .setEnderecoUF("UF")
                .setCep("12345-678")
                .build();

        assertNotNull(hospede);
    }
}
