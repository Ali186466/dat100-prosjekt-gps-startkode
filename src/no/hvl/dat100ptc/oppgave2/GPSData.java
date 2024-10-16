package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	    private GPSPoint[] gpsPoints;  // Array for å lagre GPSPoint-objekter
	    private int antall;            // Teller for antall innlagte punkter

	    // Konstruktør
	    public GPSData(int n) {
	        gpsPoints = new GPSPoint[n];  // Initialiserer arrayet med størrelse n
	        antall = 0;                   // Setter antall til 0, ingen punkter lagret enda
	    }

	    // Metode for å sette inn GPS-punkter
	    public void insertGPS(GPSPoint gpsPoint) {
	        if (antall < gpsPoints.length) {
	            gpsPoints[antall] = gpsPoint;  // Setter inn GPS-punkt i arrayet
	            antall++;                      // Øker antallet med 1
	        } else {
	            System.out.println("Ingen plass til flere GPS-punkter.");
	        }
	    }

	    // Metode for å skrive ut informasjon om GPS-punkter
	    public void print() {
	        for (int i = 0; i < antall; i++) {
	            System.out.println(gpsPoints[i].toString());  // Skriver ut hvert GPS-punkt
	        }
	    }
	}
