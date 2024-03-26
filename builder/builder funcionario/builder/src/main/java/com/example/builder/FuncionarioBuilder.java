package com.example.builder;

import java.util.Date;

public class FuncionarioBuilder {

    private Funcionario funcionario;
    public FuncionarioBuilder() {
        funcionario = new Funcionario();
    }

    public Funcionario build() {
        if (funcionario.getIdFuncionario() == 0) {
            throw new IllegalArgumentException("Id inválido");
        }
        if (funcionario.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (funcionario.getCargo().equals("")){
            throw new IllegalArgumentException("Cargo inválido");
        }
        return funcionario;
    }

    public FuncionarioBuilder setIdFuncionario(int idFuncionario) {
        funcionario.setIdFuncionario(idFuncionario);
        return this;
    }

    public FuncionarioBuilder setNome(String nome) {
        funcionario.setNome(nome);
        return this;
    }

    public FuncionarioBuilder setDataNascimento(Date dataNascimento) {
        funcionario.setDataNascimento(dataNascimento);
        return this;
    }

    public FuncionarioBuilder setCargo(String cargo) {
        funcionario.setCargo(cargo);
        return this;
    }

    public FuncionarioBuilder setSalario(double salario) {
        funcionario.setSalario(salario);
        return this;
    }


    public FuncionarioBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        funcionario.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public FuncionarioBuilder setEnderecoNumero(int enderecoNumero) {
        funcionario.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public FuncionarioBuilder setEnderecoBairro(String enderecoBairro) {
        funcionario.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public FuncionarioBuilder setEnderecoCidade(String enderecoCidade) {
        funcionario.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public FuncionarioBuilder setEnderecoUF(String enderecoUF) {
        funcionario.setEnderecoUF(enderecoUF);
        return this;
    }

    public FuncionarioBuilder setCep(String cep) {
        funcionario.setCep(cep);
        return this;
    }

}
