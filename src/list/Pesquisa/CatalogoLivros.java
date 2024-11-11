package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAutor().equals(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        for (Livro l : listaLivros) {
            if (l.getTitulo().equals(titulo)) {
                livroPorTitulo = l;
                break;
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro1", "Autor1", 2020);
        catalogoLivros.adicionarLivro("Livro1", "Autor2", 2021);
        catalogoLivros.adicionarLivro("Livro2", "Autor2", 2022);
        catalogoLivros.adicionarLivro("Livro3", "Autor3", 2023);
        catalogoLivros.adicionarLivro("Livro4", "Autor4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro1"));
    }


}
