import java.util.Random;

public class Jogador {
    private String nome;
    private Dado dadoRolado;
    Random random = new Random();

    public Jogador(String nome, int lados) {
        setNome(nome);
        this.dadoRolado = new Dado(lados);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int rolarDado(){
        return random.nextInt(1, dadoRolado.getLados() + 1);
    }
}
