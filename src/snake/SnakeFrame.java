package snake;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SnakeFrame extends JFrame {

	// SE CREA EL PANEL
	private SnakePanel contentPane;
	// SE CREA LOS DIALOGO
	
	private FramesArc f;

	// FUNCIONES DEL FRAME
	public SnakeFrame() {

		// CARACTERISTICAS
		setBounds(100, 100, 480, 350);
		setLocationRelativeTo(null);
		setTitle("SNAKE");
		contentPane = new SnakePanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		System.out.print(1);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setResizable(false);
		
		// BOTON JUGAR
		contentPane.getBtnJugar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ABRE EL JUEGO DESDE LA CLASE APP
				App.getInstance().runScene(new GameScene());
				App.getInstance().setVisible(true);
			}

		});

		

		

		

		// BOTON SALIR
		contentPane.getBtnSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// MUESTRA CUADRO DE DIALOGO Y TERMINA PROCESO
				JOptionPane.showMessageDialog(null, "We need a five :'v");
				System.exit(0);

			}
		});

	}
}
