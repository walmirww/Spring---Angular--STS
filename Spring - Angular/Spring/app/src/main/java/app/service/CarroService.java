package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Carro;
import app.entity.Marca;
import app.repository.CarroRepository;


@Service
public class CarroService {
	@Autowired
	private CarroRepository carroRepository;
	
	public String save(Carro carro) {
		this.carroRepository.save(carro);
		return "Entrada salva com sucesso!";
	}
	
	public String update(Carro carro, long id) {
		carro.setId(id);
		this.carroRepository.save(carro);
		return "Entrada salva com sucesso!";
	}
	
	public String delete(long id) {
		this.carroRepository.deleteById(id);
		return "Registro deletado com sucesso!";
	}
	
	public List<Carro> findAll(){
		List<Carro> lista = this.carroRepository.findAll();
		return lista;
	}
	
	public Carro findById(long id) {
		Carro carro = this.carroRepository.findById(id).get();
		return carro;
	}

	// ---------------------------------------------------
	public List<Carro> findByNome(String nome){
		List<Carro> lista = this.carroRepository.findByNomeContaining(nome);
		return lista;
	}
	
	public List<Carro> findByMarcaNome(String nome){
		List<Carro> lista = this.carroRepository.findByMarcaNome(nome);
		return lista;
	}
	
	public List<Carro> findByMarca(long idMarca){
		Marca marca = new Marca();
		marca.setId(idMarca);
		List<Carro> lista = this.carroRepository.findByMarca(marca);
		return lista;
	}
	
	public List<Carro> findAnoAcima(int ano){
		List<Carro> lista = this.carroRepository.findAnoAcima(ano);
		return lista;
	}

}
