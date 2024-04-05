# Implementing a Normality Plot in Java
The Java class file titled **Principal** presented herein serves as an illustrative example of a program employing a normal random variable generator *genRan* to produce Gaussian-distributed random values, which are subsequently collected for plotting purposes.

Disclosure Statement:

This Java class file, **Principal,** serves as a practical demonstration of generating Gaussian-distributed random values using the *genRan* random variable generator for subsequent plotting.

However, it's worth noting that the installation process for the *xchart* package, utilized for chart plotting within this program, may present some challenges and complexities. For comprehensive installation guidance, I recommend referring to the instructional video provided below.

The *xchart* library simplifies chart plotting by providing pre-existing code snippets. Users are advised to adjust their variables within these snippets for seamless program execution.

Video Source for Installation Guidance: https://www.youtube.com/watch?v=GhafZzC5iZw

Library Source :  https://knowm.org/open-source/xchart/xchart-change-log/

While efforts have been made to ensure functionality, no guarantee of error-free execution is implied. Users are encouraged to exercise due diligence and seek assistance if encountering difficulties.

This disclosure aims to provide transparency and assistance in utilizing the Principal Java class file and associated dependencies.

***The Java Code in Eclipse***

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
		
// Transforms integer array *natural* into a double array *xData* to seamlessly integrate with pre-existing code from the library.

		double[] xData = Arrays.stream(natural).asDoubleStream().toArray();
	
// Creates a Chart . (Library Source)

    XYChart chart = QuickChart.getChart("Normality Plot", "X", "Y", "y(x)", xData, CollectGaussianValues);

// Shows it . (Library Source)

    new SwingWrapper(chart).displayChart();
		
		
	}

}
