import java.util.ArrayList;
import java.util.List;

public class FiltroMenor100Reais extends Filtro {

    public FiltroMenor100Reais() {

    }

    public FiltroMenor100Reais(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public List<Conta> filtra(List<Conta> contas) {

        List<Conta> contasSelecao = new ArrayList<>();

        for (Conta conta : contas) {
            if (conta.getSaldo() < 100) {
                contasSelecao.add(conta);
            }
        }

        contasSelecao.addAll(filtraOutro(contas));

        return contasSelecao;
    }
}
