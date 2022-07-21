package com.wipro.training.microsoft;

//main class is in miscellaneous.SoftwareList
public class OperatingSystem {

	public final void listSoftware() {
		int i;
		String[] arrMs = { "Windows 10", "Windows Server 2019", "Windows 11" };
		for (i = 0; i < 3; i++) {
			System.out.println(arrMs[i]);
		}
	}
}
