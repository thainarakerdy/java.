public class Principal {
    public static void main(String[] args) {
        

        Musica minhamusica = new Musica(); 
        minhamusica.setTitulo("Anjos ");
        minhamusica.setArtista("O Rappa ");

        for (int i = 0; i < 1100; i++) {
            minhamusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhamusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("NSei ");
        meuPodcast.setApresentador("Thainara ");

        for (int i = 0; i < 1100; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhamusica);

    }
}
