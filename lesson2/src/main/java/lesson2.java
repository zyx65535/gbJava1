import org.w3c.dom.ls.LSOutput;

public class lesson2 {
    public static void main(String[] args) {
        boolean resultSum = compareSum(10,25);
        System.out.println("a=" + 10 + "b=" + 25 + "sum a+b>= 10 && sum a+b <= 20 ==" + resultSum);

        isPositive(5);

        System.out.println("Number (-5) is negative ==" + isNegative(-5));

        printStringNTimes("test_str",5);

        System.out.println(isLeapYear(400));
    }


    public static boolean compareSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20 ) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositive(int a) {
        if (a >= 0) {
            System.out.println(a + " == Number is Positive");
        } else {
            System.out.println(a + " == Number is Negative");
        }
    }

    public static boolean isNegative(int a) {
        if (a <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printStringNTimes(String str, int num) {
        for (int i=0; i < num; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year <100) {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }

        } else {
            if ((year % 4 == 0) && (year % 100 > 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }

    }
}