import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileBrowser {
	public static boolean firsttime = true;

	public static void browser(String dirholder2, boolean isFilish) throws Exception {
		String backholder = dirholder2;
		if (isFilish) {

			FileReader file = new FileReader(dirholder2);
			BufferedReader reader = new BufferedReader(file);

			String text = "";
			String line = reader.readLine();

			System.out.println("");
			System.out.println("File Content:");
			System.out.println("_______________________________________");
			System.out.println("");
			while (line != null) {
				text = line + "";
				line = reader.readLine();
				System.out.println(text);

			}
			file.close();
			System.out.println("");
			System.out.println("");

			File[] dirholder = new File[1];

			boolean[] emptyfilechecker = { true };
			CommandOperator.command(0, dirholder, emptyfilechecker, backholder);

		} else {

			String dirholder = dirholder2;

			File dir = new File(dirholder);
			File[] list = dir.listFiles();
			if (!firsttime) {

			}
			if (firsttime) {
				firsttime = false;
				// System.out.println("first time");
			}
			boolean[] fileOrNot = new boolean[list.length];
			int directorycounter = 0;
			for (File file : list) {

				if (file.isDirectory()) {
					System.out.println(directorycounter + 1 + ". " + file.getName());
					fileOrNot[directorycounter] = false;
					++directorycounter;
				} else {
					System.out.println(directorycounter + 1 + ". " + file.getName());
					fileOrNot[directorycounter] = true;
					++directorycounter;
				}
			}
			System.out.println("");
			System.out.println("_______________________________________");
			System.out.println("");

			CommandOperator.command(directorycounter, list, fileOrNot, backholder);
		}
	}

}
