import javax.swing.*;
import java.util.ArrayList;

public class TareaGui {
    private JPanel mainPanel;
    private JPanel formularioPanel;
    private JTextField idField;
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


    public TareaGui() {
        PersonTableModel personTableModel = new PersonTableModel(new ArrayList<>());
        table.setModel(personTableModel);


        guardarButton.addActionListener(actionEvent -> {

            String id = idField.getText();
            String firstSurname = primerApellidoTextField.getText();
            String secondSurname = segundoApellidotextField.getText();
            String firstName = primerNombreTextField.getText();
            String secondName = segundoNombreTextField.getText();
            String gender = (String)comboBoxSexo.getSelectedItem() ;
            String adress = direccionTextField.getText();
            long phoneNumber = Long.parseLong(telefonotextField.getText());

            Person person = new Person(id, firstSurname, secondSurname, firstName, secondName, gender, adress, phoneNumber);
            personTableModel.add(person);
            personTableModel.fireTableDataChanged();

        });
        eliminarButton.addActionListener(actionEvent -> {
            int select = table.getSelectedRow();
            if (select != -1){
                personTableModel.delete(select);
                personTableModel.fireTableDataChanged();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tarea GUI");
        TareaGui myForm = new TareaGui();

        frame.setContentPane(myForm.mainPanel);

        frame.setVisible(true);
        frame.pack();
        frame.revalidate();
        frame.repaint();
    }
}
