public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        int monthSavings = 15000;
        int target = 2459000;
        int totalSavings = 0;
        int monthNum = 0;

        while (totalSavings < target) {
            totalSavings += monthSavings;
            monthNum += 1;
            System.out.println("Месяц " + monthNum + ". Сумма накоплений равна " + totalSavings);
        }

        System.out.println("Task2");
        int i = 0;
        while (i < 10) {
            i += 1;
            System.out.print(i + " ");
        }

        System.out.println();

        while (i >= 1) {
            System.out.print(i + " ");
            i -= 1;
        }
        System.out.println();

        System.out.println("Task3");

        long population = 12_000_000L;
        float birthrate = 17/1000f;
        float mortality = 8/1000f;

        for (int j = 1; j <= 10; j++) {
            population = (long) (population + population * (birthrate - mortality));
            System.out.println("Год  " + j + ". Численность населения составляет " + population);
        }

        System.out.println("Task4");

        int monthAmount = 15000;
        double percent = 1.07;

        int targetAmount = 12_000_000;

        int savings = 0;

        int monthMum =0;

        while (savings < targetAmount) {
            savings += monthAmount;
            savings *= percent;
            monthNum +=1;
            System.out.println("Сумма накоплений в месяц № " + monthNum + " равна " + savings);
        }

        System.out.println("Task5");

        monthAmount = 15000;
        percent = 1 + 0.07;
        targetAmount = 12_000_000;
        savings = 0;
        monthMum =0;

        while (savings < targetAmount) {
            savings += monthAmount;
            savings *= percent;
            monthNum +=1;
            if (monthMum % 6 == 0) {
                System.out.println("Сумма накоплений в месяц № " + monthNum + " равна " + savings);
            }

        }

        System.out.println("Task6");

        monthAmount = 15000;
        percent = 1 + 0.07;
        targetAmount = 12_000_000;
        savings = 0;

        for (int k =1; k <= 9*12; k++) {
            savings += monthAmount;
            savings *= percent;
            if (k % 6 == 0) {
                System.out.println("Сумма накоплений в месяц № " + k + " равна " + savings);
            }
        }

        System.out.println("Task7");
        int fridayDate = 3;

        for (int z =0; z <=31; z++) {
            if (z % 7 == 0) {
                System.out.println("Сегодня пятница " + (z+fridayDate) + " число. Нужно подготовить еженедельный отчет");
            }
        }

        System.out.println("Task8");
        int comet = 79;
        int currentYear = 2023;
        int beforeYear = currentYear - 200;
        int afterYear = currentYear + 100;

        for (int y = beforeYear; y <= afterYear; y++) {
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }
    }
}