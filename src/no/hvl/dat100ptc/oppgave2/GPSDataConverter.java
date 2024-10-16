package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	
	private static int TIME_STARTINDEX = 11; 

	public static int toSeconds(String timestr) {
		String s = timestr;
		
		String timeStreng = s.substring(11, 13);
		int timer = Integer.parseInt(timeStreng);
		
		String minuttString = s.substring(14,16);
		int minutt = Integer.parseInt(minuttString);
		
		String sekundString = s.substring(17, 19);
		int sekund = Integer.parseInt(sekundString);
		
	int totalsekund = (timer * 60 * 60) + (minutt * 60) + sekund;
			return totalsekund;
			
		
		
	}

public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		double latitude = Double.parseDouble(latitudeStr);
	    double longitude = Double.parseDouble(longitudeStr);
	    double elevation = Double.parseDouble(elevationStr);
int time = toSeconds(timeStr);
		
  GPSPoint gpspoint = new GPSPoint(time, latitude, longitude, elevation);
  System.out.println("Antall sekunder: " + time );
  System.out.println( "Latitude :" + latitude );
  System.out.println("Longitude:" + longitude);
  System.out.println("Elevation:" + elevation);
//convert("2017-08-13T08:52:26.000Z","60.385390","5.217217","61.9")
// Returnerer GPSPoint-objektet
return gpspoint;
	}
	

	public static void main(String[] args) {
		
		convert("2017-08-13T08:52:26.000Z","60.385390","5.217217","61.9");


	}
}
