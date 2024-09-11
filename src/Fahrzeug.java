public abstract class Fahrzeug {
    private String marke;
    private String modell;
    private int baujahr;
    private int kilometerstand;
    private static int anzahlFahrzeuge =  0;

    public Fahrzeug(String marke, String modell, int baujahr, int kilometerstand) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kilometerstand = kilometerstand;
        anzahlFahrzeuge++;
    }
    public void fahren(int km) {
        this.kilometerstand+= km;
        System.out.println("Der Kilometerstand beträgt nun "  + kilometerstand + " km.");
    }
    public int getKilometerstand() {
        return kilometerstand;
    }
    public String getMarke(){
        return marke;
    }
    public String getModell() {
        return modell;
    }
    public int getBaujahr() {
        return baujahr;
    }
    public static int getAnzahlFahrzeuge() {
        return anzahlFahrzeuge;
    }
}
