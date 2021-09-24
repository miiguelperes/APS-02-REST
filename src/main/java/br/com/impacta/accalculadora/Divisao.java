package br.com.impacta.accalculadora;

public class Divisao extends Operacao {

    @Override
    Double executar(Double valor1, Double valor2) throws Exception {
        if (valor2 == 0){
            throw new RuntimeException("Não é possível dividir por 0");
        }
        return valor1 / valor2;
    }
}
