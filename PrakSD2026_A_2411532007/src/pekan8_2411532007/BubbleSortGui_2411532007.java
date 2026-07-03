package pekan8_2411532007;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BubbleSortGui_2411532007 extends JFrame {

    private JTextField inputField_2007;
    private JButton setButton_2007;
    private JButton stepButton_2007;
    private JButton resetButton_2007;
    private JTextArea stepArea_2007;
    private JPanel panelArray_2007;

    private int[] array_2007;
    private JLabel[] labelArray_2007;

    private int i_2007 = 0;
    private int j_2007 = 0;
    private int stepCount_2007 = 1;
    private boolean sorting_2007 = false;

    public BubbleSortGui_2411532007() {
        setTitle("Visualisasi Bubble Sort");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel(new FlowLayout());

        JLabel inputLabel = new JLabel("Masukkan angka (pisahkan dengan koma):");
        inputField_2007 = new JTextField(30);

        setButton_2007 = new JButton("Set Array");
        stepButton_2007 = new JButton("Step");
        resetButton_2007 = new JButton("Reset");

        stepButton_2007.setEnabled(false);

        inputPanel.add(inputLabel);
        inputPanel.add(inputField_2007);
        inputPanel.add(setButton_2007);
        inputPanel.add(stepButton_2007);
        inputPanel.add(resetButton_2007);

        add(inputPanel, BorderLayout.NORTH);

        panelArray_2007 = new JPanel(new FlowLayout());
        panelArray_2007.setPreferredSize(new Dimension(750, 120));
        add(panelArray_2007, BorderLayout.CENTER);

        stepArea_2007 = new JTextArea();
        stepArea_2007.setEditable(false);
        stepArea_2007.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(stepArea_2007);
        scrollPane.setPreferredSize(new Dimension(750, 250));

        add(scrollPane, BorderLayout.SOUTH);

        setButton_2007.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setArrayFromInput();
            }
        });

        stepButton_2007.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performStep();
            }
        });

        resetButton_2007.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
    }

    private void setArrayFromInput() {
        String text = inputField_2007.getText().trim();

        if (text.isEmpty()) {
            return;
        }

        String[] parts_2007 = text.split(",");
        array_2007 = new int[parts_2007.length];

        try {
            for (int k_2007 = 0; k_2007 < parts_2007.length; k_2007++) {
                array_2007[k_2007] = Integer.parseInt(parts_2007[k_2007].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan hanya angka yang dipisahkan koma!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        i_2007 = 0;
        j_2007 = 0;
        stepCount_2007 = 1;
        sorting_2007 = true;

        stepButton_2007.setEnabled(true);
        stepArea_2007.setText("");
        panelArray_2007.removeAll();

        labelArray_2007 = new JLabel[array_2007.length];

        for (int k_2007 = 0; k_2007 < array_2007.length; k_2007++) {
            labelArray_2007[k_2007] = new JLabel(String.valueOf(array_2007[k_2007]));
            labelArray_2007[k_2007].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_2007[k_2007].setOpaque(true);
            labelArray_2007[k_2007].setBackground(Color.WHITE);
            labelArray_2007[k_2007].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_2007[k_2007].setPreferredSize(new Dimension(50, 50));
            labelArray_2007[k_2007].setHorizontalAlignment(SwingConstants.CENTER);

            panelArray_2007.add(labelArray_2007[k_2007]);
        }

        panelArray_2007.revalidate();
        panelArray_2007.repaint();
    }

    private void performStep() {
        if (!sorting_2007 || i_2007 >= array_2007.length - 1) {
            sorting_2007 = false;
            stepButton_2007.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }

        resetHighlights();

        StringBuilder stepLog_2007 = new StringBuilder();

        labelArray_2007[j_2007].setBackground(Color.CYAN);
        labelArray_2007[j_2007 + 1].setBackground(Color.CYAN);

        if (array_2007[j_2007] > array_2007[j_2007 + 1]) {
            int temp_2007 = array_2007[j_2007];
            array_2007[j_2007] = array_2007[j_2007 + 1];
            array_2007[j_2007 + 1] = temp_2007;

            labelArray_2007[j_2007].setBackground(Color.RED);
            labelArray_2007[j_2007 + 1].setBackground(Color.RED);

            stepLog_2007.append("Langkah ").append(stepCount_2007).append(": ")
                    .append("Menukar elemen ke-").append(j_2007)
                    .append(" (").append(array_2007[j_2007 + 1]).append(")")
                    .append(" dengan ke-").append(j_2007 + 1)
                    .append(" (").append(array_2007[j_2007]).append(")\n");

        } else {
            stepLog_2007.append("Langkah ").append(stepCount_2007).append(": ")
                    .append("Tidak ada pertukaran antara ke-")
                    .append(j_2007).append(" dan ke-")
                    .append(j_2007 + 1).append("\n");
        }

        stepLog_2007.append("Hasil: ").append(arrayToString(array_2007)).append("\n\n");
        stepArea_2007.append(stepLog_2007.toString());

        updateLabels();

        j_2007++;

        if (j_2007 >= array_2007.length - 1 - i_2007) {
            j_2007 = 0;
            i_2007++;
        }

        stepCount_2007++;

        if (i_2007 >= array_2007.length - 1) {
            sorting_2007 = false;
            stepButton_2007.setEnabled(false);
            resetHighlights();

            for (JLabel label_2007 : labelArray_2007) {
                label_2007.setBackground(Color.GREEN);
            }

            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels() {
        for (int k_2007 = 0; k_2007 < array_2007.length; k_2007++) {
            labelArray_2007[k_2007].setText(String.valueOf(array_2007[k_2007]));
        }
    }

    private void resetHighlights() {
        for (JLabel label_2007 : labelArray_2007) {
            label_2007.setBackground(Color.WHITE);
        }
    }

    private void reset() {
        inputField_2007.setText("");
        panelArray_2007.removeAll();
        panelArray_2007.revalidate();
        panelArray_2007.repaint();

        stepArea_2007.setText("");
        stepButton_2007.setEnabled(false);

        sorting_2007 = false;
        i_2007 = 0;
        j_2007 = 0;
        stepCount_2007 = 1;
    }

    private String arrayToString(int[] arr) {
        StringBuilder sb_2007 = new StringBuilder();

        for (int k_2007 = 0; k_2007 < arr.length; k_2007++) {
            sb_2007.append(arr[k_2007]);

            if (k_2007 < arr.length - 1) {
                sb_2007.append(", ");
            }
        }

        return sb_2007.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BubbleSortGui_2411532007().setVisible(true);
            }
        });
    }
}