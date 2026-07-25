package jar.controller;

import jar.dto.R;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Sum {

    @GetMapping("/sum")
    public ResponseEntity<R> getSumOfNaturalNumbers(@RequestParam int n) {
        int sum = (n * (n + 1)) / 2;
        R response = new R(n, sum);
        return ResponseEntity.ok(response);
    }
}

