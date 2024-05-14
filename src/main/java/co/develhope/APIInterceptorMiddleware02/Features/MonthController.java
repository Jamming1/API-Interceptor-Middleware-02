package co.develhope.APIInterceptorMiddleware02.Features;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {
    @GetMapping("/getMonth")
    public Object getMonth(HttpServletRequest request) {
        return request.getAttribute("month");
    }
}