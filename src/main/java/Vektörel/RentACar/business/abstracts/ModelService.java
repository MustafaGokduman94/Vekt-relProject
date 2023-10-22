package Vektörel.RentACar.business.abstracts;

import java.util.List;

import Vektörel.RentACar.business.requests.CreateModelRequest;
import Vektörel.RentACar.business.responses.GetAllModelsResponse;

public interface ModelService {
	
	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest);
}
