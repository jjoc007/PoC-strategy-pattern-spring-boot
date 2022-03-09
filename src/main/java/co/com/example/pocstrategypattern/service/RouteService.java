package co.com.example.pocstrategypattern.service;

import co.com.example.pocstrategypattern.enums.TypeService;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteService {

	private Map<TypeService, RoutesTypeService> routes;

	@Autowired
	public RouteService(Set<RoutesTypeService> routesTypeServices) {
		this.routes = routesTypeServices
			.stream()
			.collect(Collectors.toMap(RoutesTypeService::getTypeService
				, routesTypeService -> routesTypeService));
	}

	public String getRoute(String a, String b, TypeService typeService) {
		return routes.get(typeService).getRoute(a, b);
	}
}
