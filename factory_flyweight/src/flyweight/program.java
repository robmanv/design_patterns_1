package flyweight;

import java.util.Arrays;
import java.util.List;

public class program {
    public static void main(String[] args) {
        /* FLYWEIGHT - GUARDA UMA INSTANCIA DE OBJETOS E RETORNA A MESMA QUANDO UTILIZO (CONSUMO BAIXO DE MEMÓRIA) */

        NotasMusicais notas = new NotasMusicais();

        List<Nota> musica = Arrays.asList(
                notas.pega("do"),
                notas.pega("re"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("_"),

                notas.pega("do"),
                notas.pega("re"),
                notas.pega("do"),
                notas.pega("re"),
                notas.pega("re"),
                notas.pega("re"),
                notas.pega("_"),

                notas.pega("do"),
                notas.pega("sol"),
                notas.pega("fa"),
                notas.pega("mi"),
                notas.pega("mi"),
                notas.pega("mi"),
                notas.pega("_"),

                notas.pega("do"),
                notas.pega("re"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("fa")
        );

        /* Será utilizado sempre a mesma instância do fa por exemnplo */

        Piano piano = new Piano();
        piano.toca(musica);

        System.out.println(notas.getNotas());
    }
}
