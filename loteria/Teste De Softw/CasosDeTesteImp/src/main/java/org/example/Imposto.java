package org.example;

public class Imposto {
     private String estado;
     private float valor;

    public String getEstado() {
        return estado;
    }


    public Double calcularImposto() {

        float aliquota;

        if (this.estado.equals("AC") || this.estado.equals("AL") || this.estado.equals("ES") || this.estado.equals("GO") || this.estado.equals("MT") || this.estado.equals("MS") || this.estado.equals("PA") || this.estado.equals("RR") || this.estado.equals("SC")) {
            aliquota = 0.17f;
        }
        else {
            if (this.estado.equals("RO")) {
                aliquota = 0.175f;
            }
            else {
                aliquota = 0.18f;
            }
        }
        double valorimposto = aliquota*valor;
        return valorimposto;
    }

    public void setEstado(String estado) {
        if(estado.equals("MG") || estado.equals("RJ") || estado.equals("SP") || estado.equals("AC") || estado.equals("AL") || estado.equals("AP") || estado.equals("AM") || estado.equals("BA") || estado.equals("CE") || estado.equals("DF") || estado.equals("ES") || estado.equals("GO") || estado.equals("MA") || estado.equals("MT") || estado.equals("MS") || estado.equals("PA") || estado.equals("PB") || estado.equals("PR") || estado.equals("PE") || estado.equals("PI") || estado.equals("RN") || estado.equals("RS") || estado.equals("RO") || estado.equals("RR") || estado.equals("SC") || estado.equals("SE") || estado.equals("TO")) {
            this.estado = estado;
        }
        else {
            throw new IllegalArgumentException("Estado inválido!");
        }
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if(valor <= 0.0f) {
            throw new IllegalArgumentException("Valor inválido!");
        }
        else {
            this.valor = valor;
        }
    }


}
