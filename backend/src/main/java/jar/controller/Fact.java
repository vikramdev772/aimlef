package jar.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Fact {

    @GetMapping("/fact")
    public HashMap<String, Object> factorial(@RequestParam int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        HashMap<String, Object> response = new HashMap<>();
        response.put("number", n);
        response.put("factorial", fact);
        response.put("status", "success");

        return response;
    }
}