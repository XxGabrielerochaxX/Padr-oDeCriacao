package com.example.prototype;

public class Funcionario implements Cloneable {
    private int id;
    private String nome;
    private Endereco endereco;
    private String cargo;

    public Funcionario(int id, String nome, Endereco endereco, String cargo) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public Funcionario clone() throws CloneNotSupportedException {
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.endereco = (Endereco) funcionarioClone.endereco.clone();
        return funcionarioClone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
