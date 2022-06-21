public class Main {

    public static int counter = 0;

    public static void main(String[] args) {

        int result = additivePersistence(229999999);
        System.out.println(result);

    }

    public static int additivePersistence(int num) {

        int sum = 0;
        String s = String.valueOf(num);

        if (s.length() == 1) {
            System.out.println("End bro");
            return Integer.parseInt(s);
        }

        for (int i = 0; i < s.length(); i++) {

            sum += Integer.parseInt(String.valueOf((s.charAt(i))));

        }

        System.out.println(sum);
        int sum1 = sum;
        additivePersistence(sum1);
        counter++;

        return counter;

    }
}