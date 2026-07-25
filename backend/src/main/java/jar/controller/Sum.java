package jar.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.SumDto;

@RestController
@RequestMapping("/api")
public class Sum {

    @PostMapping("/sum/{a}/{b}")
    public SumDto sum(@PathVariable int a,
                      @PathVariable int b) {

        return new SumDto(a, b, a + b);
    }
}