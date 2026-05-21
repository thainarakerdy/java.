public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + "um grande sucesso!");
        } else {
            System.out.println(audio.getTitulo() + "também é legal!");
        }
    }
}
