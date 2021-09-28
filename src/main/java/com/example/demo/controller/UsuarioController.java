package com.example.demo.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.dao.IUsuarioDAO;
import com.example.demo.models.entity.Usuario;

@Controller 
public class UsuarioController {

	@Autowired
	private IUsuarioDAO usuarioDao;
	
	@RequestMapping(value="/")
	public String home(Model model) {
		model.addAttribute("titulo", "Home");
		
		return "home";
	}
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", usuarioDao.findAll());
		return "listar";
	}
	
	@RequestMapping(value="/form")
	public String crear(Map<String, Object> model) {	
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		model.put("titulo", "Formulario de usuario");
		return "form";
	}
	
	@RequestMapping(value="/form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String,
			Object> model) {
		Usuario usuario = null;
		if(id>0) {
			usuario = usuarioDao.findOne(id);
		}else {
			return "redirect:/listar";
		}
		
		model.put("usuario", usuario);
		model.put("titulo", "Editar Usuario");
		return "form";
	}
	
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String guardar(@Valid Usuario usuario, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("titulo","Formulario de usuario");
			return "form";
		}
		
		usuarioDao.save(usuario);
		return "redirect:/listar";
	}
	
	@RequestMapping(value="/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		
		if(id>0) {
			usuarioDao.delete(id);
		}
		return "redirect:/listar";
	}
}
