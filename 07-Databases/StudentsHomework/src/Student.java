public class Student {
    private String firstName;
    private String lastName;
    private int facNumber;

    public Student(String firstName, String lastName, int facNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.facNumber = facNumber;

    }

    public String getFirstName(){ return this.firstName;}
    public String getLastName(){ return this.lastName; }
    public int getFacNumber(){ return this.facNumber; }

}
