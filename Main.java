import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] a = {"(", "x + y", ")", "* 5"};
        Delimiters first = new Delimiters("(", ")");
        System.out.println(first.getDelimitersList(a));

        String[] b = {"<q>", "yy", "</q>", "zz", "</q>"};
        Delimiters second = new Delimiters("<q>", "</q>");
        System.out.println(second.getDelimitersList(b));

        String[] test = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        ArrayList<String> test2 = new ArrayList<>();
        for (String x: test) {
            test2.add(x);
        }
        String[] test3 = {"<sup>", "</sup>", "</sup>", "<sup>"};
        ArrayList<String> test4 = new ArrayList<>();
        for (String x: test3) {
            test4.add(x);
        }
        ArrayList<String> test5 = new ArrayList<>();
        test5.add("</sup>");
        String[] test6 = {"<sup>", "<sup>", "</sup>"};
        ArrayList<String> test7 = new ArrayList<>();
        for (String x: test6) {
            test7.add(x);
        }
        Delimiters third = new Delimiters("<sup>", "</sup>");
        System.out.println(third.isBalanced(test2));
        System.out.println(third.isBalanced(test4));
        System.out.println(third.isBalanced(test5));
        System.out.println(third.isBalanced(test7));
    }
}