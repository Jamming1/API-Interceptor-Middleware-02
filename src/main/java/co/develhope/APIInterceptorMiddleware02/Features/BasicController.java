package co.develhope.APIInterceptorMiddleware02.Features;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BasicController {
    @GetMapping
    public String welcome() {
        return "Wilkommennnnnnn jaaaaa!!";
    }
}