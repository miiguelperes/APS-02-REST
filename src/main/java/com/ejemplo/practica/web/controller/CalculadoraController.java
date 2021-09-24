package com.ejemplo.practica.web.controller;

import com.ejemplo.practica.domain.dto.CalculadoraRequest;
import com.ejemplo.practica.domain.dto.CalculadoraResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    @PostMapping("/a")
    @ApiOperation("Introduce la operacion con el simbolo, suma, resta, multi, division")
    public CalculadoraResponse calcular(@RequestBody CalculadoraRequest calculadoraRequest) {

        CalculadoraResponse calculadoraResponse = new CalculadoraResponse();
        calculadoraResponse.setResultado(0.0);

        try {
            switch (calculadoraRequest.getOperacion()) {
                case "+":
                    calculadoraResponse.setResultado(calculadoraRequest.getNumero1() + calculadoraRequest.getNumero2());
                    break;
                case "-":
                    calculadoraResponse.setResultado(calculadoraRequest.getNumero1() - calculadoraRequest.getNumero2());
                    break;
                case "*":
                    calculadoraResponse.setResultado(calculadoraRequest.getNumero1() * calculadoraRequest.getNumero2());
                    break;
                case "/":
                    calculadoraResponse.setResultado(calculadoraRequest.getNumero1() / calculadoraRequest.getNumero2());
                    break;
                default:
                    break;

            }
        } catch (Exception e) {

        }

        return calculadoraResponse;
    }
}
