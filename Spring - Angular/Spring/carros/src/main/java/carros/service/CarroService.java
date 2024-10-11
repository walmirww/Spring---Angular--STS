package carros.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carros.entity.Carro;
import carros.repository.CarroRepository;

@Service
public class CarroService {
	@Autowired
	private CarroRepository carroRepository;
	
	public String save(Carro carro) {
		this.carroRepository.save(carro);
		return "carro salvo com sucesso !";
	}
	
	public Carro findById(Long id) {
		Optional<Carro> carro = this.carroRepository.findById(id);
		return carro.get();
	}
		

}
