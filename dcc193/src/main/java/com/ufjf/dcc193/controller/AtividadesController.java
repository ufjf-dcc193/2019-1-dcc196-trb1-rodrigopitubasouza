package com.ufjf.dcc193.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ufjf.dcc193.model.Atividade;
import com.ufjf.dcc193.repository.AtividadeRepository;
import com.ufjf.dcc193.repository.SedeRepository;

@Controller
@RequestMapping("/atividades")
public class AtividadesController {


	@Autowired
	private AtividadeRepository atividadeRepository;
	@Autowired
	private SedeRepository sedeRepository;
	
	@GetMapping
	public ModelAndView atividades() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("atividades");
		mv.addObject("sedes",sedeRepository.findAll());
		mv.addObject("atividades", atividadeRepository.findAll());
		return mv;
	}
	
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("manter-atividade");
		mv.addObject("sedes",sedeRepository.findAll());
		return mv;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("manter-atividade");
		mv.addObject("atividade",atividadeRepository.getOne(id));
		mv.addObject("sedes",sedeRepository.findAll());
		return mv;
	}
	
	@GetMapping("/excluir/{id}")
	public RedirectView excluir(@PathVariable Long id) {
		Atividade atividade = atividadeRepository.getOne(id);
		atividadeRepository.delete(atividade);
		return new RedirectView("/atividades");
	}
	
	@PostMapping({"/manter"})
	public RedirectView manter(Atividade atividade) {
		atividadeRepository.save(atividade);
		return new RedirectView("/atividades");
	}
}
