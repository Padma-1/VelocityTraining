package com.wipro.training.oracle;

//main class is in miscellaneous.SoftwareList
public class Database {
	public final void printSoftware() {
		int i;
		String[] arrOracle = { "Oracle 8i", "Oracle 10g", "Oracle 11g" };
		for (i = 0; i < 3; i++) {
			System.out.println(arrOracle[i]);
		}
	}

}
