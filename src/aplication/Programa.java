package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidadeXadrez;
import xadrez.PecadeXadrez;
import xadrez.XadrezException;
import xadrez.XadrezPosicao;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidadeXadrez partidadeXadrez = new PartidadeXadrez();
		while (true) {
			try {
				
			
            UI.limparATela();
			UI.printBoard(partidadeXadrez.getPecas());
			System.out.println();
			System.out.print("Source :");
			XadrezPosicao source = UI.lerPosicao(sc);
			
			
			System.out.println();
			System.out.print("Target :");
			XadrezPosicao target = UI.lerPosicao(sc);

			PecadeXadrez capturarPeca = partidadeXadrez.performXadrezMovimento(source, target);
			}
			catch(XadrezException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
		}

	}
	}
	}
