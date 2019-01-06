import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class CommandOperator {

	public static void command(int numberOfFiles, File[] dirholder, boolean[] filechecker, String backkeeper)
			throws Exception {

		if (numberOfFiles == 0 && filechecker[0] == true) {
			// System.out.println("fileoption");

		}

		Scanner s = new Scanner(System.in);
		boolean notDone = true;
		while (notDone) {
			System.out.println("Enter -1 to go back.");
			System.out.println("Enter 0 to go to the main index.");
			System.out.println("Enter directory number: ");
			if (!s.hasNextInt()) {
				System.out.println("Please enter a valid entry!");
				s.nextLine();
				continue;
			}
			if (s.hasNextInt()) {
				int i = s.nextInt() - 1;
				if (i == -1) {

					index.starter();
				}
				if (i == -2) {
					if (backkeeper == "contentfolder") {
						System.out.println("Can't go back on the main directory!");
						index.starter();
					}

					int backendnumber = backkeeper.lastIndexOf("\\");
					String backender = backkeeper.substring(0, Math.min(backkeeper.length(), backendnumber));

					FileBrowser.browser(backender, false);

				}

				if (i >= -2 && i <= numberOfFiles) {

					StringBuffer result = new StringBuffer();
					result.append(dirholder[i]);
					String finaldirholder = result.toString();

					FileBrowser.browser(finaldirholder, filechecker[i]);
					notDone = false;
				} else {
					System.out.println("You didn't enter a valid directory number, try again.");
					continue;
				}
			}

		}
	}

	public static void main(String[] args) {

	}

}
