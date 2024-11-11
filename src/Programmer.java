public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String eat() {
        return super.eat();
    }

    @Override
    public String learn() {
        return super.learn();
    }

    @Override
    public String walk() {
        return super.walk();
    }

    public String coding() {
        return getName() + " " + " is coding well too!";
    }

    @Override
    public String toString() {
        return "Programmer:" + super.toString() + "  " + coding() + "  " +
                "He works at a Famous Company " + companyName + '!';
    }
}
