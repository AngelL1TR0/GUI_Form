import javax.swing.table.AbstractTableModel;
import java.util.List;


public class PersonTableModel extends AbstractTableModel {

    private enum PersonTableColumns {
        Id("Id"),
        FirstSurname("Primer Apellido"),
        SecondSurname("Segundo Apellido"),
        FirstName("Primer Nombre"),
        Secondname("Segundo Nombre"),
        Gender("Sexo"),
        Adress("Direccion"),
        NumberPhone("telefono");

        final String header;

        PersonTableColumns(String header) {
            this.header = header;
        }
    }

    private List<Person> people;

    public PersonTableModel(List<Person> people) {
        super();
        this.people = people;
    }

    public void add(Person person) {
        people.add(person);
    }

    public void delete(int selectedRow) {
        people.remove(selectedRow);
    }

    @Override
    public int getRowCount() {
        return people.size();
    }

    @Override
    public int getColumnCount() {
        return PersonTableColumns.values().length;
    }

    @Override
    public String getColumnName(int column) {
        return PersonTableColumns.values()[column].header;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person person = people.get(rowIndex);
        switch (PersonTableColumns.values()[columnIndex]) {
            case Id:
                return person.getId();
            case FirstSurname:
                return person.getFirstSurName();
            case SecondSurname:
                return person.getSecondSurname();
            case FirstName:
                return person.getFirstName();
            case Secondname:
                return person.getSecondName();
            case Gender:
                return person.getGender();
            case Adress:
                return person.getAdress();
            case NumberPhone:
                return person.getPhoneNumber();
            default:
                throw new RuntimeException("No existe la columna " + columnIndex);
        }
    }
}

