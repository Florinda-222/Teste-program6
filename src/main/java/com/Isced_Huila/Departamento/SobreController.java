package com.Isced_Huila.Departamento;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/teste")
public class SobreController {
@GetMapping
    public String paginaSobre() {
 return "index";

    }
}
