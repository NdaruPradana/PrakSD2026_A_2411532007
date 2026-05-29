package pekan7_2411532007;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2411532007 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int[] array2007;
	private JLabel[] labelArray2007;
	private JButton stepButton2007, resetButton2007, setButton2007;
	private JTextField inputField2007;
	private JPanel panelArray2007;
	private JTextArea stepArea2007;
	
	private int i = 1, j;
	private boolean sorting2007 = false;
	private int stepCount2007 = 1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public InsertionSortGUI_2411532007() {
		setTitle("Insertion SOrt Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		//input
		JPanel inputPanel = new JPanel (new FlowLayout());
		inputField2007 = new JTextField(30);
		setButton2007 = new JButton("Set Array");
		inputPanel.add(new JLabel ("Masukkan angka(pisahkan dengan koma):"));
		inputPanel.add(inputField2007);
		inputPanel.add(setButton2007);
		
		// Panel array visual
		panelArray2007 = new JPanel ();
		panelArray2007.setLayout(new FlowLayout());
		
		//Panel Kontrol
		JPanel controlPanel = new JPanel();
		stepButton2007 = new JButton("Langkah Selanjutnya");
		resetButton2007 = new JButton("Reset*");
		stepButton2007.setEnabled(false);
		controlPanel.add(stepButton2007);
		controlPanel.add(resetButton2007);
		
		//Area teks untuk log Langkah Langkah
		stepArea2007 = new JTextArea(8, 60);
		stepArea2007.setEditable(false);
		stepArea2007.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(stepArea2007);
		
		//Tambahkan panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray2007, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
		
		//Event Set Array
		setButton2007.addActionListener(e -> setArrayFromInput());
		
		//Event Langkah Selanjutnya
		stepButton2007.addActionListener(e -> performStep());
		
		//Event Reset
		resetButton2007.addActionListener(e -> reset());
	}
	private void setArrayFromInput() {
		String text = inputField2007.getText().trim();
		if(text.isEmpty()) return;
		String[] parts = text.split(",");
		array2007 = new int[parts.length];
		try {
			for (int k = 0; k < parts.length; k++) {
				array2007[k] = Integer.parseInt(parts[k].trim());
			}
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan" + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		i = 1;
		stepCount2007 = 1;
		sorting2007 = true;
		stepButton2007.setEnabled(true);
		stepArea2007.setText("");
		panelArray2007.removeAll();
		labelArray2007 = new JLabel[array2007.length];
		for (int k = 0; k < array2007.length; k++) {
			labelArray2007[k] = new JLabel(String.valueOf(array2007[k]));
			labelArray2007[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray2007[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray2007[k].setPreferredSize(new Dimension(50,50));
			labelArray2007[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray2007.add(labelArray2007[k]);
			
		}
		panelArray2007.revalidate();
		panelArray2007.repaint();
	}
	private void performStep() {
		if (i < array2007.length && sorting2007) {

			int key = array2007[i];
			j = i - 1;

			StringBuilder stepLog = new StringBuilder();
			stepLog.append("Langkah ")
			       .append(stepCount2007)
			       .append(": Memasukkan ")
			       .append(key)
			       .append("\n");

			// Geser elemen yang lebih besar
			while (j >= 0 && array2007[j] > key) {

				array2007[j + 1] = array2007[j];

				stepLog.append("Geser ")
				       .append(array2007[j])
				       .append(" ke kanan\n");

				j--;
			}

			// Masukkan key ke posisi yang benar
			array2007[j + 1] = key;

			updateLabel();

			stepLog.append("Hasil: ")
			       .append(arrayToString2007(array2007))
			       .append("\n\n");

			stepArea2007.append(stepLog.toString());

			i++;
			stepCount2007++;

			if (i == array2007.length) {
				sorting2007 = false;
				stepButton2007.setEnabled(false);

				JOptionPane.showMessageDialog(this, "Sorting selesai");
			}
		}
	}
	
	private void updateLabel() {
		for (int k = 0; k < array2007.length; k++) {
			labelArray2007[k].setText(String.valueOf(array2007[k]));
		}
	}
	
	private void reset() {
		inputField2007.setText("");
		panelArray2007.removeAll();
		panelArray2007.revalidate();
		panelArray2007.repaint();
		stepArea2007.setText("");
		stepButton2007.setEnabled(false);
		sorting2007 = false;
		i = 1;
		stepCount2007 = 1;
	}
	
	private String arrayToString2007(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < arr.length; k++) {
			sb.append(arr[k]);
			if (k < arr.length - 1) sb.append(", ");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() ->{
			InsertionSortGUI_2411532007 gui = new InsertionSortGUI_2411532007();
			gui.setVisible(true);
		}) ;
	}
}
