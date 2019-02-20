package xadrez;

import Boardgame.Board;
import Boardgame.Peca;
import Boardgame.Posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidadeXadrez {
	private Board board;

	public PartidadeXadrez() {
		board = new Board(8,8);
		setupInicial();
	}

	public PecadeXadrez[][] getPecas() {
		PecadeXadrez[][] mat = new PecadeXadrez[board.getRows()][board.getColumns()];
		{
			for (int i = 0; i < board.getRows(); i++) {
				for (int j = 0; j < board.getColumns(); j++) {
					mat[i][j] = (PecadeXadrez) board.peca(i, j);
				}
			}
			return mat;

		}
	}
	public PecadeXadrez performXadrezMovimento(XadrezPosicao sourcePosicao ,XadrezPosicao targetPosicao) {
	Posicao source = sourcePosicao.toPosicao();
    Posicao target = targetPosicao.toPosicao();
    validarSourcePosicao(source);
    Peca capturarPeca = makeMove(source ,target);
    return (PecadeXadrez) capturarPeca;
}
	
	
	private Peca makeMove(Posicao source, Posicao target) {
		Peca p = board.removerPeca(source);
		Peca capturarPeca = board.removerPeca(target);
		board.lugardaPeca(p, target);
		return capturarPeca;
				}
	private void validarSourcePosicao(Posicao posicao) {
		if(!board.temUmaPeca(posicao)) {
		throw new XadrezException("NÃO TEM PEÇA");
		}
		}
	private void colocarNovaPeca(char column, int row, PecadeXadrez peca) {
		board.lugardaPeca(peca, new XadrezPosicao(column, row).toPosicao());
	}

	private void setupInicial() {
		
		
		colocarNovaPeca('c', 1, new Torre(board, Cor.WHITE));
		colocarNovaPeca('c', 2, new Torre(board, Cor.WHITE));
		colocarNovaPeca('d', 2, new Torre(board, Cor.WHITE));
		colocarNovaPeca('e', 2, new Torre(board, Cor.WHITE));
		colocarNovaPeca('e', 1, new Torre(board, Cor.WHITE));
		colocarNovaPeca('d', 1, new Rei(board, Cor.WHITE));

		colocarNovaPeca('c', 7, new Torre(board, Cor.BLACK));
		colocarNovaPeca('c', 8, new Torre(board, Cor.BLACK));
		colocarNovaPeca('d', 7, new Torre(board, Cor.BLACK));
		colocarNovaPeca('e', 7, new Torre(board, Cor.BLACK));
		colocarNovaPeca('e', 8, new Torre(board, Cor.BLACK));
		colocarNovaPeca('d', 8, new Rei(board, Cor.BLACK));

	}
}