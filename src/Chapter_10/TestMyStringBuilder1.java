package Chapter_10;

public class TestMyStringBuilder1 {
    public static void main(String[] args) {
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("Test");
        System.out.println(myStringBuilder1.toString());
        MyStringBuilder1 myStringBuilder11 = new MyStringBuilder1(" - test2");
        System.out.println(myStringBuilder11);

        System.out.println(myStringBuilder1.length());
        System.out.println(myStringBuilder11.length());
        System.out.println(myStringBuilder1.charAt(0));
        System.out.println(myStringBuilder11.charAt(7));

        System.out.println((myStringBuilder1.append(myStringBuilder11)).toString());

        System.out.println(myStringBuilder1.append(1));
        System.out.println(myStringBuilder1.toLowerCase());
        System.out.println(myStringBuilder11.substring(2, 7));

        System.out.println();

        MyStringBuilder2 myStringBuilder2 = new MyStringBuilder2("myStrBild2");
        char[] ch = {'a', 'b', 'c'};
        MyStringBuilder2 myStringBuilder22 = new MyStringBuilder2(ch);
        MyStringBuilder2 myStringBuilder23 = new MyStringBuilder2();

        System.out.println(myStringBuilder2);
        System.out.println(myStringBuilder22);
        System.out.println(myStringBuilder23);
    }
}

