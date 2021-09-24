package br.com.impacta.accalculadora;

public class Calculadora {
    Double calcular(Double valor1, Double valor2, String operador){
        var fabrica = new OperacaoFabrica();
        Operacao calculo = null;
        try {
            Double resultado = 0.0;
            calculo = fabrica.criar(operador);
            resultado = calculo.executar(valor1, valor2);
            return resultado;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
