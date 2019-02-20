package xadrez;

import Boardgame.Board;
import Boardgame.Peca;

public class PecadeXadrez extends Peca {
        private Cor cor;
		public PecadeXadrez(Board board, Cor cor) {
			super(board);
			this.cor = cor;
		}
		public Cor getCor() {
			return cor;
		}
	
	 
		
	}
  
