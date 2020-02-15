import javax.swing.JFrame;
/**
 * 
 * @author >>RanaSiroosian<<
 *
 */
public class BrickBreakerApp {

	public static void main(String[] args) {
		
		//creating the frame for the game
		JFrame obj = new JFrame();
		//an object from GamePlay class
		GamePlay game = new GamePlay();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(game);
		
	}

}
