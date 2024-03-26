package com.example.factorymethod;

public class ServicoReservaPassagemFactory {


        public static IServicoPassagem obterServico(String tipo) {
            Class<?> classe;
            Object objeto;
            try {
                classe = Class.forName("com.example.factorymethod.ServicoReservaPassagem" + tipo);
                objeto = classe.newInstance();
            } catch (Exception ex) {
                throw new IllegalArgumentException("Tipo de passagem inexistente");
            }
            if (!(objeto instanceof IServicoPassagem)) {
                throw new IllegalArgumentException("Tipo de passagem inválido");
            }
            return (IServicoPassagem) objeto;
        }



}