public class Fahrrad extends Fahrzeug {
    private int anzahlGaenge;

    public Fahrrad(String marke, String modell, int baujahr, int kilometerstand, int anzahlGaenge) {
        super(marke, modell, baujahr, kilometerstand);
        this.anzahlGaenge = anzahlGaenge;
    }
    public void schalten(int gang) {
        while (true) {
            if(gang <= 0 || gang >= anzahlGaenge){
                System.out.println("Bitte wählen Sie einen Gang zwischen 1 und " + anzahlGaenge + ".");
            }
            else {
                break;


            }
        }
        System.out.println("Schaltet auf Gang " + gang + ".");
    }
}
