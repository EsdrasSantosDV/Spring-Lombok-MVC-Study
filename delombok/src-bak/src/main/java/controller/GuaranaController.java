package controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import services.GuaranaService;

@AllArgsConstructor
@Controller
public class GuaranaController {

    private final GuaranaService guaranaService;
}
