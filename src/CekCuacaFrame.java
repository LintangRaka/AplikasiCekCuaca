
import java.awt.Image;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Acer
 */
public class CekCuacaFrame extends javax.swing.JFrame {

    private static final String API_KEY = "e57367f6bf9f06154278b83d65a4a557"; // masukkan API key di sini

    /**
     * Creates new form CekCuacaFrame
     */
    public CekCuacaFrame() {
        initComponents();

        // Menginisialisasi model ComboBox supaya lebih fleksibel
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        cbbKotaFavorit.setModel(comboBoxModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtKota = new javax.swing.JTextField();
        lblIconCuaca = new javax.swing.JLabel();
        lblNamaCuaca = new javax.swing.JLabel();
        lblKeteranganCuaca = new javax.swing.JLabel();
        lblSuhuCuaca = new javax.swing.JLabel();
        btnCekCuaca = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbbKotaFavorit = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuaca = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nama kota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel1, gridBagConstraints);

        txtKota.setPreferredSize(new java.awt.Dimension(120, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(txtKota, gridBagConstraints);

        lblIconCuaca.setPreferredSize(new java.awt.Dimension(60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(lblIconCuaca, gridBagConstraints);

        lblNamaCuaca.setText("Nama cuaca...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        jPanel1.add(lblNamaCuaca, gridBagConstraints);

        lblKeteranganCuaca.setText("Keterangan cuaca...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        jPanel1.add(lblKeteranganCuaca, gridBagConstraints);

        lblSuhuCuaca.setText("Suhu...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 8, 6);
        jPanel1.add(lblSuhuCuaca, gridBagConstraints);

        btnCekCuaca.setText("Cek cuaca");
        btnCekCuaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekCuacaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(btnCekCuaca, gridBagConstraints);

        jLabel2.setText("Kota Favorit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel2, gridBagConstraints);

        cbbKotaFavorit.setPreferredSize(new java.awt.Dimension(120, 24));
        cbbKotaFavorit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbKotaFavoritItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(cbbKotaFavorit, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        tblCuaca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kota", "Cuaca", "Suhu", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCuaca);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(btnSimpan);

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        jPanel3.add(btnLoad);

        jPanel2.add(jPanel3, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekCuacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekCuacaActionPerformed
        String kota = txtKota.getText().trim();
        if (kota.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama kota kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String response = fetchWeatherData(kota); // Request data cuaca
        if (response != null) {
            parseAndDisplayWeatherData(response); // Parse dan tampilkan data ke UI

            // Mengambil data kota yang sudah ada di ComboBox
            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbbKotaFavorit.getModel();
            // Cek jika kota sudah ada di ComboBox, jika belum, tambahkan
            if (model.getIndexOf(kota) == -1) { // Kota belum ada di ComboBox
                model.addElement(kota); // Menambahkan kota ke ComboBox
                model.setSelectedItem(null); // reset Combobox yang dipilih
            }

            // Ambil data cuaca yang sudah ditampilkan
            String namaCuaca = lblNamaCuaca.getText().replace("Nama: ", "");
            String keteranganCuaca = lblKeteranganCuaca.getText().replace("Ket. ", "");
            String suhu = lblSuhuCuaca.getText().replace("Suhu: ", "");

            // Tambahkan data ke tabel
            addRowToTable(kota, namaCuaca, suhu, keteranganCuaca);
        } else {
            clearWeatherLabels(); // Bersihkan label output saat error
        }
    }//GEN-LAST:event_btnCekCuacaActionPerformed

    private void cbbKotaFavoritItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbKotaFavoritItemStateChanged
        if (cbbKotaFavorit.getSelectedIndex() != -1)
            txtKota.setText((String) cbbKotaFavorit.getSelectedItem()); // Sinkronkan input nama kota yang dipilih
    }//GEN-LAST:event_cbbKotaFavoritItemStateChanged

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih Lokasi dan Nama File untuk Menyimpan");

        // Set filter untuk hanya menampilkan file CSV
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("CSV Files", "csv"));

        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            // Pastikan file berformat .csv
            if (!file.getName().endsWith(".csv")) {
                file = new File(file.getAbsolutePath() + ".csv");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                // Tulis header tabel
                writer.write("Kota,Cuaca,Suhu,Keterangan");
                writer.newLine();

                // Ambil model tabel
                DefaultTableModel model = (DefaultTableModel) tblCuaca.getModel();

                // Tulis setiap baris data ke dalam file CSV
                for (int i = 0; i < model.getRowCount(); i++) {
                    String kota = (String) model.getValueAt(i, 0);
                    String cuaca = (String) model.getValueAt(i, 1);
                    String suhu = (String) model.getValueAt(i, 2);
                    String keterangan = (String) model.getValueAt(i, 3);

                    // Tulis data baris ke file
                    writer.write(kota + "," + cuaca + "," + suhu + "," + keterangan);
                    writer.newLine();
                }

                JOptionPane.showMessageDialog(this, "Data berhasil disimpan di: " + file.getAbsolutePath(), "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saat menyimpan file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih File CSV untuk Dimuat");

        // Set filter untuk hanya menampilkan file CSV
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("CSV Files", "csv"));

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                DefaultTableModel model = (DefaultTableModel) tblCuaca.getModel();
                model.setRowCount(0); // Menghapus semua baris sebelum memuat data baru

                // Lewati header
                reader.readLine();

                // Baca setiap baris dalam file CSV
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");

                    // Tambahkan data ke tabel
                    model.addRow(new Object[]{data[0], data[1], data[2], data[3]});
                }

                JOptionPane.showMessageDialog(this, "Data berhasil dimuat dari: " + file.getAbsolutePath(), "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saat memuat file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CekCuacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekCuacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekCuacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekCuacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekCuacaFrame().setVisible(true);
            }
        });
    }

    private void addRowToTable(String kota, String cuaca, String suhu, String keterangan) {
        // Ambil model tabel
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblCuaca.getModel();

        // Tambahkan data baru ke tabel
        model.addRow(new Object[]{kota, cuaca, suhu, keterangan});
    }

    private String fetchWeatherData(String kota) {
        try {
            String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + kota + "&appid=" + API_KEY + "&units=metric";
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                in.close();
                return response.toString();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengambil data cuaca. Cek kota atau koneksi nyan~", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null; // Balik null kalau error
    }

    private void parseAndDisplayWeatherData(String response) {
        try {
            JSONObject jsonResponse = new JSONObject(response);
            JSONObject main = jsonResponse.getJSONObject("main");
            JSONObject weather = jsonResponse.getJSONArray("weather").getJSONObject(0);

            String namaCuaca = weather.getString("main");
            String keteranganCuaca = weather.getString("description");
            double suhu = main.getDouble("temp");
            String iconCode = weather.getString("icon");

            // Update UI pakai data yang diambil
            lblNamaCuaca.setText("Nama: " + namaCuaca);
            lblKeteranganCuaca.setText("Ket. " + keteranganCuaca);
            lblSuhuCuaca.setText("Suhu: " + suhu + "°C");

            loadWeatherIcon(iconCode); // Method buat load icon cuaca
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error parsing data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            clearWeatherLabels(); // Bersihkan label output saat error
        }
    }

    private void loadWeatherIcon(String iconCode) {
        try {
            String iconUrl = "http://openweathermap.org/img/wn/" + iconCode + "@2x.png";
            ImageIcon icon = new ImageIcon(new URL(iconUrl));

            // Resize icon sesuai ukuran lblIconCuaca
            Image image = icon.getImage().getScaledInstance(lblIconCuaca.getWidth(), lblIconCuaca.getHeight(), Image.SCALE_SMOOTH);

            lblIconCuaca.setIcon(new ImageIcon(image));
        } catch (Exception ex) {
            // Do nothing here, so icon label stays empty on error
        }
    }

    private void clearWeatherLabels() {
        lblNamaCuaca.setText("");
        lblKeteranganCuaca.setText("");
        lblSuhuCuaca.setText("");
        lblIconCuaca.setIcon(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCekCuaca;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbbKotaFavorit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIconCuaca;
    private javax.swing.JLabel lblKeteranganCuaca;
    private javax.swing.JLabel lblNamaCuaca;
    private javax.swing.JLabel lblSuhuCuaca;
    private javax.swing.JTable tblCuaca;
    private javax.swing.JTextField txtKota;
    // End of variables declaration//GEN-END:variables
}
