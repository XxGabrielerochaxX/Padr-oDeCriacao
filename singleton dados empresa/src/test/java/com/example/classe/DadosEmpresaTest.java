package com.example.classe;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class DadosEmpresaTest {

    @Test
    public void DeveRetornarCscProducao() {
        DadosEmpresa.getInstance().setCscProducao("csc_623dhs229shs2");
        Assertions.assertEquals("csc_623dhs229shs2", DadosEmpresa.getInstance().getCscProducao());
    }

    @Test
    public void DeveRetornarCnpjEmpresa() {
        DadosEmpresa.getInstance().setCnpjEmpresa("00.351.280/0001-82");
        Assertions.assertEquals("00.351.280/0001-82", DadosEmpresa.getInstance().getCnpjEmpresa());
    }
}
