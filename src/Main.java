public class Main {
    public static void main(String[] args) {

  // Задача 1
    int start = 0;
    while(start < 10) {
    start++;
    System.out.print(start + " ");
    }
    System.out.println();

    for (int i = 10; i > 0; i--) {
    System.out.print(i + " ");
    }
    System.out.println();

  // Задача 2

    int friday = 5;
        for (friday = 5; friday <= 31; friday+=7) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
        }

  // Задача 3

        for ( int year = 0; year <= 2101 ;year+=79) {
            if (year >= 1822 ) {
                System.out.println("Комету видно в " + year + " году");
            }

        }
   // Задача 4
        int a = 0;
        while (a < 30) {
            a++;
        if (a % 3 ==0 && a % 5 == 0){
                System.out.println(a + ": ping pong");
            continue;}
        if (a % 3 == 0) {
        System.out.println(a + ": ping");
            continue;}
        if (a % 5 == 0){
            System.out.println(a + ": pong");
            continue;}
        if ( a % 3 !=0 || a % 5 != 0){
            System.out.println(a + ":");
        }

    }

   // Задача 5
        int a1 = 0;
        int a2 = 1;
        int amount = a1 + a2;
        System.out.print(a1  + " ");
        System.out.print(a2  + " ");
        while (amount< 35){
            System.out.print(amount + " ");
            a1 = a2;
            a2 = amount;
            amount = a1 +a2;
        }



    }
}