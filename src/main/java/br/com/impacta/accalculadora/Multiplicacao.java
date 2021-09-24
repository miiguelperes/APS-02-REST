package br.com.impacta.accalculadora;

public class Multiplicacao extends Operacao {

    @Override
    Double executar(Double valor1, Double valor2) {
        return valor1 * valor2;
    }
}
