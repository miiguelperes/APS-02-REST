package br.com.impacta.accalculadora;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculadora")
public class CalculadoraController {

    @GetMapping("/{valor1}/{valor2}/{operador}")
    public ResponseEntity calcular(@PathVariable Double valor1, @PathVariable Double valor2, @PathVariable String operador){
        var resultado = new Calculadora().calcular(valor1, valor2, operador);
        if (resultado != 0.0){
            return ResponseEntity.ok(String.format("resultado: %.2f ", resultado));
        }
        return ResponseEntity.notFound().build();
    }
}
