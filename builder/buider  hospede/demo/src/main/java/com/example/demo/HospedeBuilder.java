package com.example.demo;


import java.util.Date;

public class HospedeBuilder {

    private Hospede hospede;

    public HospedeBuilder() {
        this.hospede = new Hospede();
    }

    public Hospede build() {
        if (hospede.getIdHospede() == 0) {
            throw new IllegalArgumentException("Id inválido");
        }
        if (hospede.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (hospede.getEmail().equals("")) {
            throw new IllegalArgumentException("Email inválido");
        }

        return hospede;
    }

    public HospedeBuilder setIdHospede(int idHospede) {
        hospede.setIdHospede(idHospede);
        return this;
    }

    public HospedeBuilder setNome(String nome) {
        hospede.setNome(nome);
        return this;
    }

    public HospedeBuilder setDataNascimento(Date dataNascimento) {
        hospede.setDataNascimento(dataNascimento);
        return this;
    }

    public HospedeBuilder setEmail(String email) {
        hospede.setEmail(email);
        return this;
    }

    public HospedeBuilder setTelefone(String telefone) {
        hospede.setTelefone(telefone);
        return this;
    }

    public HospedeBuilder setNacionalidade(String nacionalidade) {
        hospede.setNacionalidade(nacionalidade);
        return this;
    }

    public HospedeBuilder setDocumentoIdentidade(String documentoIdentidade) {
        hospede.setDocumentoIdentidade(documentoIdentidade);
        return this;
    }

    public HospedeBuilder setEnderecoRua(String enderecoRua) {
        hospede.setEnderecoRua(enderecoRua);
        return this;
    }

    public HospedeBuilder setEnderecoNumero(int enderecoNumero) {
        hospede.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public HospedeBuilder setEnderecoBairro(String enderecoBairro) {
        hospede.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public HospedeBuilder setEnderecoCidade(String enderecoCidade) {
        hospede.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public HospedeBuilder setEnderecoUF(String enderecoUF) {
        hospede.setEnderecoUF(enderecoUF);
        return this;
    }

    public HospedeBuilder setCep(String cep) {
        hospede.setCep(cep);
        return this;
    }
}
