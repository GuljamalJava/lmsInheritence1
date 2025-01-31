public class Person {
    private String name;
    private String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String learn() {
        return getName() + " is " + "learning";

    }

    public String walk() {
        return "walking";

    }

    public String eat() {
        return "eating";
    }

    @Override
    public String toString() {
        return getName() + " is " + getDesignation() + "  " + learn() + ", " + walk() + ", " + eat() + ".";
    }
}













