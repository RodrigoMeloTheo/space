package br.com.joaocarloslima;

public class Nave extends Asset implements Atirador{


    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
    }

    public Tiro atirar(int poder){
        return new Tiro(this.x, this.y, 10, Direcao.CIMA, poder);
    }

    @Override
    public void mover() {



            int max = 640-50;
            int min = 0;

            if(this.direcao == Direcao.CIMA)y-=velocidade;
            if(this.direcao == Direcao.BAIXO)y+=velocidade;
            if(this.direcao == Direcao.ESQUERDA)x-=velocidade;
            if(this.direcao == Direcao.DIREITA)x+=velocidade;

            if(x>max) x = max;
            if(x<min) x = min;





    }
}
