package distancematrix;

public class TestDistanceMatrix {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("**********Starting Distance Matrix TEST**********");

        System.out.println("\nCreating new Distance Matrix...");
        DistanceMatrix MyMatrix = new DistanceMatrix(); // Creamos una nueva matriz de distancias
        System.out.println("Distance Matrix created!");

        System.out.println("\nAdding first city...");
        double X1 = 1; // Creamos la primera ciudad (1;2) llamada Barcelona
        double Y1 = 2;
        String Name1 = "Barcelona";
        MyMatrix.addCity(X1, Y1, Name1);
        System.out.println("City " + MyMatrix.getCityName(0) + " added!");

        System.out.println("\nAdding second city...");
        double X2 = 5; // Creamos la segunda ciudad (5;8) llamada Madrid
        double Y2 = 8;
        String Name2 = "Madrid";
        MyMatrix.addCity(X2, Y2, Name2);
        System.out.println("City " + MyMatrix.getCityName(1) + " added!");

        System.out.println("\nAdding third city...");
        double X3 = 15; // Creamos la tercera ciudad (15;29) llamada Valencia
        double Y3 = 29;
        String Name3 = "Valencia";
        MyMatrix.addCity(X3, Y3, Name3);
        System.out.println("City " + MyMatrix.getCityName(2) + " added!");

        System.out.println("\nCalculating number of cities...");
        double NumOfCities = MyMatrix.getNoOfCities(); // Obtenemos el numero de ciudades
        System.out.println("Number of cities calculated!!");
        System.out.println("Number of cities: " + NumOfCities);

        System.out.println("\nCalculating distances between cities...");
        MyMatrix.createDistanceMatrix(); // Calculamos la distancia entre las ciudades
        System.out.println("Distances calculated!!\n");

        for (int i = 0; i < MyMatrix.getNoOfCities(); i++) {
            for (int j = 0; j < MyMatrix.getNoOfCities(); j++) {

                double distance = MyMatrix.getDistance(i, j); // Obtenemos la distancia entre las ciudades deseadas
                System.out.println("The distance between " + MyMatrix.getCityName(i) + " and " + MyMatrix.getCityName(j)
                        + " is: " + distance + "\n");

            }

        }

        System.out.println("\n**********END of Distance Matrix TEST**********\n");

    }
}