import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;


public class Main {
    public static void main(String[] args) {

        

        Serie Lost = new Serie();
        Lost.setNome("Lost");
        Lost.setAnoDeLancamento(2000);
        Lost.setTemporada(10);
        Lost.setEpPorTemporada(10);
        Lost.setMinutosPorEpisodio(50);
        Lost.exibeFichaTecnica();

        System.out.println("Duração da série: " + Lost.getDuracaoEmMinutos());

    
      

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
    


    Filme meuFilme = new Filme();
    meuFilme.setNome("Tá Chovendo Hamburguer");
    meuFilme.setAnoDeLancamento(2012);
    meuFilme.setDuracaoEmMinutos(120);

    CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    calculadora.inclui(favorito);
    calculadora.inclui(meuFilme);
    calculadora.inclui(Lost);
    System.out.println(calculadora.getTempoTotal());

    Recomendacao filtro = new Recomendacao();
    filtro.filtrar(meuFilme);
    filtro.filtrar(favorito);
    filtro.filtrar(Lost);


    Episodios episodio = new Episodios();
    episodio.setNumero(11);
    episodio.setSerie(Lost);
    episodio.setTotalVisualizacoes(300);
    filtro.filtrar(episodio);



    
    }
}
