/*
    Juan Diego León - 20171020157

    Stiven Arango - 20182020032

    Mateo Matamoros - 20182020037

*/
package snake;

import java.awt.EventQueue;
import java.io.*;

public class Principal {

	// AQUI VA EL MAIN
	public static void main(String[] args) throws IOException {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SnakeFrame frame = new SnakeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
