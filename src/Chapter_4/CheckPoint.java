package Chapter_4;

/**
 * Created by Kos on 22.06.2017.
 */
public class CheckPoint {
    public static void main(String[] args)
    {
        System.out.println(Math.ceil(2.1));

        System.out.println(Math.sqrt(4));
        System.out.println(Math.sin(2 * Math.PI));
        System.out.println(Math.cos(2 * Math.PI));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.log(Math.E));
        System.out.println(Math.exp(1));
        System.out.println(Math.max(2, Math.min(3, 4)));
        System.out.println(Math.rint(-2.5));
        System.out.println(Math.ceil(-2.5));
        System.out.println(Math.floor(-2.5));
        System.out.println(Math.round(-2.5f));
        System.out.println(Math.round(-2.5));
        System.out.println(Math.rint(2.5));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.floor(2.5));
        System.out.println(Math.round(2.5f));
        System.out.println(Math.round(2.5));
        System.out.println(Math.abs(-2.5));

        double a = Math.toRadians(47);
        System.out.println("47 degrees to radians is: " + a);

        double b = Math.toDegrees(Math.PI / 7);
        System.out.println("PI / 7 to degrees is: " + b);

        int x = 34 + (int) (Math.random() * 21);
        System.out.println(x);
        x = (int) (Math.random() * 1000);
        System.out.println(x);
        System.out.println(5.5 + Math.random() * 50);

        int x1 = '1';
        System.out.println("'1' in ASCII is: " + x1);
        x1 = 'A';
        System.out.println("'A' in ASCII is: " + x1);
        x1 = 'B';
        System.out.println("'B' in ASCII is: " + x1);
        x1 = 'a';
        System.out.println("'a' in ASCII is: " + x1);

        char c = 40;
        System.out.println("40 char is: " + c);
        c = 59;
        System.out.println("59 char is: " + c);
        c = 79;
        System.out.println("79 char is: " + c);
        c = 85;
        System.out.println("85 char is: " + c);

        c = '\u0040';
        System.out.println("char 40 in hexadecimal is: " + c);
        c = '\u005A';
        System.out.println("char 5A in hexadecimal is: " + c);
        c = '\u0071';
        System.out.println("char 71 in hexadecimal is: " + c);
        c = '\u0072';
        System.out.println("char 72 in hexadecimal is: " + c);
        c = '\u007A';
        System.out.println("char 7A in hexadecimal is: " + c);

        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        int k = 'a';
        char ch = 90;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(ch);

        char c1 = 'A';
        int i1 = (int)c1;
        System.out.println(c1 + " " + i1);

        float f = 1000.34f;
        int i2 = (int)f;
        System.out.println(f + " " + i2);

        double d = 100.34;
        int i3 = (int)d;
        System.out.println(d + " " + i3);

        int i4 = 97;
        char ch1 = (char)i4;
        System.out.println(i4 + " " + ch1);

        char ccc = (char) (97 + (int)(Math.random() * 23));
        char ccc1 = (char) (97 + (int)(Math.random() * 23));
        char ccc2 = (char) (97 + (int)(Math.random() * 23));

        System.out.println(ccc + " " + ccc1 + " " + ccc2);

        System.out.println('a' < 'b');
        System.out.println('a' <= 'A');
        System.out.println('a' > 'b');
        System.out.println('a' >= 'A');
        System.out.println('a' == 'a');
        System.out.println('a' != 'b');

        int z = "Welcome to Java".lastIndexOf("Java", 5);
        System.out.println("indexOf " + z);
        String s1 = "Welcome to Java";
        String s2 = "Programing is fun";
        String s3 = "Welcome to Java";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s2));
        System.out.println(s2.compareTo(s2));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('j'));
        System.out.println(s1.indexOf("to"));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.lastIndexOf("o",15));
        System.out.println(s1.length());
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 11));
        System.out.println(s1.startsWith("Wel"));
        System.out.println(s1.endsWith("Java"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(s2));
        System.out.println("\t Wel \t".trim());

        char c3 = s1.charAt(s1.length() - 1);
        System.out.println("c3 = " + c3);

        System.out.println(1 + "Welcome " + 1 + 1);
        System.out.println(1 + "Welcome " + (1 + 1));
        System.out.println(1 + "Welcome " + ('\u0001' + 1));
        System.out.println(1 + "Welcome " + 'a' + 1);

        s1 = " Welcome ";
        s2 = " welcome ";
        boolean isEqual;
        isEqual = s1 == s2;
        System.out.println(isEqual);
        isEqual = s1.equalsIgnoreCase(s2);
        System.out.println(isEqual);
        x = s1.compareTo(s2);
        System.out.println(x);
        x = s1.compareToIgnoreCase(s2);
        System.out.println(x);
        boolean bb = s1.startsWith("AAA");
        System.out.println(bb);
        bb = s1.endsWith("AAA");
        System.out.println(bb);
        x = s1.length();
        System.out.println(s1);
        char xx = s1.charAt(0);
        System.out.println(xx);
        String sss3 = s1 + s2;
        System.out.println(sss3);
        System.out.println(s1.substring(1));
        sss3 = s1.toLowerCase();
        System.out.println(sss3);
        sss3 = s1.toUpperCase();
        System.out.println(sss3);
        sss3 = s1.trim();
        System.out.println(sss3);
        x = s1.indexOf('e');
        System.out.println(x);
        x = s1.indexOf("abs");
        System.out.println(x);

        System.out.printf("amount is %f %e\n", 32.32, 32.32);
        System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
        System.out.printf("%6b\n", (1 > 2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%-6b%s\n", (1 > 2), "Java");
        System.out.printf("%-6b%-8s\n", (1 > 2), "Java");

    }
}
