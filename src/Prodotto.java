import java.util.Random;

public class Prodotto {
    public String Nome;
    public String Descrizione;
    public int Codice;
    public int Prezzo;
    public int iva;

    public Prodotto (String Nome,String Descrizione, int Codice, int prezzo,int iva){
        this.Nome=Nome;
        this.Descrizione=Descrizione;
        Random rand = new Random();
        this.Codice = rand.nextInt(90000) + 10000;
        this.Prezzo=prezzo;
        this.iva=iva;
    }
     public int getPrezzo (){
        return Prezzo;
     }
     public int getPrezzoIva(){
        return Prezzo + ((Prezzo * iva ) /100);
     }

     public String venduta(){
        return Codice + "-" + Nome + " " + Descrizione;
     }
    }

