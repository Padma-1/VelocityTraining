package miscellaneous;

import com.wipro.training.microsoft.OperatingSystem;
import com.wipro.training.oracle.Database;

public class SoftwareList {

	public static void main(String[] args) {

		Database d = new Database();
		d.printSoftware();

		System.out.println("--------------");
		OperatingSystem o = new OperatingSystem();
		o.listSoftware();

	}

}
