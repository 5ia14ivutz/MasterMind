package masterMind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

	public Row generatePattern(int number){
		Row row = new Row();
	    List<Pin> list = new ArrayList<>();
	    
	    Random ran = new Random();
	    for(int i = 0;i<number;i++){
	    
	    	int ranNumber = ran.nextInt(7);
	    	list.add(ranNumber);
	    }
	    
	    row.setPinList(list);
		return null;
	}
	
	public boolean checkRow(Row pattern, Row row){
		List<boolean> trues = new ArrayList<>();
		for(int i = 0; i<pattern.length();i++){
			if(pattern.get(i) == row.get(i)){
				trues.add(true);
			}
			else{
				trues.add(false);
			}
		}
		return false;
	}
}
