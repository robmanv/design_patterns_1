package singleton;

public class Program {
    public static void main(String[] args) {
        SingletonDuplaVerificacao objeto = SingletonDuplaVerificacao.getInstance();

        System.out.println(objeto);

        SingletonDuplaVerificacao objeto2 = SingletonDuplaVerificacao.getInstance();

        System.out.println(objeto2);

        /* OBSERVANDO OS PRINTS ESTAMOS USANDO SEMPRE O MESMO OBJETO */
    }
}
