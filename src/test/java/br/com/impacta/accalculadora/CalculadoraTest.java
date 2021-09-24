package br.com.impacta.accalculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    void naoDeveriaCalcularComOperadorInvalido(){
        assertThrows(RuntimeException.class, () -> calculadora.calcular(1.0,2.0,"teste"));
    }

    @Test
    void naoDeveriaDividirPorZero(){
        assertThrows(RuntimeException.class, () -> calculadora.calcular(1.0,0.0,"divisao"));
    }

    @Test
    void deveriaSomarEDarDez(){
        assertEquals(10, calculadora.calcular(5.0,5.0,"adicao"));
    }

    @Test
    void deveriaSubtrairEDarDois(){
        assertEquals(2, calculadora.calcular(5.0,3.0,"subtracao"));
    }

    @Test
    void deveriaDividirEDarCinco(){
        assertEquals(5, calculadora.calcular(10.0,2.0,"divisao"));
    }

    @Test
    void deveriaMultiplicarEDarCentoEVinte(){
        assertEquals(120.0, calculadora.calcular(30.0,4.0,"multiplicacao"));
    }

}