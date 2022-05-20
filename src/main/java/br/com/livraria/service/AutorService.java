package br.com.livraria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.livraria.entidades.Autor;

@Service
public class AutorService {

	private List<Autor> lista = new ArrayList<>();

	public List<Autor> listarAutor() {
		return this.lista;
	}

	public Autor buscarAutorPorId(Integer id) {
		Autor autorNoBanco = new Autor();
		for (Autor aut : lista) {
			if (id.equals(aut.getId())) {
				autorNoBanco = aut;
			}
		}
		return autorNoBanco;
	}

	public void adicionarAutor(Autor autor) {
		lista.add(autor);
	}

	public void atualizarAutor(Integer posicaoNaLista, Autor autor) {
		Autor autorNaLista = lista.get(posicaoNaLista);

		autorNaLista.setId(autor.getId());
		autorNaLista.setCodigo(autor.getCodigo());
		autorNaLista.setNome(autor.getNome());
		autorNaLista.setCpf(autor.getCpf());
	}

	public void deletarAutor(Integer posicaoNaLista) {
		lista.remove((int) posicaoNaLista);
	}
}
