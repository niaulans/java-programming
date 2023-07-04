package chapter9;

public class Employee extends Person{

    private String empolyeeId;
    private String title;

    public Employee() {
        super("angie");
        System.out.println("In employee default constructor");
    }

    public String getEmpolyeeId() {
        return empolyeeId;
    }

    public void setEmpolyeeId(String empolyeeId) {
        this.empolyeeId = empolyeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
