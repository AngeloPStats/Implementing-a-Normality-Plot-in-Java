package xchart;
import java.util.*;
import java.util.stream.IntStream;
import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

public class Principal {

	public static void main(String[] args) {
		
		Random genRan = new Random();

		// Saves generated values in CollectGaussianValues array 
			double [] CollectGaussianValues = new double[100] ;

		for(int i=0; i<100; i++) {

			CollectGaussianValues[i] = genRan.nextGaussian();
			
			}
		
// sorts CollectGaussianValues array
		 Arrays.sort(CollectGaussianValues);

// fills natural array
		int[] natural = IntStream.range(0, 100).toArray();
		
// Converts int[]natural to double[] to use the preset coding from the library
		double[] xData = Arrays.stream(natural).asDoubleStream().toArray();
	
// Creates a Chart
XYChart chart = QuickChart.getChart("Normality Plot", "X", "Y", "y(x)", xData, CollectGaussianValues);

// Shows it
new SwingWrapper(chart).displayChart();
		
		
	}

}
