package Boardgame;

public class Board {
  
	
	  private int rows;
	  private int columns;
	  private Peca[][] pecas;
	public Board(int rows,int columns) {
		if (rows < 1 || columns <1  ) {
			throw new BoardException("ERRO NO TABULEIRO : IMPOSSIVEL CRIAR COM MENOS DE UMA LINHA");	
		}
		this.rows = rows;
		this.columns = columns;
		pecas = new Peca [rows][columns];
	}
	public int getRows() {
		return rows;
	}
	public int getColumns() {
		return columns;
	}
	  public Peca peca (int row, int column) {
		  if(!posicaoExistente(row , column)) {
			  throw new BoardException("ERRO DE POSICAO  : Posicao não existe no tabuleiro  ") ;
		  }
		  return pecas [row][column];
	  }
	  public Peca peca (Posicao posicao) {
		  if(!posicaoExistente (posicao)) {
			  throw new BoardException("ERRO DE POSICAO : Posicao não existe no tabuleiro  ");
			  }
		  return pecas [posicao.getRow()][posicao.getColumn()] ;
		  }
	  
		  public void lugardaPeca(Peca peca,Posicao posicao) {
			  if (temUmaPeca(posicao)) {
				  throw new BoardException("Essa peça não pode ser movida " + posicao);
			  }
			  pecas[posicao.getRow()][posicao.getColumn()] = peca;
			  peca.posicao = posicao;
			  
			  
		  }
		  private boolean posicaoExistente(int row, int column) {
			 return  row >= 0 && row < rows && column >= 0 && column < columns;
		  
		  }
		  public boolean posicaoExistente(Posicao posicao) {
			  return posicaoExistente (posicao.getRow(), posicao.getColumn());
		  }
		  public boolean temUmaPeca(Posicao posicao) {
			  if(!posicaoExistente (posicao)) {
				  throw new BoardException("ERRO DE POSICAO : Posicao não existe no tabuleiro  ");
				  }
			 return peca (posicao) != null;
		  }
	  }
	  
			  

