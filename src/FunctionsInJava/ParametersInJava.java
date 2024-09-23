package FunctionsInJava;
public class ParametersInJava {
public static double totalMealPrice(double listedPrice, double tipRate, double taxRate) {
    double tip = tipRate * listedPrice;
    double tax = taxRate * listedPrice;
    double result = listedPrice + tip + tax;
    return  result;

    }

    public static void main(String[] args) {
       //totalMealPrice()

    }
}



