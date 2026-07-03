package pekan7_2411532007;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import java.awt.Font;

public class InsertionSortGUI_2411532007 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private int[] array_2007;
	private JLabel [] labelArray_2007;
	private JButton stepButton_2007, resetButton_2007, setButton_2007;
	private JTextField inputField_2007;
	private JPanel panelArray_2007;
	private JTextArea stepArea_2007;
	
	private int i_2007 = 1, j_2007;
	private boolean sorting_2007 = false;
	private int stepCount_2007 = 1;


	/**
	 * Create the frame.
	 */
	public InsertionSortGUI_2411532007() {
	    setTitle("Insertion Sort Langkah per Langkah");
	    setSize(750, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setLayout(new BorderLayout());

	    // Panel input
	    JPanel inputPanel_2007 = new JPanel(new FlowLayout());
	    inputField_2007 = new JTextField(30);
	    setButton_2007 = new JButton("Set Array");
	    inputPanel_2007.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
	    inputPanel_2007.add(inputField_2007);
	    inputPanel_2007.add(setButton_2007);

	    // Panel array visual
	    panelArray_2007 = new JPanel();
	    panelArray_2007.setLayout(new FlowLayout());

	    // Panel kontrol
	    JPanel controlPanel_2007 = new JPanel();
	    stepButton_2007 = new JButton("Langkah Selanjutnya");
	    resetButton_2007 = new JButton("Reset");
	    stepButton_2007.setEnabled(false);
	    controlPanel_2007.add(stepButton_2007);
	    controlPanel_2007.add(resetButton_2007);
	    
	 // Area teks untuk log langkah-langkah
	    stepArea_2007 = new JTextArea(8, 60);
	    stepArea_2007.setEditable(false);
	    stepArea_2007.setFont(new Font("Monospaced", Font.PLAIN, 14));
	    JScrollPane scrollPane_2007 = new JScrollPane(stepArea_2007);

	    // Tambahkan panel ke frame
	    add(inputPanel_2007, BorderLayout.NORTH);
	    add(panelArray_2007, BorderLayout.CENTER);
	    add(controlPanel_2007, BorderLayout.SOUTH);
	    add(scrollPane_2007, BorderLayout.EAST);

	    // Event Set Array
	    setButton_2007.addActionListener(e_2007 -> setArrayFromInput_2007());

	    // Event Langkah Selanjutnya
	    stepButton_2007.addActionListener(e_2007 -> performStep_2007());

	    // Event Reset
	    resetButton_2007.addActionListener(e_2007 -> reset_2007());
	    
	}
	
	private void setArrayFromInput_2007() {
	    String text_2007 = inputField_2007.getText().trim();
	    if (text_2007.isEmpty()) return;
	    String[] parts_2007 = text_2007.split(",");
	    array_2007 = new int[parts_2007.length];
	    try {
	        for (int k_2007 = 0; k_2007 < parts_2007.length; k_2007++) {
	            array_2007[k_2007] = Integer.parseInt(parts_2007[k_2007].trim());
	        }
	    } catch (NumberFormatException e_2007) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan "
	                + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }

	    i_2007 = 1;
	    stepCount_2007 = 1;
	    sorting_2007 = true;
	    stepButton_2007.setEnabled(true);
	    stepArea_2007.setText("");
	    panelArray_2007.removeAll();
	    labelArray_2007 = new JLabel[array_2007.length];

	    for (int k_2007 = 0; k_2007 < array_2007.length; k_2007++) {
	        labelArray_2007[k_2007] = new JLabel(String.valueOf(array_2007[k_2007]));
	        labelArray_2007[k_2007].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_2007[k_2007].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_2007[k_2007].setPreferredSize(new Dimension(50, 50));
	        labelArray_2007[k_2007].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_2007.add(labelArray_2007[k_2007]);
	    }

	    panelArray_2007.revalidate();
	    panelArray_2007.repaint();
	}
	
	private void performStep_2007() {
		if ( i_2007 < array_2007.length && sorting_2007 ) {
			int key_2007 = array_2007[i_2007];
			j_2007 = i_2007 - 1;
			
			StringBuilder stepLog_2007 = new StringBuilder();
			stepLog_2007.append("Langkah ").append(key_2007).append("\n");
			
			while (j_2007 >= 0 && array_2007[j_2007] > key_2007) {
				array_2007[j_2007 + 1] = array_2007[j_2007];
				j_2007 --;
			}
			array_2007[j_2007 + 1] = key_2007;
			
			updateLabels_2007();
			stepLog_2007.append("Hasil: ").append(arrayToString_2007(array_2007)).append("\n\n");
			stepArea_2007.append(stepLog_2007.toString());
			
			i_2007++;
			stepCount_2007++;
			
			if ( i_2007 == array_2007.length) {
				sorting_2007 = false;
				stepButton_2007.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting Selesai!");
			}
		}
	}
	
	private void updateLabels_2007() {
	    for (int k_2007 = 0; k_2007 < array_2007.length; k_2007++) {
	        labelArray_2007[k_2007].setText(String.valueOf(array_2007[k_2007]));
	    }
	}

	private void reset_2007() {
	    inputField_2007.setText("");
	    panelArray_2007.removeAll();
	    panelArray_2007.revalidate();
	    panelArray_2007.repaint();
	    stepArea_2007.setText("");
	    stepButton_2007.setEnabled(false);
	    sorting_2007 = false;
	    i_2007 = 1;
	    stepCount_2007 = 1;
	}

	private String arrayToString_2007(int[] arr_2007) {
	    StringBuilder sb_2007 = new StringBuilder();
	    for (int k_2007 = 0; k_2007 < arr_2007.length; k_2007++) {
	        sb_2007.append(arr_2007[k_2007]);
	        if (k_2007 < arr_2007.length - 1) sb_2007.append(", ");
	    }
	    return sb_2007.toString();
	}

	public static void main(String[] args_2007) {
	    SwingUtilities.invokeLater(() -> {
	        InsertionSortGUI_2411532007 gui_2007 = new InsertionSortGUI_2411532007();
	        gui_2007.setVisible(true);
	    });
	}
}
