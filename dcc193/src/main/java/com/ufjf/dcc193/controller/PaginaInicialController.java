package com.ufjf.dcc193.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "index","pagina-inicial","home"})
public class PaginaInicialController {

	@GetMapping
	public String home() {
        return "pagina-inicial";
    }
}
