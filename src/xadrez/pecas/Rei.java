package xadrez.pecas;

import Boardgame.Board;
import xadrez.Cor;
import xadrez.PecadeXadrez;

public class Rei  extends PecadeXadrez{

	public Rei(Board board, Cor cor) {
		super(board, cor);
		
	}
@Override
public String toString() {
	return "R" ;
}
}
