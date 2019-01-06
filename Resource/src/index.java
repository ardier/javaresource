import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class index {

	public static int filenumber = 2; // holds the file number

	public static void main(String[] args) throws Exception {
		System.out.println("Java the Hut Resource Library");
		System.out.println("Version 1.0.0");
		System.out.println("Created by: Arnell Tagavillan, Connor Williams, Seyed Ardeshir Madadi and Skyelar Reed");
		System.out.println("");
		starter();

	}

	public static void starter() throws Exception {

		System.out.println("");

		System.out.println("");

		// counting files initially
		FileBrowser.browser("contentfolder", false);
	}

}
