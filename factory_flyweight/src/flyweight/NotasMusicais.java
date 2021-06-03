package flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {

    /* AO INSTANCIAR ESSE OBJETO JÁ CARREGA O MAP COM AS INSTANCIAS DE CADA NOTA, COM STRING E OBJETO */

    private static Map<String, Nota> notas = new HashMap<String, Nota>();

//    static {
//        notas.put("do", new Do());
//        notas.put("re", new Re());
//        notas.put("mi", new Mi());
//        notas.put("fa", new Fa());
//        notas.put("sol", new Sol());
//        notas.put("la", new La());
//        notas.put("si", new Si());
//        notas.put("_", new Pause());
//    }
//
    public Nota pega(String nome) {
        if (notas.get(nome) == null) {
            switch (nome) {
                case "do":
                    notas.put("do", new Do());
                    break;

                case "re":
                    notas.put("re", new Re());
                    break;

                case "mi":
                    notas.put("mi", new Mi());
                    break;

                case "fa":
                    notas.put("fa", new Fa());
                    break;

                case "sol":
                    notas.put("sol", new Sol());
                    break;

                case "la":
                    notas.put("la", new La());
                    break;

                case "si":
                    notas.put("si", new Si());
                    break;

                case "_":
                    notas.put("_", new Pause());
                    break;

                default:
                    break;
            }

        }

        return notas.get(nome);
    }

    public Map<String, Nota> getNotas() {
        return notas;
    }
}
