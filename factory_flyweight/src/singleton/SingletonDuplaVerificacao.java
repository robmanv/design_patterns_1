package singleton;

public class SingletonDuplaVerificacao {
    /* O MAIS IMPORTANTE AQUI É O GETINSTANCE, AO INVES DE FAZER NEW, CHAMO O GETINSTANCE PRA OBTER A MESMA INSTANCIA DO OBJETO */

    private static SingletonDuplaVerificacao instance;

    private SingletonDuplaVerificacao() {}

    public static SingletonDuplaVerificacao getInstance() {
        if(instance == null) {
            synchronized(SingletonDuplaVerificacao.class) {
                if(instance == null) {
                    instance = new SingletonDuplaVerificacao();
                }
            }
        }
        return instance;
    }

}