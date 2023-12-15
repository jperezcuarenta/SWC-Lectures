package week10;
import java.awt.*;
import java.awt.geom.*;
import java.text.NumberFormat;
import java.util.*;
import java.util.List;
import javax.swing.*;
import java.io.*;  
import java.util.Scanner;


public class PlottingDemo{
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(new File("signal.csv"));
    	int cnt = 0;
    	int[] xIn = new int[800];
    	int[] yIn = new int[800];	
    	while (sc.hasNext()) {
    		xIn[cnt] = cnt - 400;
    		yIn[cnt] = (int) sc.nextFloat();
    		cnt++;
    		}
    	sc.close();
        JFrame f = new JFrame("Plotting Points");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new PointGrapher(xIn, yIn));
        f.setSize(400, 400);
        f.setLocation(200, 200);
        f.setVisible(true);
    	}
	}
  
class PointGrapher extends JPanel {
    List points;
    String[] xLabels, yLabels;
    final int PAD;
    double xScale ,yScale;
    NumberFormat nf;
 
    public PointGrapher(int[] xPlot, int[] yPlot) {
        points = new ArrayList();
        populatePoints(xPlot, yPlot);
        xLabels = new String[11];
        yLabels = new String[11];
        PAD = 20;
        nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(1);
        setBackground(Color.white);
    	}
  
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        double w = getWidth();
        double h = getHeight();
        double xInc = (w - 2*PAD)/50;
        double yInc = (h - 2*PAD)/50;
        double x1 = PAD, y1 = h/2;
        double[] ranges = computeScales(w, h);
        createLabels(ranges);
        // abcissa
        g2.draw(new Line2D.Double(PAD, h/2, w - PAD, h/2));
        for(int i = 0; i <= 50; i++)
        {
            if(i % 5 == 0 && i != 25)
            {
                g2.draw(new Line2D.Double(x1, y1 - 2, x1, y1 + 2));
                g2.drawString(xLabels[i/5], (float)(x1 - 10), (float)(y1 + 16));
            }
            else
               g2.draw(new Line2D.Double(x1, y1, x1, y1 + 2));
            x1 += xInc;
        }
        // ordinate
        g2.draw(new Line2D.Double(w/2, PAD, w/2, h - PAD));
        x1 = w/2; y1 = PAD;
        for(int i = 0; i <= 50; i++) {
            if(i % 5 == 0 && i != 25) {
                g2.draw(new Line2D.Double(x1 - 2, y1, x1 + 2, y1));
                g2.drawString(yLabels[i/5], (float)(x1 + 4), (float)(y1 + 6));
            	}
            else
                g2.draw(new Line2D.Double(x1, y1, x1 + 2, y1));
            y1 += yInc;
        	}
        g2.setPaint(Color.red);
        // plot points
        Point p;
        for(int i = 0; i < points.size(); i++) {
            p = (Point)points.get(i);
            x1 = w/2 + xScale * p.x;
            y1 = h/2 - yScale * p.y;
            g2.fill(new Ellipse2D.Double(x1 - 1, y1 - 1, 2, 2));
        	}
    	}
  
    private void populatePoints(int[] xarray, int[] yarray) {
        int x, y;
        Point p;
        for(int i = 0; i < xarray.length; i++) {
        	x = xarray[i];
        	y = yarray[i];
            p = new Point(x, y);
            points.add(p);
        	}
    	}
  
    private void createLabels(double[] xy) {
        for(int i = 0; i < xLabels.length; i++) {
            xLabels[i] = nf.format((i - 5) * (xy[0]/5));
            yLabels[i] = nf.format((5 - i) * (xy[1]/5));
        	}
    	}
  
    private double[] computeScales(double w, double h) {
        double xMin, xMax, yMin, yMax;
        xMin = yMin = Double.MAX_VALUE;
        xMax = yMax = Double.MIN_VALUE;
        Point p;
        for(int i = 0; i < points.size(); i++) { 
            p = (Point)points.get(i);
            if(p.x < xMin) xMin = p.x;
            if(p.x > xMax) xMax = p.x;
            if(p.y < yMin) yMin = p.y;
            if(p.y > yMax) yMax = p.y;
    		}
        // abcissa scale
        double xRange = Math.max(Math.abs(xMin), Math.abs(xMax));
        xScale = (w/2 - PAD)/xRange;
        // ordinate scale
        double yRange = Math.max(Math.abs(yMin), Math.abs(yMax));
        yScale = (h/2 - PAD)/yRange;
        return new double[] { xRange, yRange };
    	}
	}