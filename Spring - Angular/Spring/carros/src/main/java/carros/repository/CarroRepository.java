package carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carros.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
