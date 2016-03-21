

import org.freehep.math.minuit.*;
import Jama.*;

public class Project {

    public static void main(String args[]) {


	MyFileReader data = new MyFileReader("DecayTimesData.txt");

	Matrix t = data.getColumn(0);

	System.out.println(t.toString());

	//Set Parameters
	MnUserParameters par = new MnUserParameters();
	par.add("t_1", 0.1, 0.1);
	par.add("t_2", 0.1, 0.1);
	par.add("f1",0.1, 0.1);
	par.add("f2",0.1, 0.1);

	DoubleExp function = new DoubleExp();

	NLL nll = new NLL(t, function);

	MnMigrad migrad = new MnMigrad(nll,par);

	FunctionMinimum min = migrad.minimize();

	System.out.println("Minimum: " + min);

    }

}
