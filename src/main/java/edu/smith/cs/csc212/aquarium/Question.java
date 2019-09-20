package edu.smith.cs.csc212.aquarium;

//import java.util.ArrayList;
import java.util.List;

public class Question {

	// Mean is just a fancy name for average!
	public static double mean(List<Double> numbers) {
	    double sum = 0.0;
	    for (double x : numbers) {
	        sum += x;
	    }
	    return sum / numbers.size();
	}

}
