import java.util.LinkedList;
import java.awt.Graphics;

public class World {

    // Required attribute
    private LinkedList<Continent> conts;

    // Initializing constructor
    public World(LinkedList<Continent> c) {
        conts = c;
    }

    // Drawing the world map
    public void draw(Graphics g) {

        int size = conts.size();

        // Using the draw() function form Continent

        for (int i = 0; i < size; i++) {
            conts.get(i).draw(g);
        }

    }

}