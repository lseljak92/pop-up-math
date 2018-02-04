import javax.swing.JOptionPane;

public class PopUpMath {

	public static void main(String[] args) {
		boolean again = true;
		while (again) {

			String userInput1 = JOptionPane.showInputDialog(null,
					"Enter the first number:");
			System.out.println("got to here after the first input");
			String userInput2 = JOptionPane.showInputDialog(null,
					"Enter the second number:");

			int num1 = Integer.parseInt(userInput1);
			int num2 = Integer.parseInt(userInput2);

			int sum = num1 + num2;
			int product = num1 * num2;

			JOptionPane.showMessageDialog(null, "The sum is " + sum
					+ " and the product is " + product);
			System.out.println("got to after the message");

			int answer = JOptionPane.showConfirmDialog(null, "Again?");
			if (answer == JOptionPane.YES_OPTION) {
				again = true;
			} else {
				again = false;
			}
		}
	}

}
