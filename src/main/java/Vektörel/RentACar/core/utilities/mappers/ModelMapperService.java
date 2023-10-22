package Vektörel.RentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public interface ModelMapperService {
 
	ModelMapper forResponse();
	ModelMapper forRequest();
}
