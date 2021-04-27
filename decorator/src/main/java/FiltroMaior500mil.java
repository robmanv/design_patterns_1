import java.util.ArrayList;
import java.util.List;

public class FiltroMaior500mil extends Filtro {

    public FiltroMaior500mil() {

    }

    public FiltroMaior500mil(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> contasSelecao = new ArrayList<>();

        for (Conta conta : contas) {
            if (conta.getSaldo() > 500000.0) {
                contasSelecao.add(conta);
            }
        }

        contasSelecao.addAll(filtraOutro(contas));

        return contasSelecao;
    }
}
