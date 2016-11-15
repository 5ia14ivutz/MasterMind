package masterMind;

import java.util.List;

public class Game {
	private List<Row> rowList;
	private static Row pattern;
	private static Computer computer;
	
	public static void main(String[] args) {
		computer = new Computer();
		pattern = computer.generatePattern(4);
	}
	
	public Row readInput(){
		return null;
	}
	
	public void printResult(){
		
	}
}
