import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Filtro filtro = new FiltroMenor100Reais(new FiltroMaior500mil(new FiltroDataCorrente()));

        List<Conta> contas = new ArrayList<>();

        try {
            contas.add(new Conta("Titular 1", 50.0, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2021")));
            contas.add(new Conta("Titular 2", 500001.0, new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021")));
            contas.add(new Conta("Titular 3", 5000.0, new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2021")));
            contas.add(new Conta("Titular 4", 5000.0, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2021")));
            contas.add(new Conta("Titular 5", 5000.0, new SimpleDateFormat("dd/MM/yyyy").parse("01/06/2021")));
            contas.add(new Conta("Titular 6", 5000.0, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2021")));
            contas.add(new Conta("Titular 7", 5000.0, new SimpleDateFormat("dd/MM/yyyy").parse("01/08/2021")));
            contas.add(new Conta("Titular 8", 5000.0, new SimpleDateFormat("dd/MM/yyyy").parse("01/09/2021")));
            contas.add(new Conta("Titular 9", 5000.0, new SimpleDateFormat("dd/MM/yyyy").parse("01/10/2021")));
            contas.add(new Conta("Titular 10", 5000.0, new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2021")));

            List<Conta> contasFiltro = filtro.filtra(contas);

            for (Conta conta : contasFiltro) {
                System.out.println(conta);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
