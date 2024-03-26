package com.example.prototype;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Endereco endereco = new Endereco("Rua X", 10, "Cidade A", "Estado B", "12345-678");
        Funcionario funcionario = new Funcionario(101, "Funcionario Original", endereco, "Cargo Original");

        Funcionario funcionarioClone = funcionario.clone();
        funcionarioClone.setId(202);
        funcionarioClone.setNome("Funcionario Clonado");
        funcionarioClone.getEndereco().setNumero(20);
        funcionarioClone.setCargo("Cargo Clonado");

        assertEquals("Funcionario{id=101, nome='Funcionario Original', endereco=Endereco{rua='Rua X', numero=10, cidade='Cidade A', estado='Estado B', cep='12345-678'}, cargo='Cargo Original'}", funcionario.toString());
        assertEquals("Funcionario{id=202, nome='Funcionario Clonado', endereco=Endereco{rua='Rua X', numero=20, cidade='Cidade A', estado='Estado B', cep='12345-678'}, cargo='Cargo Clonado'}", funcionarioClone.toString());
    }
}
