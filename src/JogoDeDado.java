public class JogoDeDado {
    private Jogador jogador1;
    private Jogador jogador2;
    private Dado dado;

    public JogoDeDado(Jogador jogador1, Jogador jogador2, Dado dado) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.dado = dado;
    }

    public void jogar() {
        boolean vencedor = false;

        while (!vencedor) {
            int resultado1 = jogador1.rolarDado();
            int resultado2 = jogador2.rolarDado();

            System.out.println(jogador1.getNome() + " tirou: " + resultado1);
            System.out.println(jogador2.getNome() + " tirou: " + resultado2);

            if (resultado1 > resultado2) {
                System.out.println(jogador1.getNome() + " venceu!");
                vencedor = true;
            } else if (resultado2 > resultado1) {
                System.out.println(jogador2.getNome() + " venceu!");
                vencedor = true;
            } else {
                System.out.println("Empate! Jogando novamente...\n");
            }
        }
    }
}