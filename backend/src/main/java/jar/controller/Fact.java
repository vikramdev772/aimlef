package jar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Fact {

    @GetMapping("/api/fact")
    public Map<Object, Object> getFact(@RequestParam int n) {
        Map<Object, Object> res = new HashMap<>();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        res.put("name", "fact api");
        res.put("status", 200);
        res.put("number", n);
        res.put("factorial", factorial);
        return res;
    }
}