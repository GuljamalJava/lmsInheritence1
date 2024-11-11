public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
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

    public String playGuitar() {
        return getName() + " " + "is playing Guitar very well";

    }

    public String sing() {
        return getName() + " " + "is  singing very well!";
    }

    @Override
    public String toString() {

        return "Singer:" + super.toString() + "  " + sing() + "  " + "She is singing a Famous group in a World  " + bandName;

    }


}
