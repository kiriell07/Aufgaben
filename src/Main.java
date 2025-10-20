import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pfad zur Textdatei eingeben: ");
        String dateiPfad = input.nextLine();
        File datei  = new File(dateiPfad);

        try{
            Scanner dateiScanner = new Scanner(datei);
            System.out.println("\n Inhalt der Datei ");
            while(dateiScanner.hasNextLine()){
                String zeile  = dateiScanner.nextLine();
                System.out.println(zeile);
            }
            dateiScanner.close();

        } catch (FileNotFoundException e) {
            // Fehlerbehandlung, falls Datei nicht existiert
            System.out.println("Fehler: Datei wurde nicht gefunden!");
            input.close();
        }

    }
}