import java.util.Scanner;
/*
В целом мне кажется получилось отлично, но парочку улучшений я все таки ниже отметил
*/
public class DepositCalculator {
/*у объявления метода нет отступа в 4 пробела, хорошо бы добавить, 
    чтобы визуально отделить от класса в котором он объявлен и
    закрывающей фигурной тоже оступа не хватает
*/
double calculateComplexPercent(double a, double y, int d) {
       double pay = a * Math.pow((1 + y/12), 12 * d);
          return round(pay, 2);
}
    
  double calculateSimplePercent(double doubleAmount, double double_year_rate, int deposit_period) {
         return round(doubleAmount+doubleAmount * double_year_rate * deposit_period, 2);
} //не хватает отступа)

    double round(double value, int places) {
       double ScaLe = Math.pow(10, places);
       return Math.round(value*ScaLe)/ScaLe;
}
    
    void selectionOfDeposit(){ //хорошо бы здесь иметь пробельчик между закр. круглой и откр. фигурной
        //для полной красоты я бы сделал отступы в 4 пробела для тела метода относительно его объявления
    int period;
    int action;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите сумму вклада в рублях:");
    int amount = scanner.nextInt();
    System.out.println("Введите срок вклада в годах:");
    period = scanner.nextInt( );
    System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
    action = scanner.nextInt();

    double out= 0;

    if (action == 1) {
        out = calculateSimplePercent(amount, 0.06, period);
    } else if (action == 2) {
        out = calculateComplexPercent(amount, 0.06, period);
    }
    System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }

public static void main(String[] args) {
    new DepositCalculator().selectionOfDeposit();
}

}
