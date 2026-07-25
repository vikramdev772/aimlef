 package jar.controller;

import org.springframework.web.bind.annotation.CrossOrigin; // Uses your project's Request/Response DTO if needed
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Sum {

    @PostMapping("/sum")
    public int calculateSum(@RequestBody SumRequest request) {
        return request.getA() + request.getB();
    }
}

class SumRequest {
    private int a;
    private int b;

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    public int getB() { return b; }
    public void setB(int b) { this.b = b; }
}

