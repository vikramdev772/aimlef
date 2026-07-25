package jar.controller;

import jar.dto.SumDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sum {

    @PostMapping("/api/sum/{a}/{b}")
    public SumDto getSum(@PathVariable int a, @PathVariable int b) {
        int result = a + b;
        return new SumDto("sum api", 200, a, b, result);
    }
}
