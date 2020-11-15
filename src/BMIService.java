public class BMIService {
    public static double calculate(int weight, float growth) {
        growth = (float) 1.75;
        double cube = growth * growth;
        weight = (int) 99;
        int index = (int) (weight / cube);
        return index;
    }

}
