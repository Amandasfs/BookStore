package com.BookStore.Amanda.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.BookStore.Amanda.DTO.CategoriaDTO;
import com.BookStore.Amanda.doMain.Categoria;
import com.BookStore.Amanda.repository.CategoriaRepository;
import com.BookStore.Amanda.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Categoria não encontrada! O id "+ id +" não existe"));
	} 
	
	public List<Categoria>findAll(){
		return repository.findAll();
	}
	
	public Categoria create(Categoria obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public Categoria update(Integer id, CategoriaDTO objDto) {
		Categoria obj = findById(id);
		obj.setNome(objDto.getNome());
		obj.setDescricao(objDto.getDescricao());
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		findById(id);
		try{
			repository.deleteById(id);
		}catch (org.springframework.dao.DataIntegrityViolationException e) {
			throw new com.BookStore.Amanda.service.exceptions.DataIntegrityViolationException("Essa Categoria não pode ser deletada, pois, possui livros cadastrados");
		}
	}
}
