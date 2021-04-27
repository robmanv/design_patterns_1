import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
    // Esta classe abstrata onde declaro o LINK entre FILTROS
    // Colocando UM FILTRO NO CONSTRUTOR DO OUTRO, já que vou subir o FILTRO para o SUPER DESSA CLASSE ABSTRATA
    // Nesta classe chamo o método ESTENDIDO (ABSTRATO) do FILTRO LINKADO, pra RETORNAR as LISTAS FILTRADAS

    protected Filtro outroFiltro;

    public Filtro() {

    }

    public Filtro(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public abstract List<Conta> filtra(List<Conta> contas);

    protected List<Conta> filtraOutro(List<Conta> contas) {
        if (outroFiltro == null)  {
            return new ArrayList<>();
        } else {
            return outroFiltro.filtra(contas);
        }

    }
}
