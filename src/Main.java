import static org.assertj.core.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Проверка корректного вычисления скидки
            double purchaseAmount = 1000.0;
            int discountAmount = 10;
            double expectedAmount = 900.0;
            assertThat(Calculator.calculateDiscount(purchaseAmount, discountAmount))
                    .isEqualTo(expectedAmount);
            System.out.println("Test 1 passed: Correct discount calculation.");

            // Проверка выброса исключения при отрицательной сумме покупки
            try {
                Calculator.calculateDiscount(-100, 10);
            } catch (ArithmeticException e) {
                assertThat(e).hasMessage("Invalid purchase amount or discount percentage");
                System.out.println("Test 2 passed: Exception for negative purchase amount.");
            }

            // Проверка выброса исключения при проценте скидки более 100
            try {
                Calculator.calculateDiscount(100, 150);
            } catch (ArithmeticException e) {
                assertThat(e).hasMessage("Invalid purchase amount or discount percentage");
                System.out.println("Test 3 passed: Exception for discount greater than 100.");
            }

            // Проверка выброса исключения при отрицательной скидке
            try {
                Calculator.calculateDiscount(100, -5);
            } catch (ArithmeticException e) {
                assertThat(e).hasMessage("Invalid purchase amount or discount percentage");
                System.out.println("Test 4 passed: Exception for negative discount.");
            }

        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    }
