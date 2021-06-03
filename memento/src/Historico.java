import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Estado> estadosSalvos = new ArrayList<Estado>();

    public void adiciona(Estado estado) {
        estadosSalvos.add(estado);
    }

    public Estado pega(Integer index) {
        return estadosSalvos.get(index);
    }
}
