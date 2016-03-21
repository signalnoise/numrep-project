
import Jama.*;
import org.freehep.math.minuit.*;
import org.freehep.math.minuit.FCNBase;


public class NLL implements FCNBase {

    private Matrix x;
    private Funk func;
    private double sum;

    public NLL(Matrix in, Funk function) {

	x = in.copy();
	func = function;

    }

    public double valueOf(double[] par) {

	func.setParameters(par);
	
	sum = 0;

	for (int i = 0; i<x.getRowDimension(); i++) {

	    sum = sum - Math.log(func.valueOf(x.get(i,0)));
	    
	}

	return sum;

    }

}
