package Vektörel.RentACar.business.abstracts;

import java.util.List;

import Vektörel.RentACar.business.requests.CreateBrandRequest;
import Vektörel.RentACar.business.requests.UpdateBrandRequest;
import Vektörel.RentACar.business.responses.GetAllBrandsResponse;
import Vektörel.RentACar.business.responses.GetByIdBrandResponse;

public interface BrandService {
	
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
    
}
