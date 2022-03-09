package co.com.example.pocstrategypattern.service;

import co.com.example.pocstrategypattern.enums.TypeService;
import org.springframework.stereotype.Component;

@Component
public class RoutesWalking implements RoutesTypeService {

	@Override
	public String getRoute(String a, String b) {
		return String.format(" La ruta de %s a %s se demora 3 Horas", a, b);
	}

	@Override
	public TypeService getTypeService() {
		return TypeService.Walking;
	}
}
