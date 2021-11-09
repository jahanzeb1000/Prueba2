import java.util.LinkedList;
import java.awt.Graphics;

public class Continent {

    // Required attribute
    private LinkedList<PolygonalRegion> countries;

    // Initializing constructor
    public Continent(LinkedList<PolygonalRegion> c) {
        countries = c;
    }

    // Getting the area of a Continent
    public double getTotalArea() {

        int size = countries.size();
        double area = 0;

        // Using the getArea() implemented in the PolygonalRegion

        for (int i = 0; i < size; i++) {

            area += countries.get(i).getArea();
        }

        return area;
    }

    public void draw(Graphics g) {

        // Drawing the whole continent

        int size = countries.size();

        for (int i = 0; i < size; i++) {

            // Using the draw() function form PolygonalRegion
            countries.get(i).draw(g);
        }

    }
}