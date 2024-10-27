import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример данных для проверки
        List<Integer> list1 = List.of(5, 10, 15, 20);
        List<Integer> list2 = List.of(10, 15, 20, 25);

        // Создаем объекты NumberList для каждого списка
        NumberList numberList1 = new NumberList(list1);
        NumberList numberList2 = new NumberList(list2);

        // Вычисляем средние значения
        double average1 = numberList1.calculateAverage();
        double average2 = numberList2.calculateAverage();

        // Сравниваем средние значения и выводим результат
        if (average1 > average2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (average1 < average2) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }
}