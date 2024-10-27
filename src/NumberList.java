import java.util.List;

class NumberList {
    private List<Integer> numbers;

    public NumberList(List<Integer> numbers) {
        this.numbers = numbers;
    }

    // Метод для вычисления среднего значения списка
    public double calculateAverage() {
        if (numbers.isEmpty()) {
            return 0; // Возвращаем 0 для пустого списка
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
