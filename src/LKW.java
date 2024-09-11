public class LKW extends Fahrzeug {
    private int ladekapazitaet;

    public LKW(String marke, String modell, int baujahr, int kilometerstand, int ladekapazitaet) {
        super(marke, modell, baujahr, kilometerstand);
        this.ladekapazitaet = ladekapazitaet;
    }
    public void tanken(int liter) {
        while (true) {
            if(liter < 0) {
                System.out.println("Bitte geben Sie eine positive Zahl zum tanken ein.");
            }
            else {
                break;


            }
        }
        System.out.println(liter + "Liter in " + getMarke() + " " + getModell() + "getankt.");
    }

}
