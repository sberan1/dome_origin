/**
 * Třída Video představuje jedno video (jeden pořad/nahrávku). Informace o videu je možné
 * ukládat a získávat. K nahrávce lze nastavit komentář a zda vlastníme kopii videa.
 * 
 * @author Michael Kolling and David J. Barnes
 * @author Luboš Pavlíček
 * @version  září 2005
 */
public class Video extends Polozka
{

    private String reziser;


    /**
     * Konstruktor pro vytvoření instance třídy Video. Vlastnictví nahrávky je potřeba
     * nastavit samostatně pomocí metody setOwn
     * 
     * @param   titul   titul videokazety/nahrávky
     * @param   reziser režisér nahrávky
     * @param   delka     délka nahrávky v minutách
     */
    public Video(String titul, String reziser, int delka)
    {
        super(titul, delka);
        this.reziser = reziser;
    }

    /**
     * Vypíše informace o videu do textového okna.
     */
    public void print()
    {
        System.out.print("video: " + getTitul() + " (" + getDelka() + " min)");
        if(getVlastnim()) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("    " + reziser);
        System.out.println("    " + getComment());
    }
}
