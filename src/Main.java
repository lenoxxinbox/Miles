public class Main {
    public static void main(String[] args) {

        int ticketPrice = 1_056; // Стоимость билета
        int rublesPerMile = 20; // Количество рублей за 1 милю

        int bonus = ticketPrice / rublesPerMile; // Расчет бонусных миль
        System.out.println("Количество бонусных миль за билет: " + bonus); // Вывод результата в консоль
    }
}
