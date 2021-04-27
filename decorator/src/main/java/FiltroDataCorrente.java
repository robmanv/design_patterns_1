import java.time.Instant;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FiltroDataCorrente extends Filtro {

    public FiltroDataCorrente() {

    }

    public FiltroDataCorrente(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> contasSelecao = new ArrayList<>();
        Instant instant = Instant.now();
        Calendar cal = Calendar.getInstance();
        cal.setTime(Date.from(instant));

        Calendar cal2 = Calendar.getInstance();

        for (Conta conta : contas) {
            cal2.setTime(conta.getDataAbertura());

            if (cal.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)) {
                contasSelecao.add(conta);
            }
        }

        contasSelecao.addAll(filtraOutro(contas));

        return contasSelecao;
    }
}
