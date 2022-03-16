package com.projeto.filmes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.filmes.model.Filme;
import com.projeto.filmes.repository.FilmeRepository;



@Service
public class FilmeService implements ServiceInterface<Filme>{
	
	@Autowired
	private FilmeRepository repository;

	public FilmeService() {
	}

	@Override
	public Filme create(Filme filme) {
		repository.save(filme);
		return filme;
	}
	
	@Override
	public List<Filme> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Filme findById(Long id) {
		Optional<Filme> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public boolean update(Filme filme) {
		if (repository.existsById(filme.getId())) {
			repository.save(filme);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean delete(Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}
	


}
