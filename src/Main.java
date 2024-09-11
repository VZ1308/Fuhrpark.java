import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Fahrzeuge erstellen
        PKW pkw = new PKW("Skoda", "Rapid", 2015, 130000, 5, "Diesel");
        LKW lkw = new LKW("Mercedes", "Actros", 2020, 120000, 18);
        Motorrad motorrad = new Motorrad("Yamaha", "MT-07", 2019, 100000, 681);
        Fahrrad fahrrad = new Fahrrad("Canyon", "Roadlite", 2022, 2000, 11);

        // Hauptmenü Schleife
        while (true) {
            System.out.println("\nWillkommen im Fuhrpark! \nWas möchten Sie machen?");
            System.out.println("1. Ein Fahrzeug tanken");
            System.out.println("2. Ein Fahrzeug starten");
            System.out.println("3. Fahrrad schalten");
            System.out.println("4. Kilometerstand anzeigen");
            System.out.println("5. Alle Fahrzeuge anzeigen");
            System.out.println("6. Anzahl der Fahrzeuge anzeigen");
            System.out.println("7. Programm beenden");
            System.out.print("Ihre Auswahl: ");

            int choice = getValidIntInput(1, 7);
            switch (choice) {
                case 1:
                    // Fahrzeug zum Tanken auswählen
                    System.out.println("Welches Fahrzeug möchten Sie tanken?");
                    System.out.println("1. Pkw");
                    System.out.println("2. Lkw");
                    System.out.println("3. Motorrad");
                    System.out.print("Ihre Auswahl: ");
                    int fahrzeugAuswahl = getValidIntInput(1, 3);
                    System.out.print("Wie viele Liter möchten Sie tanken? ");
                    int liter = getValidIntInput(0, Integer.MAX_VALUE); //Liter können nicht negativ sein

                    switch (fahrzeugAuswahl) {
                        case 1:
                            pkw.tanken(liter);
                            break;
                        case 2:
                            lkw.tanken(liter);
                            break;
                        case 3:
                            motorrad.tanken(liter);
                            break;
                    }
                    break;

                case 2:
                    // Fahrzeug starten
                    System.out.println("Welches Fahrzeug möchten Sie starten?");
                    System.out.println("1. Pkw");
                    System.out.println("2. Lkw");
                    System.out.println("3. Motorrad");
                    System.out.print("Ihre Auswahl: ");
                    int fahrzeugAuswahl1 = getValidIntInput(1, 3);
                    System.out.println("Wieviele Kilometer möchten Sie fahren?");
                    int km = getValidIntInput(1, Integer.MAX_VALUE);

                    switch(fahrzeugAuswahl1) {
                        case 1:
                            pkw.fahren(km);
                            break;
                        case 2:
                            lkw.fahren(km);
                            break;
                        case 3:
                            motorrad.fahren(km);
                            break;
                    }
                    break;
                case 3:
                    // Fahrrad schalten
                    System.out.print("Auf welchen Gang möchten Sie schalten? ");
                    int gang = getValidIntInput(1, 6);
                    fahrrad.schalten(gang);
                    break;
                case 4:
                    // Kilometerstand anzeigen
                    System.out.println("Kilometerstände der Fahrzeuge:");
                    System.out.println("Pkw: " + pkw.getKilometerstand() + " km");
                    System.out.println("Lkw: " + lkw.getKilometerstand() + " km");
                    System.out.println("Motorrad: " + motorrad.getKilometerstand() + " km");
                    System.out.println("Fahrrad: " + fahrrad.getKilometerstand() + " km");
                    break;
                case 5:
                    // Alle Fahrzeuge anzeigen
                    System.out.println("Details aller Fahrzeuge:");
                    System.out.println("Pkw: " + pkw.getMarke() + " " + pkw.getModell() + ", Baujahr " + pkw.getBaujahr() + ", Kilometerstand: " + pkw.getKilometerstand() + " km");
                    System.out.println("Lkw: " + lkw.getMarke() + " " + lkw.getModell() + ", Baujahr " + lkw.getBaujahr() + ", Kilometerstand: " + lkw.getKilometerstand() + " km");
                    System.out.println("Motorrad: " + motorrad.getMarke() + " " + motorrad.getModell() + ", Baujahr " + motorrad.getBaujahr() + ", Kilometerstand: " + motorrad.getKilometerstand() + " km");
                    System.out.println("Fahrrad: " + fahrrad.getMarke() + " " + fahrrad.getModell() + ", Baujahr " + fahrrad.getBaujahr() + ", Kilometerstand: " + fahrrad.getKilometerstand() + " km");
                    break;
                case 6:
                    // Anzahl der Fahrzeuge anzeigen
                    System.out.println("Gesamtzahl der Fahrzeuge im Fuhrpark: " + Fahrzeug.getAnzahlFahrzeuge());
                    break;
                case 7:
                    // Programm beenden
                    System.out.println("Programm wird beendet.");
                    scanner.close();
                    return;  // Beendet die Schleife und das Programm
            }
        }
    }

    /**
     * Diese Methode fordert den Benutzer zur Eingabe einer Ganzzahl auf und stellt sicher,
     * dass die Eingabe im angegebenen Bereich liegt.
     * Wenn die Eingabe ungültig ist oder außerhalb des Bereichs liegt, wird eine Fehlermeldung angezeigt
     * und der Benutzer wird zur erneuten Eingabe aufgefordert.
     *
     * @param min Der minimale akzeptierte Wert.
     * @param max Der maximale akzeptierte Wert.
     * @return Die gültige Ganzzahl, die vom Benutzer eingegeben wurde.
     */
    private static int getValidIntInput(int min, int max) {
        while (true) {
            try {
                int input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Eingabe liegt außerhalb des gültigen Bereichs. Bitte geben Sie eine Zahl zwischen " + min + " und " + max + " ein.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
                scanner.next(); // Verbrauch der ungültigen Eingabe
            }
        }
    }
}
