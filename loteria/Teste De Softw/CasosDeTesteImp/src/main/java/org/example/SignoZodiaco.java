package org.example;
public class SignoZodiaco {
    private int dia;
    private int mes;
    private String signo;

    public SignoZodiaco(int dia, int mes) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > determinarUltimoDiaDoMes(mes)) {
            throw new IllegalArgumentException("Data inválida.");
        }

        this.dia = dia;
        this.mes = mes;
        this.signo = determinarSigno();
    }

    public SignoZodiaco() {

    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido. Deve estar no intervalo de 1 a 31.");
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido. Deve estar no intervalo de 1 a 12.");
        }
        this.mes = mes;
    }

    private String determinarSigno() {
        if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
            return "Áries";
        } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
            return "Touro";
        } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
            return "Gêmeos";
        } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
            return "Câncer";
        } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
            return "Leão";
        } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
            return "Virgem";
        } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
            return "Libra";
        } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
            return "Escorpião";
        } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
            return "Sagitário";
        } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
            return "Capricórnio";
        } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
            return "Aquário";
        } else {
            return "Peixes";
        }
    }

    private int determinarUltimoDiaDoMes(int mes) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasPorMes[mes];
    }

    public String getSigno() {
        return signo;
    }

}
