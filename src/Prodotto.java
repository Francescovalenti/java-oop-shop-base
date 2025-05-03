import java.util.Random;

// inserimento variabili
public class Prodotto {
   public String Nome;
   public String Descrizione;
   public int Codice;
   public double Prezzo;
   public double iva;

   // inserimento del this per associare il prodotto
   public Prodotto(String Nome, String Descrizione, int Codice, double prezzo, double iva) {
      this.Nome = Nome;
      this.Descrizione = Descrizione;
      Random rand = new Random();
      this.Codice = rand.nextInt(90000) + 10000;
      this.Prezzo = prezzo;
      this.iva = iva;
   }

   // Inserimento metodo prezzo base
   public String getPrezzoFormattato() {
      return String.format("%.2f ", Prezzo);
   }

   // Inserimento metodo iva
   public String getPrezzoIvaFormattato() {
      double prezzoIvato = Prezzo + (Prezzo * iva / 100.0);
      return String.format("%.2f ", prezzoIvato);
   }

   // inserimento stringa codice prodotto piu nome del Prodotto
   public String venduta() {
      return Codice + "-" + Nome;
   }
}
