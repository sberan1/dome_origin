
/**
 * Trida TestovaciData je pomocná třída, která poskytuje instance tříd
 * Video, CD a Evidence, aby bylo možné jednoduše testovat funkčnost těchto tříd
 * při úpravách na cvičeních.
 *
 * @author     Luboš Pavlíček
 * @version    leden 2005
 */
public class TestovaciData 
{

    // zkušební seznam videí
    private static Video [] seznamVidei =
        {   new Video("Alexander Veliký","Oliver Stone",170),
            new Video("Takoví normální zabijáci","Oliver Stone",119),
            new Video("60 sekund","Dominic Sena",118)
        };
        
    private static int videoUkazatel=0;
    
    // zkušební seznam CD
    private static CD [] seznamCD =
        {   new CD("Tři čunící","Jaromír Nohavica",25, 54),
            new CD("Divné století","Jaromír Nohavica",16, 48),
            new CD("Nebe počká","Karel Plíhal",23, 56),
            new CD("Enya (The Celts)", "Enya", 15, 39  ),
            new CD("The Memory of Trees", "Enya",11, 43)
        };
        
    private static int cdUkazatel=0;
    
    
    /**
     * Konstruktor je privátní - nelze vytvářet instance této třídy, neboť poskytuje
     * pouze statické metody.
     */
    private TestovaciData() 
    {
    }
    
    /**
     * Metoda vrací instanci třídy Evidence naplněné ukázkovými CD a videi
     * 
     * @return     instance třídy Evidence naplněné ukázkovými daty
     */
    public static Evidence getEvidence() {
        Evidence temp = new Evidence();
        for (CD cd : seznamCD){
            temp.addPolozka(cd);
        }
        for (Video video : seznamVidei){
            temp.addPolozka(video);
        }
       
        return temp;
    }

    /**
     * Metoda vrací různé instance třídy Video - postupně se vrací jednotlivá
     * videa z předpřipraveného seznamu.
     * 
     * @return     instance třídy Video se zkušebními daty
     */
    public static Video getVideo() {
        Video temp = seznamVidei[videoUkazatel];
        videoUkazatel++;
        if (videoUkazatel >= seznamVidei.length) {
            videoUkazatel=0;
        }
        return temp;
    }
    
    /**
     * Metoda vrací různé instance třídy CD - postupně se vrací jednotlivá
     * CD z předpřipraveného seznamu.
     * 
     * @return     instance třídy CD se zkušebními daty
     * 
     */
    public static CD getCD() {
        CD temp = seznamCD[cdUkazatel];
        cdUkazatel++;
        if (cdUkazatel >= seznamCD.length) {
            cdUkazatel=0;
        }
        return temp;
    }

}
