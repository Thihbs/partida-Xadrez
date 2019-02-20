package xadrez;

import Boardgame.Posicao;

public class XadrezPosicao {
private char column;
private int row;

 public XadrezPosicao (char column , int row ) {
	 if (column < 'a' || column > 'h' || row < 1 || row > 8) {
		 throw new XadrezException("Erro na posicao  " );
		 
	 }
	 this.column = column;
	 this.row =row ;
 }

public char getColumn() {
	return column;
}
public int getRow() {
	return row;
}

protected  Posicao toPosicao() {
	return new Posicao (8 - row , column - 'a');
}
protected static XadrezPosicao fromPosicao(Posicao posicao) {
	return new XadrezPosicao ((char)( 'a' - posicao.getColumn()), 8 - posicao.getRow());
}

@Override
public String toString ( ) {
	return "" + column + row ;
}
}
	   