package com.example.demo.models.dao;

import java.util.List;

import com.example.demo.models.entity.Usuario;

public interface IUsuarioDAO {

	public List<Usuario> findAll();
	
	public void save(Usuario usuario);
	
	public Usuario findOne(Long id);
	
	public void delete(Long id);
}
