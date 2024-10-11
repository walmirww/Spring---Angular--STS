package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Entrada;
import app.entity.Resultado;
import app.service.CalculosService;

@RestController
@RequestMapping("/calculos")
public class CalculosController {
	
	@Autowired
	private CalculosService calculoService;
	
	@GetMapping("/calcular")
	public ResponseEntity<Resultado> calcular(@RequestBody Entrada entrada) {
		
		try {
			
			Resultado resultado = this.calculoService.calcular(entrada);
			return new ResponseEntity<Resultado>(resultado, HttpStatus.OK);
			
		} catch (Exception e) {


			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			
		}
		
	}

}
