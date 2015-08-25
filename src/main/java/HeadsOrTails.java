import java.util.Random;

public class HeadsOrTails {

	public String[] coin = {"Head", "Tail"};

	public String headsOrTails(){
	    Random rand = new Random();
    	int randomNum = rand.nextInt(coin.length);
    	return coin[randomNum];		
	} 

}
