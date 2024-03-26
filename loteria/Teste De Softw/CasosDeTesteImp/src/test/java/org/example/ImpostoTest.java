package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpostoTest {
    Imposto imposto;
    @BeforeEach
    void setUp() {imposto = new Imposto();}

    @Test
    void deveRetornarImpostoValidoMG() {
        imposto.setEstado("MG");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoDF() {
        imposto.setEstado("DF");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoES() {
        imposto.setEstado("ES");
        imposto.setValor(100.0f);
        assertEquals(17.0f,imposto.calcularImposto());
    }
    @Test
    void deveRetornarImpostoValidoRJ() {
        imposto.setEstado("RJ");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoSP() {
        imposto.setEstado("SP");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoAC() {
        imposto.setEstado("AC");
        imposto.setValor(100.0f);
        assertEquals(17.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoAL() {
        imposto.setEstado("AL");
        imposto.setValor(100.0f);
        assertEquals(17.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoAP() {
        imposto.setEstado("AP");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoAM() {
        imposto.setEstado("AM");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoBA() {
        imposto.setEstado("BA");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoCE() {
        imposto.setEstado("CE");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }



    @Test
    void deveRetornarImpostoValidoGO() {
        imposto.setEstado("GO");
        imposto.setValor(100.0f);
        assertEquals(17.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoMA() {
        imposto.setEstado("MA");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoMT() {
        imposto.setEstado("MT");
        imposto.setValor(100.0f);
        assertEquals(17.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoMS() {
        imposto.setEstado("MS");
        imposto.setValor(100.0f);
        assertEquals(17.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoPA() {
        imposto.setEstado("PA");
        imposto.setValor(100.0f);
        assertEquals(17.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoPB() {
        imposto.setEstado("PB");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoPI() {
        imposto.setEstado("PI");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoPR() {
        imposto.setEstado("PR");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoPE() {
        imposto.setEstado("PE");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoRN() {
        imposto.setEstado("RN");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoRS() {
        imposto.setEstado("RS");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoRO() {
        imposto.setEstado("RO");
        imposto.setValor(100.0f);
        assertEquals(17.5f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoRR() {
        imposto.setEstado("RR");
        imposto.setValor(100.0f);
        assertEquals(17.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoSC() {
        imposto.setEstado("SC");
        imposto.setValor(100.0f);
        assertEquals(17.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoSE() {
        imposto.setEstado("SE");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }

    @Test
    void deveRetornarImpostoValidoTO() {
        imposto.setEstado("TO");
        imposto.setValor(100.0f);
        assertEquals(18.0f,imposto.calcularImposto());
    }
    
    @Test
    void deveRetornarValorValido() {
        imposto.setValor(100.0f);
        assertEquals(100.0f,imposto.getValor());
    }

    @Test
    void deveRetornarValorInvalido() {
        try {
            imposto.setValor(-100.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoInvalido() {
        try {
            imposto.setEstado("AA");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoValidoMG() {
        imposto.setEstado("MG");
        assertEquals("MG",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoRJ() {
        imposto.setEstado("RJ");
        assertEquals("RJ",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoSP() {
        imposto.setEstado("SP");
        assertEquals("SP",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoAC() {
        imposto.setEstado("AC");
        assertEquals("AC",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoAL() {
        imposto.setEstado("AL");
        assertEquals("AL",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoAP() {
        imposto.setEstado("AP");
        assertEquals("AP",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoSC() {
        imposto.setEstado("SC");
        assertEquals("SC",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoSE() {
        imposto.setEstado("SE");
        assertEquals("SE",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoTO() {
        imposto.setEstado("TO");
        assertEquals("TO",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoAM() {
        imposto.setEstado("AM");
        assertEquals("AM",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoBA() {
        imposto.setEstado("BA");
        assertEquals("BA",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoCE() {
        imposto.setEstado("CE");
        assertEquals("CE",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoDF() {
        imposto.setEstado("DF");
        assertEquals("DF",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoES() {
        imposto.setEstado("ES");
        assertEquals("ES",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoGO() {
        imposto.setEstado("GO");
        assertEquals("GO",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoMA() {
        imposto.setEstado("MA");
        assertEquals("MA",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoMT() {
        imposto.setEstado("MT");
        assertEquals("MT",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoMS() {
        imposto.setEstado("MS");
        assertEquals("MS",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoPA() {
        imposto.setEstado("PA");
        assertEquals("PA",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoPB() {
        imposto.setEstado("PB");
        assertEquals("PB",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoPI() {
        imposto.setEstado("PI");
        assertEquals("PI",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoPR() {
        imposto.setEstado("PR");
        assertEquals("PR",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoPE() {
        imposto.setEstado("PE");
        assertEquals("PE",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoRN() {
        imposto.setEstado("RN");
        assertEquals("RN",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoRS() {
        imposto.setEstado("RS");
        assertEquals("RS",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoRO() {
        imposto.setEstado("RO");
        assertEquals("RO",imposto.getEstado());
    }

    @Test
    void deveRetornarEstadoValidoRR() {
        imposto.setEstado("RR");
        assertEquals("RR",imposto.getEstado());
    }


}