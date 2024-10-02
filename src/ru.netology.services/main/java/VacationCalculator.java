public class VacationCalculator {

    // threshold - минимум накоплений для месяца отдыха 
    public int calculateForVacations(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {
            System.out.println();
            System.out.print("Месяц " + month + ". ");
            System.out.print("Денег " + money + ". ");

            if (money < threshold) {
                System.out.print("Придётся работать. ");
                System.out.print("Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;
            } else {
                int currentBalance = money - expenses;
                int vacationMoney = currentBalance - (currentBalance / 3); // траты на отдых составляют 2/3 от накоплений
                money = currentBalance - vacationMoney;
                count++; // увеличиваем счётчик месяцев отдыха
                System.out.print("Буду отдыхать. ");
                System.out.print("Потратил -" + expenses + ", затем ещё -" + vacationMoney);
            }
        }
        return count;
    }
}
