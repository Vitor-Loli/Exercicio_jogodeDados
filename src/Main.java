import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Dado dado = new Dado(0);
        Teclado teclado = new Teclado();
        List<Jogador> jogadores = new ArrayList<>();

        int numLados = random.nextInt(2, 6);
        String nome1 = teclado.readString("Informe o nome do primeiro jogador: ");
        String nome2 = teclado.readString("Informe o nome do segundo jogador: ");

        if (nome1.equals(nome2)) {
            nome1 = nome1 + " 1";
            nome2 = nome2 + " 2";
        }

        jogadores.add(new Jogador(nome1, numLados));
        jogadores.add(new Jogador(nome2, numLados));

        JogoDeDado jogo = new JogoDeDado(jogadores.get(0), jogadores.get(1),dado);
        jogo.jogar();


    }
}