
import java.lang.Math;

public class DoubleExp implements Funk{


    //Declare the parameters of the function we are investigating 
    
    private double life1;
    private double life2;
    private double frac1;
    private double frac2;

    //Instantiates the class with parameters par
    public DoubleExp(double[] par) {
 
	this.setParameters(par);

    }

    public DoubleExp() {}

    //Sets the parameters
    public void setParameters(double[] par) {

	life1 = par[0];
	life2 = par[1];
	frac1 = par[2];
	frac2 = par[3];    

    }

    //Evaluates the pdf at time t
    public double valueOf(double t) {

	double prob = frac1*(1/life1)*Math.exp(t/life1) + frac2*(1/life2)*Math.exp(t/life2);
	return prob;

    }

}
