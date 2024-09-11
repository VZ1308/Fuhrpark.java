public class PKW extends Fahrzeug{
    private int anzahlTueren;
    private String kraftstoffart;

    public PKW(String marke, String modell, int baujahr, int kilometerstand, int anzahlTueren, String kraftstoffart) {
        super(marke, modell, baujahr, kilometerstand);
        this.anzahlTueren = anzahlTueren;
        this.kraftstoffart = kraftstoffart;
    }
    public void tanken(int liter) {
        while (true) {
            if (liter < 0) {
                System.out.println("Bitte geben Sie eine positive Zahl zum tanken ein.");
            } else {
                break;

            }

        }System.out.println(liter + " Liter " + kraftstoffart + " in " + getMarke() + " " + getModell() + " getankt");
    }
    public void einparken() {
        System.out.println(getMarke() + " " + getModell() + " parkt ein.");
    }

}
