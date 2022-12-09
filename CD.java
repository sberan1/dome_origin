/**
 * Třída CD představuje jedno cédéčko. Informace o cédéčku je možné
 * ukládat a získávat. K cédečku lze nastavit komentář a příznak o vlastnictví
 * kopie CD.
 * 
 * @author Michael Kolling and David J. Barnes
 * @author Luboš Pavlíček
 * @version září 2005
 */
public class CD extends Polozka
{
    private String umelec;
    private int pocetSkladeb;


    /**
     * Inicializace CD. Vlastnictví kopie CD je potřeba nastavit pomocí metody
     * setOwn.
     * 
     * @param titul         titul CD
     * @param umelec        umělec (zpěvák apod.)
     * @param pocetSkladeb  počet skladeb
     * @param delka         délka nahrávky v minutách
     */
    public CD(String titul, String umelec, int pocetSkladeb, int delka)
    {
        super(titul, delka);
        this.umelec = umelec;
        this.pocetSkladeb = pocetSkladeb;

    }

    /**
     * Vypíše informace o CD do textového okna.
     */
    public void print()
    {
        System.out.print("CD: " + getTitul() + " (" + getDelka() + " min)");
        if(getVlastnim()) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("    " + umelec);
        System.out.println("    počet skladeb: " + pocetSkladeb);
        System.out.println("    " + getComment());
    }
}
