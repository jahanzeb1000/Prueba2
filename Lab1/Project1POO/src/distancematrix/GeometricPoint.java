package distancematrix;

public class GeometricPoint {

    private double PointX; // Atributos privados necesarios
    private double PointY;
    private String Name;

    public GeometricPoint(double X, double Y, String name) { // Constructor de la clase
        PointX = X;
        PointY = Y;
        Name = name;
    }

    // Getters Necesarios

    public double getX() {
        return PointX;
    };

    public double getY() {
        return PointY;
    }

    public String getName() {
        return Name;
    }

    // Setters necesarios

    public void setX(double X) {
        PointX = X;
    }

    public void setY(double Y) {
        PointY = Y;
    }

    public void setName(String name) {
        Name = name;
    }

    public double Distance(GeometricPoint p) { // Calculo de la distancia entre dos puntos

        double a = p.PointX - getX(); // Restamos los dos puntos
        double b = p.PointY - getY();

        a = Math.pow(a, 2); // Elevacion al quadrado de las dos variables
        b = Math.pow(b, 2);

        a = a + b; // Suma de las dos variables

        a = Math.sqrt(a); // Aplicamos la raiz

        return a;

    }

    public void PrintPoint() {

        System.out.println(getName() + ": (" + getX() + " ; " + getY() + ")\n"); // Imprimimos el punto deseado
    }

}