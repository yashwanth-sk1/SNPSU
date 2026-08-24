package DAY4;

public class ElectricityTotal {
    public static void main(String[] args) {
        
        int[] dailyConsumption = {10, 15, 12, 20, 18, 14, 16};
        int totalUnits = 0;
        
        for (int units : dailyConsumption) {
            totalUnits += units;
        }
        
        System.out.println("Total Consumption: " + totalUnits + " units");
    }
}
