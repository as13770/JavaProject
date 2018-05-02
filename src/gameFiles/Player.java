package gameFiles;

public abstract class Player {
	private String name = "";
	private int Score = 0;
	
	public Player(String a){
		this.name = a;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}
	
	
	
}
