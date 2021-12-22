package micro2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro2")
public class controller {

	@GetMapping(path="/micro2")
	public String helloWorld() {
		return "Hello micro2";
	}
}
