package Vektörel.RentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import Vektörel.RentACar.business.abstracts.BrandService;
import Vektörel.RentACar.business.requests.CreateBrandRequest;
import Vektörel.RentACar.business.requests.UpdateBrandRequest;
import Vektörel.RentACar.business.responses.GetAllBrandsResponse;
import Vektörel.RentACar.business.responses.GetByIdBrandResponse;
import Vektörel.RentACar.business.rules.BrandBusinessRules;
import Vektörel.RentACar.core.utilities.mappers.ModelMapperService;
import Vektörel.RentACar.dataAccess.abstracts.BrandRepository;
import Vektörel.RentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;
	private BrandBusinessRules brandBusinessRules;
	

	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();

		List<GetAllBrandsResponse> brandsResponse = brands.stream()
				.map(brand -> this.modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class))
				.collect(Collectors.toList());
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
	this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());
		
		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		this.brandRepository.save(brand);
	}

	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand = this.brandRepository.findById(id).orElseThrow();
		GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);

		return response;
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandRepository.save(brand);

	}

	@Override
	public void delete(int id) {

		this.brandRepository.deleteById(id);

	}

}
