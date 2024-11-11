import java.io.PrintStream;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {

        this.groupName = groupName;
    }

    @Override
    public String learn() {
        return super.learn();
    }

    @Override
    public String walk() {
        return super.walk();
    }

    @Override
    public String eat() {
        return super.eat();
    }

    public String dance() {
        return getName() + " " + " is dancing very well!";

    }

    @Override
    public String toString() {
        return "Dancer: " + super.toString() + "  " + dance() + ",  " +
                "She is singing and dancing in a famous group " + groupName;
    }
}


