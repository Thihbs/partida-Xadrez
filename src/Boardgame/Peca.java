package Boardgame;

public class Peca {

   protected Posicao posicao; 
   private Board board;

   
   
   public Peca(Board board) {
	this.board = board;
}



protected Board getBoard() {
	return board;
}

   
}
