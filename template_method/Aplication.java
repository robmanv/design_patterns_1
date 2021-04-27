public class Aplication {
    public static void main(String[] args) {
        Orcamento orcamento1;
        orcamento1 = new Orcamento(1000.0);

        orcamento1.addItem(new Item("COLA", 10.0));
        orcamento1.addItem(new Item("LAPIS", 15.0));
        //orcamento1.addItem(new Item("MOCHILA", 500.0));
        
        Orcamento orcamento2;
        orcamento2 = new Orcamento(1000.0);

        orcamento2.addItem(new Item("COLA", 10.0));
        orcamento2.addItem(new Item("LAPIS", 15.0));
        
        Orcamento orcamento3;
        orcamento3 = new Orcamento(1000.0);

        orcamento3.addItem(new Item("COLA", 10.0));
        orcamento3.addItem(new Item("LAPIS", 15.0));
        //orcamento3.addItem(new Item("LAPIS", 15.0));
        
        Imposto imposto1 = new IKCV();
        System.out.println(imposto1.calcula(orcamento1));
        
        Imposto imposto2 = new ICPP();
        System.out.println(imposto2.calcula(orcamento2));
        
        Imposto imposto3 = new IHIT();
        System.out.println(imposto3.calcula(orcamento3));
        

    }
    
}
