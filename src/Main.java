import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите имеющиеся деньги: ");
        int money = scanner.nextInt();

        System.out.print("Введите цену за шоколадку: ");
        int price = scanner.nextInt();

        System.out.print("Введите количество обёрток, нужное чтобы получить шоколадку: ");
        int wrap = scanner.nextInt();

        // Вычисление максимального количества шоколадок
        int totalChocolateBars = calculateMaxChocolates(money, price, wrap);

        // Вывод результата
        System.out.println("Максимум шоколадок, который вы можете получить: " + totalChocolateBars);

    }

    private static int calculateMaxChocolates(int money, int price, int wrap) {
        // Покупаем шоколадки на имеющиеся деньги
        int chocolates = money / price;
        int wrappers = chocolates;

        // Обмениваем обертки на новые шоколадки
        while (wrappers >= wrap) {
            int newChocolates = wrappers / wrap;
            chocolates += newChocolates;
            wrappers = wrappers % wrap + newChocolates; // остаются обертки от новых шоколадок
        }

        return chocolates;
    }
}
