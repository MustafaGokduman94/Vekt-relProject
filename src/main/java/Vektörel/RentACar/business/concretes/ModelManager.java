package Vektörel.RentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import Vektörel.RentACar.business.abstracts.ModelService;
import Vektörel.RentACar.business.requests.CreateModelRequest;
import Vektörel.RentACar.business.responses.GetAllModelsResponse;
import Vektörel.RentACar.core.utilities.mappers.ModelMapperService;
import Vektörel.RentACar.dataAccess.abstracts.ModelRepository;
import Vektörel.RentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class ModelManager implements ModelService {
	private ModelRepository modelrepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllModelsResponse> getAll() {

		List<Model> models = modelrepository.findAll();

		List<GetAllModelsResponse> modelsResponses = models.stream()
				.map(model -> this.modelMapperService.forResponse().map(models, GetAllModelsResponse.class))
				.collect(Collectors.toList());
		return modelsResponses;
	}

	@Override
	public void add(CreateModelRequest createModelRequest) {
		Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
		this.modelrepository.save(model);

	}
}
