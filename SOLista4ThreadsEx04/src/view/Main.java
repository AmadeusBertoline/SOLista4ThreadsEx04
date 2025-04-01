package view;

import java.util.Scanner;
import controller.*;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int distancia;

		Random random = new Random();

		distancia = random.nextInt(101);

		for (int i = 0; i <= 4; i++) {

			SaposController sapo = new SaposController(random.nextInt(11) + 2, distancia, random.nextInt(5));
			sapo.start();

		}

		scanner.close();

	}

}
