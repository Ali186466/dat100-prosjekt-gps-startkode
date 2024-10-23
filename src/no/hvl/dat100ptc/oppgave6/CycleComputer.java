package no.hvl.dat100ptc.oppgave6;

import easygraphics.EasyGraphics;
import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave3.GPSUtils;
import no.hvl.dat100ptc.oppgave5.GPSComputer;

public class CycleComputer extends EasyGraphics {

    private static int MARGIN = 50; 
    private static int WIDTH = 800;  
    private static int HEIGHT = 600; 
    private GPSComputer gpscomputer;
    private GPSPoint[] gpspoints;

    public CycleComputer() {
        
        gpscomputer = new GPSComputer("gpsdata.csv"); 
        gpspoints = gpscomputer.getGPSPoints();
    }

    public static void main(String[] args) {
       
    }

    public void run() {
    
        makeWindow("Cycle Computer", WIDTH, HEIGHT);
        
   
        drawRoute();
    }

    private void drawRoute() {
      
        int startX = MARGIN;
        int startY = HEIGHT / 2;

      
        for (int i = 1; i < gpspoints.length; i++) {
            int x1 = startX + i * 5;  
            int y1 = startY - (int)gpspoints[i-1].getElevation(); 
            int x2 = startX + (i + 1) * 5;
            int y2 = startY - (int)gpspoints[i].getElevation();

            drawLine(x1, y1, x2, y2);
        }
    }
}
