package co.develhope.APIInterceptorMiddleware02.Features;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Month {
    private Integer monthNumber;
    private String english;
    private String italian;
    private String german;
}