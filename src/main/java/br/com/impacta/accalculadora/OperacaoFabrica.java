package br.com.impacta.accalculadora;

public class OperacaoFabrica {
     <T extends Operacao> Operacao criar(String operador) throws Exception {
        switch (operador){
            case "adicao":
                return new Adicao();
            case "subtracao":
                return new Subtracao();
            case "divisao":
                return new Divisao();
            case "multiplicacao":
                return new Multiplicacao();
            default:
                throw new RuntimeException("OPERAÇÃO INVÁLIDA");
        }
    }
}
