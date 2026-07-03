import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormMahasiswa extends JFrame {

    JTextField txtNim, txtNama, txtProdi;
    JTextArea txtOutput;
    JButton btnTampilkan, btnReset;

    public FormMahasiswa() {

        setTitle("Data Mahasiswa");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        panel.add(new JLabel("NIM"));
        txtNim = new JTextField();
        panel.add(txtNim);

        panel.add(new JLabel("Nama"));
        txtNama = new JTextField();
        panel.add(txtNama);

        panel.add(new JLabel("Program Studi"));
        txtProdi = new JTextField();
        panel.add(txtProdi);

        btnTampilkan = new JButton("Tampilkan");
        btnReset = new JButton("Reset");

        panel.add(btnTampilkan);
        panel.add(btnReset);

        txtOutput = new JTextArea();
        txtOutput.setEditable(false);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(txtOutput), BorderLayout.CENTER);

        btnTampilkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOutput.setText(
                        "=========== DATA MAHASISWA ===========\n\n" +
                                "NIM : " + txtNim.getText() +
                                "\nNama : " + txtNama.getText() +
                                "\nProgram Studi : " + txtProdi.getText());
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNim.setText("");
                txtNama.setText("");
                txtProdi.setText("");
                txtOutput.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FormMahasiswa().setVisible(true);
        });
    }
}