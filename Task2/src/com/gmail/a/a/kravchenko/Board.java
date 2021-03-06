package com.gmail.a.a.kravchenko;

import java.util.Arrays;

public class Board {
	private Shape[] board = new Shape[4];

	public Board(Shape[] board) {
		super();
		this.board = board;
	}

	public Board() {
		super();
	}

	public Shape[] getBoard() {
		return board;
	}

	public void setBoard(Shape[] board) {
		this.board = board;
	}

	@Override
	public String toString() {
		return "Board [board=" + Arrays.toString(board) + "]";
	}

	public boolean toAddFigure(Shape figure, int index) {
		if (board[index] != null) {
			System.out.println("Can't add figure on this part board. This part [" + (index + 1) + "] is full");
			return false;
		} else {
			board[index] = figure;
			return true;
		}
	}

	public boolean toDeleteFigure(int index) {
		if (board[index] == null) {
			return true;
		} else {
			board[index] = null;
			return true;
		}
	}

	public Shape getFigure(int index) {
		return board[index];
	}

	public double toCalculatePerimeter() {
		double resultsPerimeter = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i] != null) {
				resultsPerimeter = resultsPerimeter + board[i].getPerimetr();
			}
		}
		return resultsPerimeter;
	}

	public double toCalculateArea() {
		double resultsArea = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i] != null) {
				resultsArea = resultsArea + board[i].getArea();
			}
		}
		return resultsArea;
	}

	public void toPrintInfo() {
		System.out.println("------------------------");
		for (int i = 0; i < board.length; i++) {
			if (board[i] == null) {
				System.out.print(" Empty     |");
			} else {
				System.out.print(" " + board[i].toStringFigure() + "  |");
			}
			if ((i == 1) || (i == 3)) {
				System.out.println('\r' + "------------------------");
			}
		}
		System.out.println("The area of all figures on board: " + Math.round(toCalculateArea() * 1000d) / 1000d);
	}

}
