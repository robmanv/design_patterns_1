package chain_of_responsability.discount_calculator2;

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

    
}