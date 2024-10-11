package app.service;

import org.springframework.stereotype.Service;

import app.entity.Entrada;
import app.entity.Resultado;

@Service
public class CalculosService {
	
	public Resultado calcular(Entrada entrada) {
		Resultado resultado = new Resultado();
		Integer soma = 0;
		Integer maior = 0;
		Integer menor = null;
		
		if (entrada.getLista() != null) {
			for (int i = 0; i < entrada.getLista().size(); i++) {
				soma += entrada.getLista().get(i);
				if (maior < entrada.getLista().get(i)) {
					maior =  entrada.getLista().get(i);
				}
				 if (menor == null || menor > entrada.getLista().get(i)) {
					 menor = entrada.getLista().get(i);
				 }
			}
			
		}
		Double media = (double) (soma / entrada.getLista().size());
		resultado.setSoma(soma);
		resultado.setMedia(media);
		resultado.setMaior(maior);
		resultado.setMenor(menor);
		return resultado;
	}
	
	

}
