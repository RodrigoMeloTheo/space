package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

import java.util.Random;

public class Meteoro extends Asset implements Destrutivel{

    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);

        Random random = new Random();
        tamanho = random.nextInt(8);

        this.poder = this.tamanho;

        String path = "images/meteoro/meteoro" +poder+".png";
        ImageView imagem = new ImageView(App.class.getResource(path).toString());
        setImagem(imagem);

        System.out.println(path);
    }

    public void tomarTiro(Tiro tiro){
        this.poder -= tiro.getPoder();
        tamanho = poder;
    }

    @Override
    public boolean destruido() {
        return poder<=0;
    }

    @Override
    public void mover() {
        if(this.direcao == Direcao.BAIXO)y+=velocidade;

    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
