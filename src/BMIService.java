public class BMIService {
    public static double calculate(int weight, float growth) {
       double index = weight / (growth*growth);
        return index;
    }

}
