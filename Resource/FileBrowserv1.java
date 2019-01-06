import java.io.File;
import java.util.Arrays;

public class FileBrowser {
	public static boolean firsttime = true;

	public static void browser(int directorynumber) {
		String dirholder = "contentfolder";
		//System.out.println(directorynumber);
		File dir = new File(dirholder);
		File[] list = dir.listFiles();
		if (firsttime) {
			
			firsttime = false;
			// System.out.println("first time");
		} else {
			System.out.println("dir in Q: " + dirholder);
			StringBuffer result = new StringBuffer();
			result.append(list[directorynumber - 1]);
			dirholder = result.toString();
			dir = new File(dirholder);
			list = dir.listFiles();
		}
		int directorycounter = 1;
		// System.out.println(Arrays.toString(dir.listFiles()));
		for (File file : list) {

			if (file.isDirectory()) {
				System.out.println(directorycounter + ". " + file.getName());
				++directorycounter;
			} else {
				System.out.println(directorycounter + ". " + file.getName());
				++directorycounter;
			}
		}

		CommandOperator.command(directorycounter);
	}

}
