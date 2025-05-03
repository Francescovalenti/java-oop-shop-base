import java.util.Random;

public class Prodotto {
    public String Nome;
    public String Descrizione;
    public int Codice;
    public int prezzo;
    public int iva;

    public Prodotto (String Nome,String Descrizione, int Codice, int prezzo,int iva){
        this.Nome="Adidas Originals 3striscie nere";
        this.Descrizione="Brand: Adidas Originals Righe Logo Composizione: cotone Collo: girocollo";
        Random rand = new Random();
        this.Codice = rand.nextInt(90000) + 10000;
        this.prezzo=
        this.iva=
    }

    }

