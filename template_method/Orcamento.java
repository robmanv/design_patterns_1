import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
    private final double valor;
    private List<Item> items;

    public Orcamento(double valor) {
        this.valor = valor;
        items = new ArrayList<Item>();
    }

    public double getValor() {
        return this.valor;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean contemItemDeNome(String nomeDoItem) {
        for (Item item : items) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
    
}