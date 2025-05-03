public class Main {
    public static void main(String[] args) {
        Prodotto Maglietta  = new Prodotto("Adidas Originals 3striscie nere","Composizione: cotone Collo: girocollo", 0,20,22 );
        System.out.println(Maglietta.venduta());
        System.out.println("Descrizione prodotto:"+" " + Maglietta.Descrizione);
        System.out.println("Il prezzo di base: " + Maglietta.getPrezzo());
        System.out.println("il prezzo con iva: "  + Maglietta.getPrezzoIva());
    }
}
