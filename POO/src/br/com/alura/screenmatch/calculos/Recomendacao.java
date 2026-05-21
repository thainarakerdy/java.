package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Recomendacao {
    private String recomendacao;

    public void filtrar (Filme favorito ){
        if (favorito.getClassficacao() >= 4) {
            System.out.println("Está entre os prefiridos do momento");
        } else if (favorito.getClassficacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir mais tarde");
        }
    }

    public void filtrar(Episodios episodio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'filtrar'");
    }

    public void filtrar(Serie lost) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'filtrar'");
    }
}
