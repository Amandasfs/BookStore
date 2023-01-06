package com.BookStore.Amanda.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStore.Amanda.doMain.*;
import com.BookStore.Amanda.repository.*;

@Service
public class BDService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		//Categoria Datos
				Categoria cat1 = new Categoria(null, "Horror", "Horror Livros");

				Categoria cat2 = new Categoria(null, "Thriller", "Thriller Livros");

				Categoria cat3 = new Categoria(null, "Mystery", "Mystery Livros");

				Categoria cat4 = new Categoria(null, "Romance", "Romance Livros");

				Categoria cat5 = new Categoria(null, "Poetry", "Poetry Livros");
				
				//Livro Datos
				Livro b1 = new Livro(null, "The Mist", "Stephen King", "Lorem ipsum", cat1);
				Livro b2 = new Livro(null, "Those Across the River", "Christopher Buehlman", "Lorem ipsum", cat1);
				Livro b3 = new Livro(null, "Salem’s Lot", "Stephen King", "Lorem ipsum", cat1);
				Livro b4 = new Livro(null, "The Exorcist", "William Peter Blatty", "Lorem ipsum", cat1);
				Livro b5 = new Livro(null, "White Is for Witching ", "Helen Oyeyemi", "Lorem ipsum", cat1);
				
				Livro b6 = new Livro(null, "The Widowmaker", "Hannah Morrissey", "Lorem ipsum", cat2);
				Livro b7 = new Livro(null, "A Mother Would Know", "Amber Garza", "Lorem ipsum", cat2);
				Livro b8 = new Livro(null, "Behind Closed Doors", "Carol Wyer", "Lorem ipsum", cat2);
				Livro b9 = new Livro(null, "THer Sister's Death", "K.L. Murphy", "Lorem ipsum", cat2);
				Livro b10 = new Livro(null, "Find Her", "Sarah A. Denzil", "Lorem ipsum", cat2);
				
				Livro b11 = new Livro(null, "The Enigma of Room 622", "Joël Dicker", "Lorem ipsum", cat3);
				Livro b12 = new Livro(null, "Lavender House", "Lev AC Rosen", "Lorem ipsum", cat3);
				Livro b13 = new Livro(null, "The Other Side of Night", " Adam Hamdy", "Lorem ipsum", cat3);
				Livro b14 = new Livro(null, "The Ink Black Heart", "Robert Galbraith", "Lorem ipsum", cat3);
				Livro b15 = new Livro(null, "Stay Awake", "Megan Goldin", "Lorem ipsum", cat3);
				
				Livro b16 = new Livro(null, "Queen of Myth and Monsters", "Scarlett St. Clair", "Lorem ipsum", cat4);
				Livro b17 = new Livro(null, "Anastasia", "Sophie Lark", "Lorem ipsum", cat4);
				Livro b18 = new Livro(null, "A Dawn of Onyx", "Kate Golden", "Lorem ipsum", cat4);
				Livro b19 = new Livro(null, "A Dash of Salt and Pepper", "Kosoko Jackson", "Lorem ipsum", cat4);
				Livro b20 = new Livro(null, "The Lost Witch", "Paige Crutcher", "Lorem ipsum", cat4);
				
				Livro b21 = new Livro(null, "The Hurting Kind", "Ada Limón", "Lorem ipsum", cat5);
				Livro b22 = new Livro(null, "LVOE: Poems, Epigrams & Aphorisms", "Atticus", "Lorem ipsum", cat5);
				Livro b23 = new Livro(null, "Milk and Honey", "Rupi Kaur", "Lorem ipsum", cat5);
				Livro b24 = new Livro(null, "Home Body", "Rupi Kaur", "Lorem ipsum", cat5);
				Livro b25 = new Livro(null, "Violet Bent Backwards Over the Grass", "Lana Del Rey", "Lorem ipsum", cat5);
				
				
				cat1.getLivros().addAll(Arrays.asList(b1));
				cat1.getLivros().addAll(Arrays.asList(b2));
				cat1.getLivros().addAll(Arrays.asList(b3));
				cat1.getLivros().addAll(Arrays.asList(b4));
				cat1.getLivros().addAll(Arrays.asList(b5));
				
				cat2.getLivros().addAll(Arrays.asList(b6));
				cat2.getLivros().addAll(Arrays.asList(b7));
				cat2.getLivros().addAll(Arrays.asList(b8));
				cat2.getLivros().addAll(Arrays.asList(b9));
				cat2.getLivros().addAll(Arrays.asList(b10));
				
				cat3.getLivros().addAll(Arrays.asList(b11));
				cat3.getLivros().addAll(Arrays.asList(b12));
				cat3.getLivros().addAll(Arrays.asList(b13));
				cat3.getLivros().addAll(Arrays.asList(b14));
				cat3.getLivros().addAll(Arrays.asList(b15));
				
				cat4.getLivros().addAll(Arrays.asList(b16));
				cat4.getLivros().addAll(Arrays.asList(b17));
				cat4.getLivros().addAll(Arrays.asList(b18));
				cat4.getLivros().addAll(Arrays.asList(b19));
				cat4.getLivros().addAll(Arrays.asList(b20));
				
				cat5.getLivros().addAll(Arrays.asList(b21));
				cat5.getLivros().addAll(Arrays.asList(b22));
				cat5.getLivros().addAll(Arrays.asList(b23));
				cat5.getLivros().addAll(Arrays.asList(b24));
				cat5.getLivros().addAll(Arrays.asList(b25));
				
				this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
				this.livroRepository.saveAll(Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10
						, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25));
	}
}
