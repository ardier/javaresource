import java.util.Scanner;

public class CommandOperator {

	public static void command(int numberOfFiles) {
		Scanner s = new Scanner(System.in);
		boolean notDone = true;
		while (notDone) {
			System.out.println("Enter directory number: ");
			if (!s.hasNextInt()) {
				System.out.println("Please enter a number: ");
				s.nextLine();
				continue;
			}
			if (s.hasNextInt()) {
				int i = s.nextInt();
				if (i >= -1 && i <= numberOfFiles) {
					FileBrowser.browser(i);
					notDone = false;
				} else {
					System.out.println("You didn't enter a valid directory number, try again.");
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		command(20);

	}

}
