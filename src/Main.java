public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 8.1 ");
        // Задание 8.1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary / 100;
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }


        System.out.println(" Задание 8.2-1 ");
        //Задание 8.2.

        int totall = 0;
        while (totall < 10) {
            totall = totall + 1;
            System.out.print(" " + totall + " ");
        }

        System.out.println();

        System.out.println(" Задание 8.2-2 ");

        for (int n = 10; n >= 1; n--) {
            System.out.print(" " + n + " ");
        }


        System.out.println();

        System.out.println(" Задание 8.3 ");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int totalPeople1 = 0;
        for (int j = 1; j <= 10; j++) {
            int fertilityYer = population / 1000 * fertility;
            int mortalityYer = population / 1000 * mortality;
            int totalPeople = population + fertilityYer - mortalityYer;
           totalPeople1 = totalPeople1 + totalPeople;
            {System.out.println("Год " + j + ", численность населения составляет " + totalPeople1);
        }}


        System.out.println();

        System.out.println(" Задание 8.4 ");
        int salary2 = 15000;
        int total2 = 0;
        int i2 = 0;
        while (total2 < 12_000_000) {
            total2 = total2 + total2 / 100 * 7;
            total2 = total2 + salary2;
            i2 = i2 + 1;
            System.out.println("Месяц " + i2 + " сумма накоплений равна " + total2 + " рублей ");
        }

        System.out.println();

        System.out.println(" Задание 8.5 ");

        int salaryl = 15000;
        int total3 = 0;
        int il = 0;
        while (total3 < 12_000_000) {
            total3 = total3 + total3 / 100 * 7;
            total3 = total3 + salaryl;
            il = il + 1;
            if (il % 6 == 0) {
                System.out.println("Месяц " + il + " сумма накоплений равна " + total3 + " рублей ");
            }
        }

        {
            System.out.println();
        }

        {
            System.out.println(" Задание 8.6 ");
        }

        int salary6 = 15000;
        int total6 = 0;
        int year = 9;
        int months = 12;
        int monthsYear = year * months;
        int y = 0;
        while (y <= monthsYear) {
            total6 = total6 + total6 / 100 * 7;
            total6 = total6 + salary6;
            y = y + 1;
            if (y % 6 == 0) {
                System.out.println("Месяц " + y + " сумма накоплений равна " + total6 + " рублей ");
            }
        }


        System.out.println();

        System.out.println(" Задание 8.7 ");


        int firstFriday = 4;
        for (int f = 1; f < 31; f++) {
            if (f % 7 == firstFriday)
                System.out.println("Сегодня пятница, " + f + "-е число. Необходимо подготовить отчет.");
        }


        System.out.println();

        System.out.println(" Задание 8.7 ");


        int camet = 79;
        for (int cametYear = 1822; cametYear < 2122; cametYear++) {
            if (cametYear % camet == 0)
                System.out.println(cametYear);
        }

        System.out.println();

        System.out.println(" Задание 8.7 ");


        int q = 2;
        for (int g = 1; g <= 10; g++) {
            int totalg = q * g;
            System.out.println(q + " * " + g + " = " + totalg);
        }


    }
}