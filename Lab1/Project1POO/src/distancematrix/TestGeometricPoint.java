package distancematrix;

public class TestGeometricPoint {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("**********Starting Geometric Point TEST**********");

        System.out.println("\nAdding first point...");

        GeometricPoint FirstPoint = new GeometricPoint(4, 5, "Barcelona"); // Añadimos el primer punto como el punto
                                                                           // (4;5) con nombre Barcelona

        System.out.println("First point added!");

        FirstPoint.PrintPoint(); // Print del primer punto

        System.out.println("\nAdding second point...");

        GeometricPoint SecondPoint = new GeometricPoint(9, 15, "Madrid"); // Añadimos el segundo punto como el punto
                                                                          // (9;15) con nombre Madrid

        System.out.println("Second point added!");

        SecondPoint.PrintPoint(); // Print del segundo punto

        System.out.println("\nCalculating the distance between the two points...");

        double Distance = FirstPoint.Distance(SecondPoint); // Calculamos la distancia entre los dos puntos

        System.out.println("Distance calulated!");

        System.out.println("The distance between the two points is: " + Distance); // Print de la distancia

        System.out.println("\n***********END of Geometric Point TEST***********\n");

    }
}