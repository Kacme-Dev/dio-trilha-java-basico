public class Teste {
    public static void main(String[] args) {

    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLAzyHolder lazyHolder = SingletonLAzyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLAzyHolder.getInstancia();
    System.out.println(lazyHolder);

    ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
    ComportamentoNormal normal = new ComportamentoNormal();
    ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    robo.setComportamento(defensivo);
    robo.mover();
    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
    robo.mover();  
    }
}