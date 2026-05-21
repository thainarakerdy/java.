
public class Audio {
    
        
    private String titulo;
    private double duracao;
    private double totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public void ficha(){
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao);
        System.out.println("Total de reproduções: " + totalDeReproducoes);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Classificação: " + classificacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public double getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalDeReproducoes++;
    }
}

