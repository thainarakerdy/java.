import br.com.alura.screenmatch.Filme;
import br.com.alura.screenmatch.Serie;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Serie Lost = new Serie();
        Lost.setNome("Lost");
        Lost.setAnoDeLancamento(2000);
        Lost.exibeFichaTecnica();
        Lost.setTemporada(10);
        Lost.setEpPorTemporada(10);
        Lost.setMinutosPorEpisodio(50);

        System.out.println("Duração do filme: " + Lost.getDuracaoEmMinutos());

    
      

        Filme favorito = new Filme();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());
    }
}
