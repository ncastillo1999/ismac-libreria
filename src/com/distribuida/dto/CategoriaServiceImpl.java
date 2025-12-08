package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired 
	private CategoriaDAO categoriaDAO;
	
	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return categoriaDAO.findAll();
	}

	@Override
	public Categoria findOne(int id) {
		// TODO Auto-generated method stub
		return categoriaDAO.findOne(id);
	}

	@Override
	public void add(int idCategoria, String categoria, String descripcion) {
		// TODO Auto-generated method stub
		Categoria categoria1 = new Categoria(idCategoria,categoria,descripcion);
		categoriaDAO.add(categoria1);
	}


	@Override
	public void up(int idCategoria, String categoria, String descripcion) {
		// TODO Auto-generated method stub
		Categoria categoria1 = new Categoria(idCategoria,categoria,descripcion);
		categoriaDAO.up(categoria1);
	}

	
	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Categoria> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return categoriaDAO.findAll();
	}

}
