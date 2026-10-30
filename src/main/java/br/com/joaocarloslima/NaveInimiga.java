package br.com.joaocarloslima;

public class NaveInimiga extends Asset implements Destrutivel, Atirador{

    int poder = 1;


    public NaveInimiga(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
    }

    @Override
    public void mover() {

    }

    @Override
    public Tiro atirar(int poder) {
        return new Tiro(getX(), getY(), 10, Direcao.BAIXO, 1);
    }

    @Override
    public void tomarTiro(Tiro tiro) {
        poder -= tiro.getPoder();

    }

    @Override
    public boolean destruido() {
        return poder<=0;
    }
}
