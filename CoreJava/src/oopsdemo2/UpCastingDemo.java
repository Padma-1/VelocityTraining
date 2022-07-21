package oopsdemo2;

class Game {

	public void play() {
		System.out.println("Game is being played");
	}

	public void noOfPlayers() {
		System.out.println("Number of players depend on the game");
	}

	public void winner(String name) {
		System.out.println("Winner is " + name);
	}

}

class Cricket extends Game {
	public void noOfPlayers() {
		System.out.println("22");
	}

	public void teams() {
		System.out.println("2");
	}
}

class Chess extends Game {
	public void noOfPlayers() {
		System.out.println("2");
	}
}

//UpCasting is used when u want to generalise a function or 
//property so that it can be used by any of it's subtype.
public class UpCastingDemo {

	public static void main(String[] args) {

		Game g = new Cricket(); // upcasting --call overriden & base class
		Game g1 = new Chess();

		g.play(); // dynamic binding --Game is being played
		g.noOfPlayers();	//22
		g.winner("A");	// Winner is A

		// g.teams(); //gives compile error

		Cricket c = new Cricket(); 
		c.teams(); // static binding	//2
		c.noOfPlayers();	//22
		
		g1.play();	//base class method --game is being played
		g1.noOfPlayers();	//overriden method //2
		g1.winner("B");	//base class method		//winner is B
		
		System.out.println("**********************************");

		
		Game obj;
		obj=new Cricket(); //upcasting
		
		g.play();g.noOfPlayers();g.winner("DC");
		
		obj = new Chess();
		obj.play();obj.noOfPlayers();obj.winner("Pk");
		System.out.println("**********************************");
	}

}
