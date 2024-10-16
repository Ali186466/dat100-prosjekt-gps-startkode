package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSUtils {

  //a
    public static double findMin(double[] da) {
        double min = da[0];
        for (int i = 1; i < da.length; i++) {
            if (da[i] < min) {
                min = da[i];
            }
        }
        return min;
    }

     //b
    public static double[] getLatitudes(GPSPoint[] gpspoints) {
        double[] latitudes = new double[gpspoints.length];
        for (int i = 0; i < gpspoints.length; i++) {
            latitudes[i] = gpspoints[i].getLatitude();
        }
        return latitudes;
    }

    
    public static double[] getLongitudes(GPSPoint[] gpspoints) {
        double[] longitudes = new double[gpspoints.length];
        for (int i = 0; i < gpspoints.length; i++) {
            longitudes[i] = gpspoints[i].getLongitude();
        }
        return longitudes;
    }

   
    public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {
        double R = 6371000; // 
        double lat1 = Math.toRadians(gpspoint1.getLatitude());
        double lat2 = Math.toRadians(gpspoint2.getLatitude());
        double deltaLat = lat2 - lat1;
        double deltaLon = Math.toRadians(gpspoint2.getLongitude() - gpspoint1.getLongitude());

        double a = compute_a(lat1, lat2, deltaLat, deltaLon);
        double c = compute_c(a);

        return R * c; 
    }

   
    private static double compute_a(double phi1, double phi2, double deltaphi, double deltadelta) {
        return Math.sin(deltaphi / 2) * Math.sin(deltaphi / 2)
               + Math.cos(phi1) * Math.cos(phi2)
               * Math.sin(deltadelta / 2) * Math.sin(deltadelta / 2);
    }

    
    private static double compute_c(double a) {
        return 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    }

    // 3e)
    public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {
        double distance = distance(gpspoint1, gpspoint2); 
        int timeDiff = gpspoint2.getTime() - gpspoint1.getTime(); 

        // 
        if (timeDiff <= 0) {
            throw new IllegalArgumentException("Tidsforskjellen må være større enn null");
        }

        return (distance / timeDiff) * 3.6; // 
    }

    // 3f)
    public static String formatTime(int secs) {
        int hours = secs / 3600;
        int minutes = (secs % 3600) / 60;
        int seconds = secs % 60;
        return String.format("%10s", String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

    // 3g)
    public static String formatDouble(double d) {
        return String.format("%10s", String.format("%.2f", d));
    }
}
