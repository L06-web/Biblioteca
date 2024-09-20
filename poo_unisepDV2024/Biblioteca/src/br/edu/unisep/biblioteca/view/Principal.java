package br.edu.unisep.biblioteca.view;

import br.edu.unisep.biblioteca.model.Autor;
import br.edu.unisep.biblioteca.model.Emprestimo;
import br.edu.unisep.biblioteca.model.Livro;
import br.edu.unisep.biblioteca.model.Usuario;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Usuario user = new Usuario(1, "Lucas Vieira", "lucasdanielpinheiro825@gmail.com");
        Autor autor = new Autor(1, "Tibursio");
        Livro livro = new Livro(1, "A butina Azul", autor, 2003);
        Emprestimo emp = new Emprestimo(1, livro, user, "23/04/2024", "23/05/2024");

        System.out.println("O livro \"" + livro.getTitulo() + "\" foi emprestado para o usuário " + user.getNome() +
                " na data " + emp.getdataemprestimo() + " com devolução em " + emp.getDataDevolucao() + ".");
    }
}//