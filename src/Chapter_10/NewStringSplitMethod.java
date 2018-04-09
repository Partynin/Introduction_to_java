package Chapter_10;


public class NewStringSplitMethod {
    /** Main method */
    public static void main(String[] args) {
        String[] temp1 = MyString1.split("WordAttachedlolol", "Attached");
        for (String s : temp1) {
            System.out.print(s + " ");
        }

        System.out.println();

        String[] temp2 = MyString1.split("Wor#dAt#tac#he#dl#ol#ol", "#");
        for (String s : temp2) {
            System.out.print(s + " ");
        }

    }


}
