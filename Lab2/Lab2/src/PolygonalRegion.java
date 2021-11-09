import java.util.LinkedList;

public class PolygonalRegion {

    // Required attribute

    private LinkedList<GeometricPoint> points;

    // Initializing constructor
    public PolygonalRegion(LinkedList<GeometricPoint> l) {
        points = l;
    }

    // Getting the area of a polygon
    public double getArea() {

        double area = 0;
        int sizeList = points.size();
        int Last = sizeList - 1;
        int Size = sizeList;

        for (int i = 0; i < Size; i++) {

            // Applying the formula

            area += (points.get(Last).getX() + points.get(i).getX()) * (points.get(Last).getY() - points.get(i).getY());

            Last = i;

        }

        // Converting negative values to positive with Math.abs
        area = Math.abs(area / 2);

        return area;

    }

    public void draw(java.awt.Graphics g) {

        int j = points.size() - 1;

        for (int i = 0; i < points.size(); i++) {

            // Drawing the lines to print the polygon in the window

            g.drawLine(points.get(i).getX(), points.get(i).getY(), points.get(j).getX(), points.get(j).getY());

            // Using j = i to close the polygon
            j = i;

        }

    }
}