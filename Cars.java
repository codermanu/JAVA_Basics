public class Cars {
    int modelYear;
    String modelName;

    public Cars(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Cars myCar = new Cars(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }

}