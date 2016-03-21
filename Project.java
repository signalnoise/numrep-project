

import org.freehep.math.minuit.*;

public class Project {

    public static void main(String args[]) {


	MyFileReader data = new MyFileReader("DecayTimesData.txt");

	Matrix t = data.getColumn(0);

