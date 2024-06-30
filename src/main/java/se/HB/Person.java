package se.HB;

public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        this.id = id();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getSummary(){
        String result;
        return result = ("Id " + id + " First name: " + firstName +" Lastname: " + lastName + " Email: " + email);
    }

    public void setFirstName(String firstName) {
        validateStringParams(firstName,"Firstname");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        validateStringParams(lastName,"Lastname");
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        validateStringParams(email, "Email");
        this.email = email;
    }

    private void validateStringParams(String inputParam, String paramName) {
        if (inputParam == null || inputParam.trim().isEmpty()) {
            throw new IllegalArgumentException(paramName + " cannot be null or empty.");
        }
    }
    private static int id(){
        sequencer = sequencer + 1;
        return sequencer;
    }
}