package Vektörel.RentACar.business.rules;

import org.springframework.stereotype.Service;

import Vektörel.RentACar.core.utilities.exceptions.BusinessException;
import Vektörel.RentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
	private BrandRepository brandRepository;

	public void checkIfBrandNameExists(String name) {

		if (this.brandRepository.existsByName(name)) {

			throw new BusinessException("Brand name already exists");

		}

	}
}
