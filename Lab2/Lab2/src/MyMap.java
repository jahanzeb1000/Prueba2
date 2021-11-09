import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {

    // Required attribute

    private PolygonalRegion spain, france, germany, italy;
    private Continent continent1, continent2;
    private World world1;

    public MyMap() {
        initComponents();

        // Initializing points
        LinkedList<GeometricPoint> points = new LinkedList<GeometricPoint>();
        LinkedList<GeometricPoint> points2 = new LinkedList<GeometricPoint>();
        LinkedList<GeometricPoint> points3 = new LinkedList<GeometricPoint>();
        LinkedList<GeometricPoint> points4 = new LinkedList<GeometricPoint>();

        // Creating all points for the first PolygonalRegion
        points.add(new GeometricPoint(420, 600, "Point1"));
        points.add(new GeometricPoint(420, 550, "Point2"));
        points.add(new GeometricPoint(480, 550, "Point3"));
        points.add(new GeometricPoint(480, 600, "Point4"));
        points.add(new GeometricPoint(435, 650, "Point5"));
        spain = new PolygonalRegion(points);

        // Creating all points for the second PolygonalRegion
        points2.add(new GeometricPoint(460, 550, "Point6"));
        points2.add(new GeometricPoint(455, 500, "Point7"));
        points2.add(new GeometricPoint(420, 450, "Point8"));
        points2.add(new GeometricPoint(420, 430, "Point9"));
        points2.add(new GeometricPoint(485, 350, "Point10"));
        points2.add(new GeometricPoint(540, 380, "Point11"));
        points2.add(new GeometricPoint(560, 500, "Point12"));
        points2.add(new GeometricPoint(480, 550, "Point13"));
        france = new PolygonalRegion(points2);

        // Creating all points for the third PolygonalRegion
        points3.add(new GeometricPoint(520, 370, "Point14"));
        points3.add(new GeometricPoint(530, 300, "Point15"));
        points3.add(new GeometricPoint(610, 270, "Point16"));
        points3.add(new GeometricPoint(620, 360, "Point17"));
        points3.add(new GeometricPoint(590, 380, "Point18"));
        points3.add(new GeometricPoint(610, 420, "Point19"));
        points3.add(new GeometricPoint(550, 430, "Point20"));
        points3.add(new GeometricPoint(540, 380, "Point21"));
        germany = new PolygonalRegion(points3);

        // Creating all points for the fourth PolygonalRegion
        points4.add(new GeometricPoint(560, 500, "Point22"));
        points4.add(new GeometricPoint(590, 480, "Point23"));
        points4.add(new GeometricPoint(670, 580, "Point24"));
        points4.add(new GeometricPoint(650, 600, "Point25"));
        points4.add(new GeometricPoint(660, 610, "Point26"));
        points4.add(new GeometricPoint(690, 585, "Point27"));
        points4.add(new GeometricPoint(675, 560, "Point28"));
        points4.add(new GeometricPoint(690, 550, "Point29"));
        points4.add(new GeometricPoint(700, 565, "Point30"));
        points4.add(new GeometricPoint(710, 565, "Point31"));
        points4.add(new GeometricPoint(620, 470, "Point32"));
        points4.add(new GeometricPoint(650, 450, "Point33"));
        points4.add(new GeometricPoint(650, 420, "Point34"));
        points4.add(new GeometricPoint(550, 440, "Point35"));
        italy = new PolygonalRegion(points4);

        // Print of all PolygonalRegion areas
        System.out.println("Spain: " + spain.getArea());
        System.out.println("France: " + france.getArea());
        System.out.println("Germany: " + germany.getArea());
        System.out.println("Italy: " + italy.getArea());

        // Creating two continents
        LinkedList<PolygonalRegion> Continent1 = new LinkedList<PolygonalRegion>();
        LinkedList<PolygonalRegion> Continent2 = new LinkedList<PolygonalRegion>();

        // Adding PolygonalRegions in the first continent
        Continent1.add(spain);
        Continent1.add(france);

        // Adding PolygonalRegions in the second continent
        Continent2.add(germany);
        Continent2.add(italy);

        continent1 = new Continent(Continent1);
        continent2 = new Continent(Continent2);

        System.out.println("\nContinent 1: " + continent1.getTotalArea());
        System.out.println("Continent 2: " + continent2.getTotalArea());

        // Creating a world
        LinkedList<Continent> world = new LinkedList<Continent>();

        // Adding the continents in the world
        world.add(continent1);
        world.add(continent2);

        world1 = new World(world);

    }

    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1000, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1000, Short.MAX_VALUE));
    }

    public void paint(java.awt.Graphics g) {
        super.paint(g);

        // Printing the whole map
        world1.draw(g);
    }

}
