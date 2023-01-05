/**
 * Rodic trid CD a Video
 *
 */

public abstract class AbastractMedium implements Polozka{
    private String titul;
    private int delka;
    private boolean vlastnim;
    private String komentar;


    public AbastractMedium(String titul, int delka) {
        this.titul = titul;
        this.delka = delka;
        vlastnim = false;
        komentar = "<no comment>";
    }

    /**
     * Vlož komentář k polozce.
     *
     * @param komentar   komentář k polozce
     */
    public void setComment(String komentar)
    {
        this.komentar = komentar;
    }

    /**
     * Vrací komentář k teto polozce.
     *
     * @return      komentář k polozce
     */
    public String getComment()
    {
        return komentar;
    }

    /**
     * nastavení příznaku, zda vlastníme polozku.
     *
     * @param    vlastnim   true, pokud vlastním polozku
     */
    public void setVlastnim(boolean vlastnim)
    {
        this.vlastnim = vlastnim;
    }

    /**
     * Vrací informaci, zda vlastníme kopii teto polozky.
     *
     * @return      true, pokud vlastníme kopii teto polozky
     */
    public boolean getVlastnim()
    {
        return vlastnim;
    }

    public String getTitul() {
        return titul;
    }

    public int getDelka() {
        return delka;
    }


}
