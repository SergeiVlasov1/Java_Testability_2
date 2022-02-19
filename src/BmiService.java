public class BmiService {
    public float calculate(float weight, float height) {
        return (float) (weight / Math.pow(height, 2));
    }

}