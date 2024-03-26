package com.example.classe;

public class DadosEmpresa {
    private DadosEmpresa() {};
    private static DadosEmpresa instance = new DadosEmpresa();
    public static DadosEmpresa getInstance() {
        return instance;
    }
    private String cscProducao;
    private String cnpjEmpresa;


    public String getCscProducao() {
        return cscProducao;
    }

    public void setCscProducao(String cscProducao) {
        this.cscProducao = cscProducao;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }
}
