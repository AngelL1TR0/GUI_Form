import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {

private String Id;
private String firstSurName;
private String secondSurname;
private String firstName;
private String secondName;
private String gender;
private String adress;
private long phoneNumber;
}
