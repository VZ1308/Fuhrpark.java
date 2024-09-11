public class Motorrad extends Fahrzeug {
    private int hubraum;

    public Motorrad(String marke, String modell, int baujahr, int kilometerstand, int hubraum) {
        super(marke, modell, baujahr, kilometerstand);
        this.hubraum = hubraum;
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
    System.out.println(liter + " Liter in " + getMarke() + " " + getModell() + " getankt.");
    }
    public void starten() {
        System.out.println(getMarke() + " " + getModell() + " startet.");
    }
}
