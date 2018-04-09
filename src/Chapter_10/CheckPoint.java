package Chapter_10;

public class CheckPoint {
    public static void main(String[] args) {
       /** Integer x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));

        Double x1 = 3.5;
        System.out.println(x1.intValue());
        System.out.println(x1.compareTo(4.5));

       // String s1 = "Welcome";
        //String s2 = "welcome";
       //// String s3 = s1.replace('e', 'E');
       // String[] tokens = "Welcome to Java and HTML".split(" ");
       // s1 = tokens[0];
      //  s2 = tokens[1];

        System.out.println("Hi, ABC, good".matches("ABC "));
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll(",;", "#"));
        System.out.println("A,B;C".replaceAll("[,;]", "#"));

        String[] tokens1 = "A,B;C".split("[,;]");
        for (int i = 0; i < tokens1.length; i++)
            System.out.print(tokens1[i] + " ");

        String ss = "Hi, Good Morning";
        System.out.println(m(ss));

        StringBuilder s = new StringBuilder("string");
        s.reverse().reverse().reverse();
        s.delete(4,10);
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("HTML");
        //System.out.println(s1.append(" is fun"));
        //System.out.println(s1.append(s2));
        //System.out.println(s1.insert(2, "is fun"));
        //System.out.println(s1.insert(1, s2));
        //System.out.println(s1.charAt(2));
        //System.out.println(s1.length());
        //System.out.println(s1.deleteCharAt(3));
        //System.out.println(s1.delete(1, 3));
        //System.out.println(s1.reverse());
        System.out.println(s1.replace(1, 3, "Computer"));
        //System.out.println(s1.substring(1, 3));
        System.out.println(s1.substring(2));*/

        String s = "Java";
        StringBuilder builder = new StringBuilder(s);
        change(s, builder);

        System.out.println(s);
        System.out.println(builder);
    }

    private static void change(String s, StringBuilder builder) {
        s = s + " and HTML";
        builder.append(" and HTML");
    }

    public static int m(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isUpperCase(s.charAt(i)))
                count++;

            return count;

    }
}
