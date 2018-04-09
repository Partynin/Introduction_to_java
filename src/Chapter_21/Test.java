package Chapter_21;

public class Test {
    public static void main(String[] args) {
        String a = "\"a\"";
        String b = "\"1 a\";w";
        System.out.println(a.matches("."));
        System.out.println(b.matches("\"[\\w|\\W]*\"[\\W|\\w]*"));
    }
}
