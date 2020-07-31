package hello.greet;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entities.Greeting;

@RestController
public class HelloController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
   // @CrossOrigin(origins="http://localhost:4200")  
	@RequestMapping("/hello")
	public Greeting sayHello(@RequestParam(value = "name", defaultValue = "This is my Tutorial") String name) {
		 return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	@RequestMapping("/")
	public Greeting hello(@RequestParam(value = "name", defaultValue = "This is my Tutorial") String name) {
		 return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
}
