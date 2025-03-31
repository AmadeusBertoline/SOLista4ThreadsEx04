package controller;

import java.util.Random;

public class SaposController extends Thread {

	int saltoMaximo;
	int distancia;
	int sapo;

	public SaposController(int saltoMaximo, int distancia, int sapo) {

		this.saltoMaximo = saltoMaximo;
		this.distancia = distancia;

		this.sapo = sapo;

	}

	Random random = new Random();

	@Override
	public void run() {

		int salto;
		int opc = 0;
		long inicio;
		long fim;
		long tempo;
		int percorrido = 0;

		inicio = System.nanoTime();

		while (opc != 9) {

			salto = random.nextInt(saltoMaximo + 1);

			percorrido = salto + percorrido;

			if (percorrido >= distancia) {

				System.out.println("O sapo " + sapo + " chegou - Posição: " + currentThread().getId());
				opc = 9;

			} else {

				System.out.println("O sapo " + sapo + " deu um salto de: " + salto + " metros\n"
						+ " Distância percorrida: " + percorrido);

			}

		}

	}
	


}
