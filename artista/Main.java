package artista;

public class Main {
    public static void main(String[] args) {
        
        Musico musico1 = new Musico ("Daniel", 19, 15, "Guitarra");
        Pintor pintor1 = new Pintor ("Iago Van Gogh", 29, "Acrílica", 1000);

        musico1.exibirNomeIdade();
        musico1.realizarApresentacao();
        pintor1.exibirNomeIdade();
        pintor1.realizarApresentacao();
    }
}