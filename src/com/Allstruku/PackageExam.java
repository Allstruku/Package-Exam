package com.Allstruku;
// Packages are like folders in which programmers can easily organize classes and methods
// However, to use classes from different packages, import keyword must be used

import Package.packageAndImport;
// import Package.packageAndImport;
// format is (import packagename.classname:) or (import packagename.*) for all classes in that package

public class PackageExam {
	public static void main(String[] args) {
		packageAndImport test = new packageAndImport();
		System.out.println(test.packageTest());
	}
}
