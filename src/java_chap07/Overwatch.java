package java_chap07;

public class Overwatch {

	public static void main(String[] args) {
		Games game = new Games();
		
		McCree mc = new McCree();
		game.play(mc);
		
		Gengi gj = new Gengi();
		game.play(gj);
		
		gj.attack();
		gj.stop();
		gj.specialSkill();
	}

}
