package jar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Fact {

    @PostMapping("/factorial")
    public ResponseEntity<Map<String, Object>> getFactorial(@RequestBody Map<String, Integer> requestBody) {
        int number = requestBody.get("number");
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        Map<String, Object> response = new HashMap<>();
        response.put("inputNumber", number);
        response.put("factorialResult", factorial);
        return ResponseEntity.ok(response);
    }
}

