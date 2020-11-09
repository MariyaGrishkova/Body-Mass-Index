public class BMIService {
    public static double calculate(int service, float growth) {
        float weight = 89;
        growth = (float) 1.62;
        double cube = growth * growth;
        int index = (int) (weight / cube);
     return index;
    }

}
