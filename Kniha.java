public class Kniha implements Polozka {
    private String titul;
    private int pocetStran;
    private String autor;
    private boolean vlastnim;
    private String komentar;

    protected Kniha(String titul, String autor, int pocetStran) {
        this.titul = titul;
        this.autor = autor;
        this.pocetStran = pocetStran;
        vlastnim = false;
        komentar = "<no comment>";
    }

    @Override
    public void print() {
        System.out.printf("kniha: %s (%d stran)", getTitul(), getDelka());
        if(getVlastnim()) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("    " + autor);
        System.out.println("    " + getComment());
    }

    @Override
    public void setComment(String comment) {
        komentar = comment;
    }

    @Override
    public String getComment() {
        return komentar;
    }

    @Override
    public boolean getVlastnim() {
        return vlastnim;
    }



    @Override
    public int getDelka() {
        return 0;
    }

    @Override
    public String getTitul() {
        return null;
    }
}
