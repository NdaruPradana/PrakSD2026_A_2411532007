package pekan9_2411532007;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class petaHarian_2411532007 extends JFrame {

    private JComboBox<String> comboBoxAwal_2007;
    private JComboBox<String> comboBoxAkhir_2007;
    private JButton btnBfs_2007;
    private JButton btnDfs_2007;
    private JButton btnReset_2007;
    private JLabel lblJalur_2007;
    private JLabel lblNodeDikunjungi_2007;
    private JLabel lblJumlahNode_2007;
    private GraphPanel_2007 panelGrafik_2007;

    private Map<String, Vertex_2007> vertices_2007;
    private Map<String, List<String>> adjacencyList_2007;
    private List<String> visitedNodes_2007;
    private List<String> pathNodes_2007;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                petaHarian_2411532007 frame = new petaHarian_2411532007();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public petaHarian_2411532007() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(583, 700);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        initializeGraph_2007();

        JLabel lblLokasiAwal_2007 = new JLabel("Lokasi Awal:");
        lblLokasiAwal_2007.setBounds(10, 11, 80, 14);
        getContentPane().add(lblLokasiAwal_2007);

        comboBoxAwal_2007 = new JComboBox<>();
        comboBoxAwal_2007.setBounds(90, 7, 150, 22);
        for (String vertex : vertices_2007.keySet()) {
            comboBoxAwal_2007.addItem(vertex);
        }
        getContentPane().add(comboBoxAwal_2007);

        JLabel lblLokasiAkhir_2007 = new JLabel("Lokasi Tujuan:");
        lblLokasiAkhir_2007.setBounds(10, 36, 80, 14);
        getContentPane().add(lblLokasiAkhir_2007);

        comboBoxAkhir_2007 = new JComboBox<>();
        comboBoxAkhir_2007.setBounds(90, 32, 150, 22);
        for (String vertex : vertices_2007.keySet()) {
            comboBoxAkhir_2007.addItem(vertex);
        }
        getContentPane().add(comboBoxAkhir_2007);

        btnBfs_2007 = new JButton("BFS");
        btnBfs_2007.setBounds(260, 7, 80, 23);
        btnBfs_2007.addActionListener(e -> BFS_2007());
        getContentPane().add(btnBfs_2007);

        btnDfs_2007 = new JButton("DFS");
        btnDfs_2007.setBounds(350, 7, 80, 23);
        btnDfs_2007.addActionListener(e -> DFS_2007());
        getContentPane().add(btnDfs_2007);

        btnReset_2007 = new JButton("RESET");
        btnReset_2007.setBounds(440, 7, 80, 23);
        btnReset_2007.addActionListener(e -> resetGraph_2007());
        getContentPane().add(btnReset_2007);

        panelGrafik_2007 = new GraphPanel_2007();
        panelGrafik_2007.setBounds(10, 61, 500, 500);
        getContentPane().add(panelGrafik_2007);

        JLabel lblHasilPencarian_2007 = new JLabel("Hasil Pencarian:");
        lblHasilPencarian_2007.setBounds(10, 563, 150, 14);
        getContentPane().add(lblHasilPencarian_2007);

        lblJalur_2007 = new JLabel("Jalur: -");
        lblJalur_2007.setBounds(10, 577, 780, 14);
        getContentPane().add(lblJalur_2007);

        lblNodeDikunjungi_2007 = new JLabel("Node Dikunjungi: -");
        lblNodeDikunjungi_2007.setBounds(10, 595, 780, 14);
        getContentPane().add(lblNodeDikunjungi_2007);

        lblJumlahNode_2007 = new JLabel("Jumlah Node Dikunjungi: 0");
        lblJumlahNode_2007.setBounds(10, 612, 780, 14);
        getContentPane().add(lblJumlahNode_2007);
        
        displayGraph_2007();
    }

private void initializeGraph_2007() {
    vertices_2007 = new HashMap<>();
    adjacencyList_2007 = new HashMap<>();
    
    addVertex_2007("Kantin DPR", 240, 60);         
    addVertex_2007("ATB", 100, 110);                
    addVertex_2007("DTI", 380, 110);                
    
    addVertex_2007("Gedung Audit", 240, 190);       
    addVertex_2007("FISIP", 100, 280);            
    addVertex_2007("Gedung H", 380, 280);          
    
    addVertex_2007("Kos A", 80, 390);               
    addVertex_2007("Kos B", 200, 390);              
    addVertex_2007("Aciak Mart", 320, 390);        
    addVertex_2007("Feb Mart", 440, 390);           

    addEdge_2007("Kantin DPR", "ATB");             
    addEdge_2007("Kantin DPR", "DTI");             
    addEdge_2007("Kantin DPR", "Gedung Audit");                 
    
    addEdge_2007("ATB", "Gedung Audit");            
    addEdge_2007("DTI", "Gedung H");                
    addEdge_2007("DTI", "FISIP");                 
    
    addEdge_2007("Gedung Audit", "Gedung H");       
    addEdge_2007("Gedung Audit", "Kos B");         
    
    addEdge_2007("FISIP", "Kos A");                
    addEdge_2007("FISIP", "Kos B");                
    
    addEdge_2007("Kos A", "Kos B");                 
    addEdge_2007("Kos B", "Aciak Mart");            
    addEdge_2007("Aciak Mart", "Feb Mart");         
    addEdge_2007("Feb Mart", "Gedung H");           
    addEdge_2007("Aciak Mart", "Gedung H");        
}

    private void addVertex_2007(String name_2007, int x_2007, int y_2007) {
        vertices_2007.put(name_2007, new Vertex_2007(name_2007, x_2007, y_2007));
        adjacencyList_2007.put(name_2007, new ArrayList<>());
    }

    private void addEdge_2007(String v1_2007, String v2_2007) {
        adjacencyList_2007.get(v1_2007).add(v2_2007);
        adjacencyList_2007.get(v2_2007).add(v1_2007); 
    }


    public void BFS_2007() {
        String start_2007 = (String) comboBoxAwal_2007.getSelectedItem();
        String goal_2007 = (String) comboBoxAkhir_2007.getSelectedItem();
        
        if (start_2007 == null || goal_2007 == null || start_2007.equals(goal_2007)) {
            JOptionPane.showMessageDialog(this, "Pilih lokasi awal dan tujuan yang berbeda!");
            return;
        }

        Queue<String> queue_2007 = new LinkedList<>();
        Set<String> visited_2007 = new LinkedHashSet<>();
        Map<String, String> parent_2007 = new HashMap<>();

        queue_2007.add(start_2007);
        visited_2007.add(start_2007);
        boolean found_2007 = false;

        while (!queue_2007.isEmpty()) {
            String current_2007 = queue_2007.poll();

            if (current_2007.equals(goal_2007)) {
                found_2007 = true;
                break;
            }

            List<String> neighbors_2007 = new ArrayList<>(adjacencyList_2007.get(current_2007));
            Collections.sort(neighbors_2007); 

            for (String neighbor_2007 : neighbors_2007) {
                if (!visited_2007.contains(neighbor_2007)) {
                    visited_2007.add(neighbor_2007);
                    parent_2007.put(neighbor_2007, current_2007);
                    queue_2007.add(neighbor_2007);
                }
            }
        }

        if (found_2007) {
            List<String> path_2007 = new ArrayList<>();
            String curr_2007 = goal_2007;
            while (curr_2007 != null) {
                path_2007.add(curr_2007);
                curr_2007 = parent_2007.get(curr_2007);
            }
            Collections.reverse(path_2007);
            visitedNodes_2007 = new ArrayList<>(visited_2007);
            pathNodes_2007 = path_2007;
            displayPath_2007("BFS", path_2007, visitedNodes_2007);
        } else {
            JOptionPane.showMessageDialog(this, "Jalur tidak ditemukan!");
        }
    }

    public void DFS_2007() {
        String start_2007 = (String) comboBoxAwal_2007.getSelectedItem();
        String goal_2007 = (String) comboBoxAkhir_2007.getSelectedItem();
        
        if (start_2007 == null || goal_2007 == null || start_2007.equals(goal_2007)) {
            JOptionPane.showMessageDialog(this, "Pilih lokasi awal dan tujuan yang berbeda!");
            return;
        }

        Stack<String> stack_2007 = new Stack<>();
        Set<String> visited_2007 = new LinkedHashSet<>();
        Map<String, String> parent_2007 = new HashMap<>();

        stack_2007.push(start_2007);
        visited_2007.add(start_2007);
        boolean found_2007 = false;

        while (!stack_2007.isEmpty()) {
            String current_2007 = stack_2007.pop();

            if (current_2007.equals(goal_2007)) {
                found_2007 = true;
                break;
            }

            List<String> neighbors_2007 = new ArrayList<>(adjacencyList_2007.get(current_2007));
            Collections.sort(neighbors_2007);
            Collections.reverse(neighbors_2007); 

            for (String neighbor_2007 : neighbors_2007) {
                if (!visited_2007.contains(neighbor_2007)) {
                    visited_2007.add(neighbor_2007);
                    parent_2007.put(neighbor_2007, current_2007);
                    stack_2007.push(neighbor_2007);
                }
            }
        }

        if (found_2007) {
            List<String> path_2007 = new ArrayList<>();
            String curr_2007 = goal_2007;
            while (curr_2007 != null) {
                path_2007.add(curr_2007);
                curr_2007 = parent_2007.get(curr_2007);
            }
            Collections.reverse(path_2007);
            visitedNodes_2007 = new ArrayList<>(visited_2007);
            pathNodes_2007 = path_2007;
            displayPath_2007("DFS", path_2007, visitedNodes_2007);
        } else {
            JOptionPane.showMessageDialog(this, "Jalur tidak ditemukan!");
        }
    }

    public void displayGraph_2007() {
        panelGrafik_2007.repaint();
    }

    public void displayPath_2007(String method_2007, List<String> path_2007, List<String> visited_2007) {
        StringBuilder hasil_2007 = new StringBuilder();
        hasil_2007.append("<html><body style='width: 250px;'>");
        hasil_2007.append("<b>Metode: </b>").append(method_2007).append("<br><br>");
        hasil_2007.append("<b>Jalur Ditemukan:</b><br>");
        hasil_2007.append(String.join(" &rarr; ", path_2007)).append("<br><br>");
        hasil_2007.append("<b>Urutan Node Dikunjungi:</b><br>");
        hasil_2007.append(String.join(", ", visited_2007)).append("<br><br>");
        hasil_2007.append("<b>Jumlah Node Dikunjungi:</b> ").append(visited_2007.size());
        hasil_2007.append("</body></html>");
        
        lblJalur_2007.setText("Jalur: " + String.join(" -> ", path_2007));
        lblNodeDikunjungi_2007.setText("Node Dikunjungi: " + String.join(", ", visited_2007));
        lblJumlahNode_2007.setText("Jumlah Node Dikunjungi: " + visited_2007.size());
        
        displayGraph_2007();
    }

    public void resetGraph_2007() {
        visitedNodes_2007 = new ArrayList<>();
        pathNodes_2007 = new ArrayList<>();
        lblJalur_2007.setText("Jalur: -");
        lblNodeDikunjungi_2007.setText("Node Dikunjungi: -");
        lblJumlahNode_2007.setText("Jumlah Node Dikunjungi: 0");
        displayGraph_2007();
    }


    private static class Vertex_2007 {
        String name_2007;
        int x_2007, y_2007;
        Color color_2007 = Color.WHITE;

        Vertex_2007(String name_2007, int x_2007, int y_2007) {
            this.name_2007 = name_2007;
            this.x_2007 = x_2007;
            this.y_2007 = y_2007;
        }
    }

    private class GraphPanel_2007 extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d_2007 = (Graphics2D) g;
            g2d_2007.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d_2007.setColor(Color.GRAY);
            g2d_2007.setStroke(new BasicStroke(2));
            for (String v1_2007 : adjacencyList_2007.keySet()) {
                Vertex_2007 vertex1_2007 = vertices_2007.get(v1_2007);
                for (String v2_2007 : adjacencyList_2007.get(v1_2007)) {
                    Vertex_2007 vertex2_2007 = vertices_2007.get(v2_2007);
                    g2d_2007.drawLine(vertex1_2007.x_2007, vertex1_2007.y_2007, vertex2_2007.x_2007, vertex2_2007.y_2007);
                }
            }

            for (Vertex_2007 v_2007 : vertices_2007.values()) {
                if (pathNodes_2007 != null && pathNodes_2007.contains(v_2007.name_2007)) {
                    v_2007.color_2007 = Color.GREEN; 
                } else if (visitedNodes_2007 != null && visitedNodes_2007.contains(v_2007.name_2007)) {
                    v_2007.color_2007 = Color.YELLOW;
                } else {
                    v_2007.color_2007 = Color.WHITE; 
                }

                g2d_2007.setColor(v_2007.color_2007);
                g2d_2007.fillOval(v_2007.x_2007 - 25, v_2007.y_2007 - 25, 50, 50);
                g2d_2007.setColor(Color.BLACK);
                g2d_2007.setStroke(new BasicStroke(2));
                g2d_2007.drawOval(v_2007.x_2007 - 25, v_2007.y_2007 - 25, 50, 50);

                g2d_2007.setFont(new Font("SansSerif", Font.BOLD, 11));
                FontMetrics fm_2007 = g2d_2007.getFontMetrics();
                int textWidth_2007 = fm_2007.stringWidth(v_2007.name_2007);
                g2d_2007.drawString(v_2007.name_2007, v_2007.x_2007 - (textWidth_2007 / 2), v_2007.y_2007 + 40);
            }
        }
    }
}