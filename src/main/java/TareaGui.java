import javax.swing.*;

public class TareaGui {
    private JPanel mainPanel;
    private JPanel formularioPanel;
    private JTextField textField1;
    private JTextField primerNombreTextField;
    private JTextField segundoNombreTextField;
    private JTextField primerApellidoTextField;
    private JTextField segundoApellidotextField;
    private JTextField direccionTextField;
    private JTextField telefonotextField;
    private JComboBox comboBoxSexo;
    private JLabel idLabel;
    private JLabel primerNombreLabel;
    private JLabel segundoNombreLabel;
    private JLabel primerApellidoLabel;
    private JLabel segundoApellidoLabel;
    private JLabel sexoLabel;
    private JLabel direccionLabel;
    private JLabel telefonoLabel;
    private JButton guardarButton;
    private JTable table;
    private JButton eliminarButton;
    private JPanel tablePanel;
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        TareaGui myForm = new TareaGui();

        frame.setContentPane(myForm.mainPanel);

        frame.setVisible(true);
        frame.pack();
        frame.revalidate();
        frame.repaint();
    }
}
