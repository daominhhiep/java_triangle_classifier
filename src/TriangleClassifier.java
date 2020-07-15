public class TriangleClassifier {
    public static final String EQUILATERAL = "Tam giác đều";
    public static final String ISOSCELES = "Tam giác cân";
    public static final String NORMAL = "Tam giác thường";
    public static final String NOPE = "Không phải là tam giác";

    public static String classifier(int side1, int side2, int side3) {
        if (side1 == 0 || side2 == 0 || side3 == 0) {
            return NOPE;
        }
        if (side1 == side2 && side2 == side3) {
            return EQUILATERAL;
        }
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            return NOPE;
        }
        if (side1 == side2 || side2 == side3 || side1 == side3) {
            return ISOSCELES;
        }
        return NORMAL;
    }
}
