import java.util.Calendar;

public class Program {
    public static void main(String[] args) {
    /* BRIDGE - Semelhante ao Strategy temos uma INTERFACE com uma implementação diferente, objetivo de chegar em outro sistema, caminho pra outro sistema */
        /* PONTE ENTRE SISTEMAS */
        Mapa mapa = new GoogleMaps();
        mapa.devolveMapa("Rua Vergueiro");

    /* ADAPTER
            Tenho uma INTERFACE que esconde o sistema legado ao novo mundo, adapta um código antigo, chamamos de Adapter (IMPLEMENTAÇÃO IGUAL MAS SEMANTICA MUDA EM RELAÇÃO AO BRIDGE)
            ADAPTADOR VIA INTERFACE COM CÓDIGOS ANTIGOS
     */
    Relogio relogioComCalendar = new RelogioComCalendar();
    Calendar dataAtual = relogioComCalendar.hoje();



    }
}
