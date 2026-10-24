package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {

    protected List<Asset> assets = new ArrayList<>();

    protected Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);

    private int pontos = 0, nivel = 1;

    public Tiro atirar(){

        Tiro nTiro = nave.atirar(nivel);
        assets.add(nTiro);
        return nTiro;

    }

    public Meteoro criarMeteoro(){

        Random random = new Random();

        int x = random.nextInt(590);

        Meteoro nMeteoro = new Meteoro(x,0, nivel, Direcao.BAIXO);
        assets.add(nMeteoro);
        return nMeteoro;

    }

    public int pontuar(){
        pontos+=5;
        if (pontos%10 == 0 && nivel<4){
            nivel++;
        }

        return pontos;


    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
