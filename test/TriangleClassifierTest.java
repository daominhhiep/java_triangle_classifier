import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void classifier222() {
        String result = TriangleClassifier.classifier(2, 2, 2);
        assertEquals(TriangleClassifier.EQUILATERAL, result);
    }

    @Test
    void classifier223() {
        String result = TriangleClassifier.classifier(2, 2, 3);
        assertEquals(TriangleClassifier.ISOSCELES, result);
    }

    @Test
    void classifier345() {
        String result = TriangleClassifier.classifier(3, 4, 5);
        assertEquals(TriangleClassifier.NORMAL, result);
    }

    @Test
    void classifier823() {
        String result = TriangleClassifier.classifier(8, 2, 3);
        assertEquals(TriangleClassifier.NOPE, result);
    }

    @Test
    void classifier_121() {
        String result = TriangleClassifier.classifier(-1, 2, 1);
        assertEquals(TriangleClassifier.NOPE, result);
    }

    @Test
    void classifier011() {
        String result = TriangleClassifier.classifier(0, 1, 1);
        assertEquals(TriangleClassifier.NOPE, result);
    }
}