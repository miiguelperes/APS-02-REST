package br.com.impacta.accalculadora;

public class CalculadoraResponse {

    private Double resultado;

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public CalculadoraResponse(Double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "{ resultado:" + resultado +
                '}';
    }
}
