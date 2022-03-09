package co.com.example.pocstrategypattern.controller;

import co.com.example.pocstrategypattern.enums.TypeService;
import co.com.example.pocstrategypattern.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/routes")
@RequiredArgsConstructor
public class Routes {

	private final RouteService routeService;

	@GetMapping("/{a}/{b}/{typeService}")
	public ResponseEntity<String> getRoute(@PathVariable("a") String a, @PathVariable("b") String b, @PathVariable("typeService") String typeService) {

		return new ResponseEntity<>(
			this.routeService.getRoute(a,b, TypeService.valueOf(typeService)
			), HttpStatus.OK);
	}
}