package no.hvl.dat100ptc.oppgave2;

// Husk å importere GPSPoint og GPSData hvis de ligger i en annen pakke
import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave2.GPSData;

public class Main {
    public static void main(String[] args) {
        // Opprette to GPSPoint-objekter (tid, breddegrad, lengdegrad, høyde)
        GPSPoint point1 = new GPSPoint(1, 60.385390, 5.332200, 50);
        GPSPoint point2 = new GPSPoint(2, 60.389444, 5.334567, 55);

        // Opprette et GPSData-objekt med plass til to GPSPoint-objekter
        GPSData gpsData = new GPSData(2);

        // Sett inn GPSPoint-objektene ved å bruke insertGPS-metoden
        gpsData.insertGPS(point1);
        gpsData.insertGPS(point2);

        // Skriv ut informasjon om GPSPoint-objektene ved å bruke print-metoden
        gpsData.print();
    }
}
