package pekan7_2411532007;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class SortingGUI_2411532007 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FName_2007;
	private JTextField FNim_2007;
	private JTextField FFakultas_2007;
	private JTextArea DMhs_2007;
	private JTextArea SMhs_2007;
	private ArrayList<Mahasiswa_2007> listMahasiswa_2007 = new ArrayList<Mahasiswa_2007>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortingGUI_2411532007 frame = new SortingGUI_2411532007();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SortingGUI_2411532007() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		FName_2007 = new JTextField();
		FName_2007.setBounds(10, 11, 96, 20);
		contentPane.add(FName_2007);
		FName_2007.setColumns(10);

		FNim_2007 = new JTextField();
		FNim_2007.setBounds(116, 11, 96, 20);
		contentPane.add(FNim_2007);
		FNim_2007.setColumns(10);

		FFakultas_2007 = new JTextField();
		FFakultas_2007.setBounds(222, 11, 96, 20);
		contentPane.add(FFakultas_2007);
		FFakultas_2007.setColumns(10);

		JButton btnInput_2007 = new JButton("Input");
		btnInput_2007.setBounds(337, 10, 89, 23);
		contentPane.add(btnInput_2007);

		JButton btnSort_2007 = new JButton("Sorting");
		btnSort_2007.setBounds(235, 148, 89, 23);
		contentPane.add(btnSort_2007);

		JButton btnReset_2007 = new JButton("Reset");
		btnReset_2007.setBounds(337, 148, 89, 23);
		contentPane.add(btnReset_2007);

		JComboBox<String> DDSorting_2007 = new JComboBox<String>();
		DDSorting_2007.setBounds(10, 148, 160, 22);
		contentPane.add(DDSorting_2007);

		DMhs_2007 = new JTextArea();
		DMhs_2007.setEditable(false);

		SMhs_2007 = new JTextArea();
		SMhs_2007.setEditable(false);

		JScrollPane scrollPaneDMhs_2007 = new JScrollPane(DMhs_2007);
		scrollPaneDMhs_2007.setBounds(10, 42, 416, 95);
		contentPane.add(scrollPaneDMhs_2007);

		JScrollPane scrollPaneSMhs_2007 = new JScrollPane(SMhs_2007);
		scrollPaneSMhs_2007.setBounds(10, 182, 416, 70);
		contentPane.add(scrollPaneSMhs_2007);

		setupComboBox_2007(DDSorting_2007);
		setupActionListeners_2007(btnInput_2007, btnSort_2007, btnReset_2007, DDSorting_2007);
	}

	private void setupComboBox_2007(JComboBox<String> combo_2007) {
		combo_2007.addItem("Insertion Sort");
		combo_2007.addItem("Selection Sort");
		combo_2007.addItem("Bubble Sort");
	}

	private void setupActionListeners_2007(final JButton btnInput_2007, final JButton btnSort_2007,
			final JButton btnReset_2007, final JComboBox<String> combo_2007) {

		btnInput_2007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e_2007) {
				inputData_2007();
			}
		});

		btnSort_2007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e_2007) {
				startSorting_2007(combo_2007);
			}
		});

		btnReset_2007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e_2007) {
				resetData_2007();
			}
		});
	}

	private void inputData_2007() {
		String nama_2007 = FName_2007.getText().trim();
		String nim_2007 = FNim_2007.getText().trim();
		String fakultas_2007 = FFakultas_2007.getText().trim();

		if (nama_2007.isEmpty() || nim_2007.isEmpty() || fakultas_2007.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Semua field wajib diisi!", "Input Kosong", JOptionPane.WARNING_MESSAGE);
			return;
		}

		Mahasiswa_2007 m_2007 = new Mahasiswa_2007();
		m_2007.setNama_2007(nama_2007);
		m_2007.setNim_2007(nim_2007);
		m_2007.setFakultas_2007(fakultas_2007);
		
		listMahasiswa_2007.add(m_2007);
		updateDisplay_2007();

		FName_2007.setText("");
		FNim_2007.setText("");
		FFakultas_2007.setText("");
		FName_2007.requestFocus();
	}

	private void updateDisplay_2007() {
		StringBuilder sb_2007 = new StringBuilder("DATA MAHASISWA:\n");
		sb_2007.append("--------------------------------------------------\n");
		for (int i_2007 = 0; i_2007 < listMahasiswa_2007.size(); i_2007++) {
			Mahasiswa_2007 m_2007 = listMahasiswa_2007.get(i_2007);
			sb_2007.append(String.format("%-2d. %-12s | NIM: %-10s | %s\n",
					i_2007 + 1, m_2007.getNama_2007(), m_2007.getNim_2007(), m_2007.getFakultas_2007()));
		}
		DMhs_2007.setText(sb_2007.toString());
	}

	private void startSorting_2007(final JComboBox<String> combo_2007) {
		if (listMahasiswa_2007.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Data masih kosong!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		final String pilihan_2007 = (String) combo_2007.getSelectedItem();
		SMhs_2007.setText("=== MEMULAI SORTING ===\nData Awal: " + formatList_2007() + "\n\n");

		Thread thread_2007 = new Thread(new Runnable() {
			public void run() {
				try {
					if ("Insertion Sort".equals(pilihan_2007)) {
						insertionSort_2007();
					} else if ("Selection Sort".equals(pilihan_2007)) {
						selectionSort_2007();
					} else if ("Bubble Sort".equals(pilihan_2007)) {
						bubbleSort_2007();
					}
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							SMhs_2007.append("\nProses Selesai!");
							updateDisplay_2007();
						}
					});
				} catch (InterruptedException ex_2007) {
					ex_2007.printStackTrace();
				}
			}
		});
		thread_2007.start();
	}

	private String formatList_2007() {
		StringBuilder sb_2007 = new StringBuilder("[");
		for (int i_2007 = 0; i_2007 < listMahasiswa_2007.size(); i_2007++) {
			sb_2007.append(listMahasiswa_2007.get(i_2007).getNama_2007());
			if (i_2007 < listMahasiswa_2007.size() - 1) sb_2007.append(", ");
		}
		sb_2007.append("]");
		return sb_2007.toString();
	}

	private void logStep_2007(final String msg_2007) throws InterruptedException {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SMhs_2007.append(msg_2007 + "\n");
				SMhs_2007.setCaretPosition(SMhs_2007.getDocument().getLength());
			}
		});
		Thread.sleep(500);
	}

	private void resetData_2007() {
		listMahasiswa_2007.clear();
		DMhs_2007.setText("");
		SMhs_2007.setText("");
		FName_2007.setText("");
		FNim_2007.setText("");
		FFakultas_2007.setText("");
	}

	private void insertionSort_2007() throws InterruptedException {
		logStep_2007(">> INSERTION SORT");
		for (int i_2007 = 1; i_2007 < listMahasiswa_2007.size(); i_2007++) {
			Mahasiswa_2007 key_2007 = listMahasiswa_2007.get(i_2007);
			int j_2007 = i_2007 - 1;
			while (j_2007 >= 0 && listMahasiswa_2007.get(j_2007).getNama_2007().compareToIgnoreCase(key_2007.getNama_2007()) > 0) {
				listMahasiswa_2007.set(j_2007 + 1, listMahasiswa_2007.get(j_2007));
				j_2007--;
			}
			listMahasiswa_2007.set(j_2007 + 1, key_2007);
			logStep_2007("Langkah " + i_2007 + ": " + formatList_2007());
		}
	}

	private void selectionSort_2007() throws InterruptedException {
		logStep_2007(">> SELECTION SORT");
		for (int i_2007 = 0; i_2007 < listMahasiswa_2007.size() - 1; i_2007++) {
			int minIdx_2007 = i_2007;
			for (int j_2007 = i_2007 + 1; j_2007 < listMahasiswa_2007.size(); j_2007++) {
				if (listMahasiswa_2007.get(j_2007).getNama_2007().compareToIgnoreCase(listMahasiswa_2007.get(minIdx_2007).getNama_2007()) < 0) {
					minIdx_2007 = j_2007;
				}
			}
			Mahasiswa_2007 temp_2007 = listMahasiswa_2007.get(i_2007);
			listMahasiswa_2007.set(i_2007, listMahasiswa_2007.get(minIdx_2007));
			listMahasiswa_2007.set(minIdx_2007, temp_2007);
			logStep_2007("Pass " + (i_2007 + 1) + ": " + formatList_2007());
		}
	}

	private void bubbleSort_2007() throws InterruptedException {
		logStep_2007(">> BUBBLE SORT");
		int n_2007 = listMahasiswa_2007.size();
		for (int i_2007 = 0; i_2007 < n_2007 - 1; i_2007++) {
			boolean swapped_2007 = false;
			for (int j_2007 = 0; j_2007 < n_2007 - i_2007 - 1; j_2007++) {
				if (listMahasiswa_2007.get(j_2007).getNama_2007().compareToIgnoreCase(listMahasiswa_2007.get(j_2007 + 1).getNama_2007()) > 0) {
					Mahasiswa_2007 temp_2007 = listMahasiswa_2007.get(j_2007);
					listMahasiswa_2007.set(j_2007, listMahasiswa_2007.get(j_2007 + 1));
					listMahasiswa_2007.set(j_2007 + 1, temp_2007);
					swapped_2007 = true;
				}
			}
			logStep_2007("Pass " + (i_2007 + 1) + ": " + formatList_2007());
			if (!swapped_2007) break;
		}
	}

	static class Mahasiswa_2007 {
		private String nama_2007;
		private String nim_2007;
		private String fakultas_2007;

		public Mahasiswa_2007() {
		}

		public Mahasiswa_2007(String nama_2007, String nim_2007, String fakultas_2007) {
			this.nama_2007 = nama_2007;
			this.nim_2007 = nim_2007;
			this.fakultas_2007 = fakultas_2007;
		}

		public String getNama_2007() {
			return nama_2007;
		}

		public void setNama_2007(String nama_2007) {
			this.nama_2007 = nama_2007;
		}

		public String getNim_2007() {
			return nim_2007;
		}

		public void setNim_2007(String nim_2007) {
			this.nim_2007 = nim_2007;
		}

		public String getFakultas_2007() {
			return fakultas_2007;
		}

		public void setFakultas_2007(String fakultas_2007) {
			this.fakultas_2007 = fakultas_2007;
		}
	}
}