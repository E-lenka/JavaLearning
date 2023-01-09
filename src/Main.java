import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initialization of variables
        /*
        {
            System.out.println("Введи мне два числа, чтобы их сложить");
            System.out.println("_____________________________________");

            double a = 0, b = 0;
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            System.out.print("Введите сюда первое число ");
            a = in.nextDouble();
            System.out.print("Введите сюда второе число ");
            b = in.nextDouble();
            System.out.println("Сумма ваших чисел равна:" + (a + b));
        }
        */
        // Types
/*        { // int g = ((a + b)/c);

            //int x = 1000 * 1000;
            //System.out.println(x * x); // int размер 32 бита (должен быть не более 2^31), поэтому выдаст неверное значение

            long x = 1000 * 1000;
            //System.out.println(x * x); // long размер 64 бита
            System.out.println((int) (x * x));
            System.out.println(x);
        }*/
        //Operations
/*        {
            System.out.println((5) / 3); //результат 1, т.к делим в целочисленных значениях
            System.out.println((double) (5) / 3); // делим правильно, т.к. преобразовали в нужный тип данных
            Scanner in = new Scanner(System.in);
            double value = in.nextDouble();
            //проверка делится ли число на 2 без остатка
            if (value % 2 == 0) {
                System.out.println("Вы ыыели четное число");
            } else System.out.println("Вы ыыели нечетное число");
        }*/

//Сокращенные операции
/*        {
            int minutes = 10;
            // minutes = minutes +1; // 11
            //minutes++; // 11

            // System.out.println(minutes++); //выдаст 10, т.к. сначала использвали значение и только потом прибавили 1
            // System.out.println(++minutes); //выдаст 11, т.к. сначала прибавили 1, а потом использвали значение
            minutes += 2; //прибавить 2 к minutes
            System.out.println(minutes);
            minutes -= 2; //вычесть 2 из minutes
            //можно также умножать, делить
            System.out.println(minutes);
        }*/
        //Примитивные типы - стандартные типы, такие же как и в других языках программирования

        //char explanation
/*        {
            char a = 8667;  //числовое обозначение символа
            char b = '\u21DB'; //символ в unicode
            char c = '⇛'; // символ, как он отображается
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println((int) c); //преобразование char в int
        }*/
// логические операции
/*// ||, &&, ==, !=
        {
            Scanner in = new Scanner(System.in);
            if( in.nextInt() > 10){ // ==, >, <, >=, <=, !=, ||, !, &&, ==, !=; возвращает true, false
                System.out.println("Условие сгенерировало true");}
            else {
                System.out.println("Условие сгенерировало false");
            }*/

        //Ternary operators
/*        // <условие>? <значение, если условние истинно> : <значение, если условние ложно>
        {
            int a = 10;
            int b = 20;
            int max = (a > b ? a : b);
            System.out.println(max);
        }*/

        //Шаблон для решения задачи: принадлежит ли точка заданной области
/*        {
            Scanner in = new Scanner(System.in) //Создаем сканер
            in.useLocale(Locale.US); // точки вместо запятях в десятичных числах
            double x = in.nextDouble(); //Создаем переменную
            double y = in.nextDouble(); //Создаем переменную
            System.out.println(<условие> ?"YES" : "NO"); //Записываем условия и проверяем, выполняется ли

        } */
        //Задача из практического задания №112165
/*        {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println(x < 2 && y < x && x*x + y*y >4 && y > 0 ? "YES" : "NO");

        } */

        //Задача из практического задания №112167
/*        {
            System.out.println("Введите два вщещственных числа - координаты точки на плоскости (сначла х, затем у): ");
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println((y < 2 - x*x) && ((x<=0 && y>x) || (x>0 && y<x))? "YES" : "NO");

        }*/

        // if else
/*        {
            int max =0;
            int a = 10, b = 5;
            if (a > b) {
                max = a;
            } else {
                max = b;
            }
        }*/

        //else if  Пример: Проверка какой разряд больше в двухзначном числе
/*        System.out.println("Проверка какой разряд больше в двухзначном числе. Введите число: ");
        Scanner in = new Scanner(System.in);
        int x1, x2;
        x1 = in.nextInt();
        if(x1>9 && x1<100) {
            x2 = x1 % 10; //остаток от деления на 10
            x1 = x1 / 10;
            System.out.println(x1 + ";" + x2);
            if (x1 == x2) {
                System.out.println("В числе одинаковые числа");
            } else if (x2 < x1) {
                System.out.println("Первая цифра больше второй");
            } else {
                System.out.println("Вторя цифра больше первой");
            }
        } else
        {System.out.println("Число не является двузначным");
        }*/
        //switch case
        // Выдает количество дней в месяце
 /*       System.out.println("Введите номер месяца: ");
        Scanner in = new Scanner(System.in); //Создаем сканер
        switch (in.nextInt()){
            case 1:
                System.out.println("В месяце 31 день");
                break;
            case 2:
                System.out.println("В месяце 28 дней");
                break;
            case 3:
                System.out.println("В месяце 31 день");
                break;

            case 4:
                System.out.println("В месяце 30 дней");
                break;
            case 5:
                System.out.println("В месяце 31 день");
                break;
            case 6:
                System.out.println("В месяце 30 дней");
                break;
            case 7:
                System.out.println("В месяце 31 день");
                break;
            case 8:
                System.out.println("В месяце 31 день");
                break;
            case 9:
                System.out.println("В месяце 30 дней");
                break;
            case 10:
                System.out.println("В месяце 31 день");
                break;
            case 11:
                System.out.println("В месяце 30 дней");
                break;
            case 12:
                System.out.println("В месяце 31 день");
                break;
            default:
                System.out.println("Неверно задан номер месяца");
        }*/
//Blocks
        //Блоки видимости - где доступны переменные
/*        {
            int inf =10;

            if (inf>0) {
                int price = 4;
                price += inf * price/100;
                System.out.println(price);
            }
        //    System.out.println(price); //ошибка, так как price здесь не оперделена
        }*/
        //Наличие цифры 3 в двузначном числе
/*        {
            Scanner in = new Scanner(System.in);
            int x1, x2;
            x1 = in.nextInt();
            x2 = x1 %10;
            x1 = x1/10;

            if(x2 == 3 || x1 == 3) {
                System.out.println("В числе присутствует цифра 3");

        } else {
            System.out.println("В числе отсутствует цифра 3");
        }

        }*/

//while
        /*{
         *    while (условие){
         *    действие и выполнение;
         *    }
         * }
         * */
// Пример while выводим значение х, пока число меньше 5
/*        {
            int x = 0;
            while (x < 5) {
                System.out.print(x + " ");
                x++;
            }

        }*/
        // do while
/*        {
            int x = 0;
            do {
                System.out.print(x + " ");
                x++;
            } while (x < 5);

        }*/
// Задача "автобус и мосты" - проедет ли автобус под мостом, высота автобуса 437 см
        // Bus height 437 cm
        // 1 754 => No crash
        // 2 моста 300 и 800 => Crash 1
        // проехали все моствы => No Crash
        // N - количество мостов
        {
            System.out.println("Введите количество мостов и высоту каждого моста по порядку: ");
            Scanner in = new Scanner(System.in);
            int t = 0;
            int i = 1;
            int N = in.nextInt();

            while (i<=N){
                t = in.nextInt();
                if (t < 437){
                    System.out.println("Crash " + i);
                    break;
                }
                i++;
            }
            if (t > 437){
                System.out.println("No crash");
            }
        }




    }
}






