package distancematrix;

import java.util.LinkedList;

//import distancematrix.Matrix;

public class DistanceMatrix implements Matrix {

    private LinkedList<GeometricPoint> cities; // Creacion de una lista linkeada del tipo GeometricPoint
    private double matrix[][]; // Creacion de una matriz

    public DistanceMatrix() { // Creamos un constructor y inicializamos los atributos
        cities = new LinkedList<>();

        int maxFiles = 20; // Ponemos un maximo de filas y columnas para la matriz
        int maxColumns = 20;
        matrix = new double[maxFiles][maxColumns];

    }

    public void addCity(double x, double y, String name) {

        GeometricPoint PointToAdd = new GeometricPoint(x, y, name); // Inicializamos el geometric point
        cities.add(PointToAdd); // Añadimos el punto

    }

    public String getCityName(int index) {
        GeometricPoint PointForName = cities.get(index); // Accedemos con el indice en la ciudad deseada
        return PointForName.getName(); // Obtenemos el nombre
    }

    public int getNoOfCities() {
        return cities.size(); // Devolvemos el tamaño de la lista
    }

    public void createDistanceMatrix() {

        int j = getNoOfCities();
        GeometricPoint city1;
        GeometricPoint city2;

        for (int i = 0; i <= j - 1; i++) { // Rellenamos la matriz con el calculo de la distancia

            for (int x = 0; x <= j - 1; x++) {

                city1 = cities.get(i);
                city2 = cities.get(x);
                matrix[i][x] = city1.Distance(city2);
            }
        }
    }

    public double getDistance(int index1, int index2) {
        return matrix[index1][index2]; // Obtenemos la distancia entre dos puntos
    }

}