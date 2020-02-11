package Noodle;

public class Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public boolean isTasty() {

        return true;

    }

    public static void main(String[] args) {

        Ramen yasaiRamen = new Ramen();
        //System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty());

    }

}