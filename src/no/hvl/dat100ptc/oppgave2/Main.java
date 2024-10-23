package no.hvl.dat100ptc.oppgave2;


import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave2.GPSData;

public class Main {
    public static void main(String[] args) {
       
        GPSPoint point1 = new GPSPoint(1, 60.385390, 5.332200, 50);
        GPSPoint point2 = new GPSPoint(2, 60.389444, 5.334567, 55);

    
        GPSData gpsData = new GPSData(2);

       
        gpsData.insertGPS(point1);
        gpsData.insertGPS(point2);

       
        gpsData.print();
    }
}
