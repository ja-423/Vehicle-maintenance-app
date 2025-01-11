package app.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api")
public class AppController {
    @GetMapping("/hello")
    @Operation(summary = "Returns a greeting message")
    public String sayHello() {
        return "Hello, World!";
    }
}