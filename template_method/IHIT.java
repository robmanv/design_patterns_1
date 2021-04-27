import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImposto {

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.01 * orcamento.getItems().size();
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return temMaisDeDoisItensMesmoNome(orcamento);
    }

    private boolean temMaisDeDoisItensMesmoNome(Orcamento orcamento) {
        List<String> list = new ArrayList<>();
        for (Item item : orcamento.getItems()) {
            if (list.contains(item.getNome())) {
                return true;
            } else {
                list.add(item.getNome());
            }

        }
        return false;
    }

    
}
