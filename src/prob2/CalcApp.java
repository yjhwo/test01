package prob2;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		while (true) {
			System.out.print(">>");

			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();

			if (line.equals("quit"))
				break;

			String[] arr = line.split(" ");
			Arith a = null;

			if (arr[1].equals("+")) {
				a = new Add(Integer.parseInt(arr[0]),Integer.parseInt(arr[2]));
			} else if (arr[1].equals("-")) {
				a = new Sub(Integer.parseInt(arr[0]),Integer.parseInt(arr[2]));
			} else if (arr[1].equals("*")) {
				a = new Mul(Integer.parseInt(arr[0]),Integer.parseInt(arr[2]));
			} else if (arr[1].equals("/")) {
				a = new Div(Integer.parseInt(arr[0]),Integer.parseInt(arr[2]));
			}
			System.out.println(a.calculate());

		}
	}

}
