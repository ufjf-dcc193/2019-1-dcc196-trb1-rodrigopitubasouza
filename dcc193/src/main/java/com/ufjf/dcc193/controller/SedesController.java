package com.ufjf.dcc193.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ufjf.dcc193.model.Atividade;
import com.ufjf.dcc193.model.Sede;
import com.ufjf.dcc193.repository.SedeRepository;

@Controller
@RequestMapping("/sedes")
public class SedesController {

	@Autowired
	private SedeRepository sedeRepository;
	
	@GetMapping
	public ModelAndView sedes() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sedes");
		mv.addObject("sedes", sedeRepository.findAll());
		return mv;
	}
	
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("manter-sede");
		return mv;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("manter-sede");
		mv.addObject("sede",sedeRepository.getOne(id));
		return mv;
	}
	
	@GetMapping("/excluir/{id}")
	public RedirectView excluir(@PathVariable Long id) {
		Sede sede = sedeRepository.getOne(id);
		if(sede != null && CollectionUtils.isEmpty(sede.getMembroList()) && CollectionUtils.isEmpty(sede.getAtividadeList())){
			sedeRepository.delete(sede);
		}
		return new RedirectView("/sedes");
	}
	
	@PostMapping({"/manter"})
	public RedirectView manter(Sede sede) {
		sedeRepository.save(sede);
		return new RedirectView("/sedes");
	}
	
	@GetMapping("/horas-atividades")
	public ModelAndView horasDasAtividades() {
		List<Atividade> horas = sedeRepository.getHoras();
		ModelAndView mv = new ModelAndView().addObject("horas", horas);
		mv.setViewName("sedes-horas");
	    return mv;
	}
}
	