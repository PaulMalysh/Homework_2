//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("fraction result:");
        System.out.println(Methods.fraction(1000.72587));

        System.out.print("sumLastNums result:");
        System.out.println(Methods.sumLastNums(1257869));

        System.out.print("charToNum result:");
        System.out.println();

        System.out.print("isPositive result:");
        System.out.println(Methods.isPositive(-3));

        System.out.print("is2Digits result:");
        System.out.println(Methods.is2Digits(234));

        System.out.print("isUpperCase result:");
        System.out.println(Methods.isUpperCase('d'));

        System.out.print("isInRange result:");
        System.out.println(Methods.isInRange(5, -3, -4));

        System.out.print("isDivisor result:");
        System.out.println(Methods.isDivisor(6,2));

        System.out.print("iisEqual result:");
        System.out.println(Methods.isEqual(3,3,4));

        System.out.print("lastNumSum result:");
        System.out.println(Methods.lastNumSum(1, Methods.lastNumSum(14, Methods.lastNumSum(123, Methods.lastNumSum(5,11)))));

        System.out.println();
        System.out.print("abs result:");
        System.out.println(Methods.abs(3));

        System.out.print("safeDiv result:");
        System.out.println(Methods.safeDiv(6,0));

        System.out.print("max result:");
        System.out.println(Methods.max(8,-1));

        System.out.print("makeDecision result:");
        System.out.println(Methods.makeDecision(8,8));

        System.out.print("max3 result:");
        System.out.println(Methods.max3(8,-1,4));

        System.out.print("sum3 result:");
        System.out.println(Methods.sum3(5,7,2));

        System.out.print("sum2 result:");
        System.out.println(Methods.sum2(5,16));

        System.out.print("is35 result:");
        System.out.println(Methods.is35(35));

        System.out.print("magic6 result:");
        System.out.println(Methods.magic6(8,1));

        System.out.print("age result:");
        System.out.println(Methods.age(21));

        System.out.print("day result:");
        System.out.println(Methods.day(11));

        System.out.println("printDays result:");
        System.out.print(Methods.printDays("четверг"));











    }
}

class Methods {
    public static double fraction(double x) {
        double y = (int) x;
        return (x - y);
    }

    public static int sumLastNums(int x) {
        return ((x % 10) + (x / 10 % 10));
    }

    public static int charToNum(char x) {
        //int y = 48;
        return (x - 48);
    }

    public static boolean isPositive(int x) {
        return (x > 0);
    }

    public static boolean is2Digits(int x) {
        String intToString = String.valueOf(x);
        return (intToString.length() == 2);
    }

    public static boolean isUpperCase(char x) {
        return Character.isUpperCase(x);
    }

    public static boolean isInRange(int a, int b, int num) {
        int x;
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }
        return (num > a && num < b);
    }

    public static boolean isDivisor(int a, int b) {
        return ((a % b == 0) || (b % a == 0));
    }

    public static boolean isEqual(int a, int b, int c) {
        return (a == b && b == c);
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    public static int abs(int x) {
        if (x < 0) {
            x = -x;
        }
        return x;
    }

    public static int safeDiv(int x, int y) {
        int z;
        if (y != 0) {
            z = x / y;
        } else
            z = 0;
        return z;
    }

    public static int max(int x, int y) {
        int z;
        if (x > y){
            z = x;
            x = y;
            y = z;
        }
        return (y);
    }

    public static String makeDecision(int x, int y) {
        String decision = "";
        if (x > y){
            decision = (x + " > " + y);
        }
        if (x < y){
            decision = (x + " < " + y);
        }
        if (x == y){
            decision = (x + " == " + y);
        }
        return decision;
    }

    public static int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    public static boolean sum3(int x, int y, int z) {
        return ((x+y) == z || (z+y) == x || (x+z) == y);
    }

    public static int sum2(int x, int y) {
        int z;
        if ((x+y)>=10 && (x+y)<=19){
            z = 20;
        } else z = x+y;
        return z;
    }

    public static boolean is35(int x) {
        boolean z = false;
        if ((x%3 == 0) || (x%5 == 0)) {
            z = true;
        } else if ((x%3 == 0) && (x%5 == 0)) {
            z = false;
        }
        return (z);
    }

    public static boolean magic6(int x, int y) {
        return ((x == 6) || (y == 6) || (x + y == 6) || (x - y == 6) || (y - x == 6));
    }

    public static String age(int x) {
        String myAge;
        if (((x == 1) || ((x%10) == 1)) && (x != 11)) {
            myAge = " год";
        } else if
        (((x % 10 == 2) || (x % 10 == 3) || (x % 10 == 4)) && (x != 12) && (x != 13) && (x != 14)) {
            myAge = " года";
        } else
            myAge = " лет";
        return (x + myAge);
    }

    public static String day(int x) {
        String dayOfTheWeek;
        switch (x) {
            case 1:
                dayOfTheWeek = "понедельник";
                break;
            case 2:
                dayOfTheWeek = "вторник";
                break;
            case 3:
                dayOfTheWeek = "среда";
                break;
            case 4:
                dayOfTheWeek = "четверг";
                break;
            case  5:
                dayOfTheWeek = "пятница";
                break;
            case 6:
                dayOfTheWeek = "суббота";
                break;
            case 7:
                dayOfTheWeek = "воскресенье";
                break;
            default:
                dayOfTheWeek = "это не день недели";
        }
        return (dayOfTheWeek);

    }

    public static boolean printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четчверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскреенье":
                System.out.println("воскреенье");
                break;
            default:
                System.out.println("это не день недели");
        }
        return false;
    }
}