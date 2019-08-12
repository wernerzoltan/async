package hu.autsoft.demo.async;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	private BadService badService;
	
	SampleController(BadService badService) {
		this.badService = badService;
	}
	
	@GetMapping(value = "/hello")
	public String greeting() {
		System.out.println("Controller: " + Thread.currentThread().getId());
		badService.someToDo();
		return "hello";
		
	}
		
}