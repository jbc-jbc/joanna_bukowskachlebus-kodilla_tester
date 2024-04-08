public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year + " jest rokiem przestepnym.");
        } else {
            System.out.println(year + " nie jest rokiem przestępnym.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year %4==0) {
            if (year %100==0) {
                if (year%400==0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;

        //return (year %4==0 && year %100==0 && year%400==0);

    }
}

