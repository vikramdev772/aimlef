package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class Std {

    @GetMapping()
    Map<Object, Object> m1() {
        Map<Object, Object> res = new HashMap<>();
        res.put("api", "welcome to get api");
        return res;

    }

    @PostMapping()
    Map<Object, Object> m2() {
        Map<Object, Object> res = new HashMap<>();
        res.put("api", "welcome to post api");
        return res;

    }

}
