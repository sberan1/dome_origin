import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Třída slouží pro evidenci CD a videa - pro ukládání instancí tříd CD a Video.
 * Seznam všech uložených CD a videí může být vypsán do textového okna.
 * 
 * Tato verze neukládá data na disk ani neposkytuje funkce pro vyhledání nějakého titulu.
 * 
 * @author Michael Kolling and David J. Barnes
 * @author Luboš Pavlíček
 * @version září 2005
 */
public class Evidence
{
    private List<Polozka> polozky;

    /**
     * Vytvoří prázdnou evidenci.
     */
    public Evidence()
    {
        polozky = new ArrayList<Polozka>();
    }

    /**
     * Přídá CD do evidence.
     */
    public void addPolozka(Polozka polozka){
        polozky.add(polozka);
    }

    /**
     * Vypíše seznam všech aktuálně uložených CD a videi do textového okna.
     */
    public void vypisSeznam()
    {
        // vypíše seznam CD
        for(Polozka polozka : polozky){
            polozka.print();
            System.out.println();   // prázdný řádek mezi položkami
        }
     

        // vypíše seznam videí
        //for ( Video video : polozky){
          //  video.print();
            //System.out.println();   // prázdný řádek mezi položkami
        }
 
    }

