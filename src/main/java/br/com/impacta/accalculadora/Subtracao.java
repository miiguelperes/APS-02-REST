package br.com.impacta.accalculadora;

public class Subtracao extends Operacao {

    @Override
    Double executar(Double valor1, Double valor2) {
        return valor1 - valor2;
    }
}
