package Vektörel.RentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Vektörel.RentACar.business.abstracts.ModelService;
import Vektörel.RentACar.business.requests.CreateModelRequest;
import Vektörel.RentACar.business.responses.GetAllModelsResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
	private ModelService modelService;
	@GetMapping()
	public List<GetAllModelsResponse> getAll(){
		return modelService.getAll();
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateModelRequest createModelRequest) {
		this.modelService.add(createModelRequest);
	}

}
