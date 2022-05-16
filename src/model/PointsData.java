package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PointsData {
	
	private final static ArrayList<Double> dataX = new ArrayList<Double>();
	private final static ArrayList<Double> dataY = new ArrayList<Double>();
	
	public static void loadData() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("data/data.csv"));
		String line = br.readLine();
		
		boolean firstLine = true;
		
		while(line != null) {
			if(!firstLine) {
				String[] parts = line.split(",");
				double ejeX = Double.parseDouble(parts[0]);
				double ejeY = Double.parseDouble(parts[1].substring(0,parts[1].length()-1));
				
				dataX.add(ejeX);
				dataY.add(ejeY);
			}
			
			line = br.readLine();
			firstLine = false;			
		}
		
		br.close();
	}
	
	public static ArrayList<Double> getX() {
		return dataX;
	}
	
	public static ArrayList<Double> getY() {
		return dataY;
	}
}
