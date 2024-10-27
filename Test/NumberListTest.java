import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.List;

class NumberListTest {

    @Test
    void testCalculateAverageForNonEmptyList() {
        NumberList numberList = new NumberList(List.of(10, 20, 30, 40));
        double expectedAverage = 25.0;
        assertEquals(expectedAverage, numberList.calculateAverage(), "Среднее значение должно быть 25.0");
    }

    @Test
    void testCalculateAverageForEmptyList() {
        NumberList numberList = new NumberList(List.of());
        double expectedAverage = 0.0;
        assertEquals(expectedAverage, numberList.calculateAverage(), "Среднее значение пустого списка должно быть 0.0");
    }

    @Test
    void testCalculateAverageForSingleElementList() {
        NumberList numberList = new NumberList(List.of(100));
        double expectedAverage = 100.0;
        assertEquals(expectedAverage, numberList.calculateAverage(), "Среднее значение списка из одного элемента должно быть равно самому элементу");
    }

    @Test
    void testCompareAverages_FirstListHigher() {
        NumberList numberList1 = new NumberList(List.of(20, 30, 40));
        NumberList numberList2 = new NumberList(List.of(10, 15, 20));
        double average1 = numberList1.calculateAverage();
        double average2 = numberList2.calculateAverage();

        assertEquals(true, average1 > average2, "Среднее значение первого списка должно быть больше среднего значения второго списка");
    }

    @Test
    void testCompareAverages_SecondListHigher() {
        NumberList numberList1 = new NumberList(List.of(10, 15, 20));
        NumberList numberList2 = new NumberList(List.of(30, 40, 50));
        double average1 = numberList1.calculateAverage();
        double average2 = numberList2.calculateAverage();

        assertEquals(true, average2 > average1, "Среднее значение второго списка должно быть больше среднего значения первого списка");
    }

    @Test
    void testCompareAverages_EqualAverages() {
        NumberList numberList1 = new NumberList(List.of(10, 20, 30));
        NumberList numberList2 = new NumberList(List.of(15, 20, 25));
        double average1 = numberList1.calculateAverage();
        double average2 = numberList2.calculateAverage();

        assertEquals(true, average1 == average2, "Средние значения должны быть равны");
    }
}
