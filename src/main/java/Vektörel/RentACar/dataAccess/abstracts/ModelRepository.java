package Vektörel.RentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Vektörel.RentACar.entities.concretes.Model;

public interface ModelRepository extends JpaRepository<Model, Integer>{

}
