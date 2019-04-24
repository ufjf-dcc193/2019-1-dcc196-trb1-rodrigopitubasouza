package com.ufjf.dcc193.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ufjf.dcc193.model.Membro;
import com.ufjf.dcc193.repository.MembroRepository;
import com.ufjf.dcc193.repository.SedeRepository;

@Controller
@RequestMapping("/membros")
public class MembrosController {

	@Autowired
	private MembroRepository membroRepository;
	@Autowired
	private SedeRepository sedeRepository;
	
	@GetMapping
	public ModelAndView membros() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("membros");
		mv.addObject("sedes",sedeRepository.findAll());
		mv.addObject("membros", membroRepository.findAll());
		return mv;
	}
	
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("manter-membro");
		mv.addObject("sedes",sedeRepository.findAll());
		return mv;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("manter-membro");
		mv.addObject("membro",membroRepository.getOne(id));
		mv.addObject("sedes",sedeRepository.findAll());
		return mv;
	}
	
	@GetMapping("/excluir/{id}")
	public RedirectView excluir(@PathVariable Long id) {
		Membro membro = membroRepository.getOne(id);
		membroRepository.delete(membro);
		return new RedirectView("/membros");
	}
	
	@PostMapping({"/manter"})
	public RedirectView manter(Membro membro) {
		membroRepository.save(membro);
		return new RedirectView("/membros");
	}
	
}
	