package br.com.livraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.livraria.entidades.Autor;
import br.com.livraria.service.AutorService;

@RestController
@RequestMapping("/autor")
public class AutorController {

	@Autowired
	AutorService autorService;

	@GetMapping("/listar")
	public List<Autor> getAutor() {
		return autorService.listarAutor();
	}
	
	@GetMapping("/{id}")
	public Autor buscarAutorPorId(@PathVariable Integer id) {
		return autorService.buscarAutorPorId(id);
	}

	@PostMapping("/adicionar")
	public void adicionar(@RequestBody Autor objetoAutorRecebidoDaApi) {
		autorService.adicionarAutor(objetoAutorRecebidoDaApi);
	}

	@PutMapping("/atualizar/{posicaoNaLista}")
	public void atualizarUsandoPathVariable(@PathVariable Integer posicaoNaLista,
			@RequestBody Autor objetoAutorRecebidoDaApi) {
		autorService.atualizarAutor(posicaoNaLista, objetoAutorRecebidoDaApi);
	}

	@DeleteMapping("/deletar/{posicaoNaLista}")
	public void deletar(@PathVariable Integer posicaoNaLista) {
		autorService.deletarAutor(posicaoNaLista);
	}
}
