package Vektörel.RentACar.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import Vektörel.RentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
    boolean existsByName(String name);

}
