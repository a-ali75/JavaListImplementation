public class LispTester {
    public static void main(String[] args) {
        LispList lispList = LispList.NIL.cons("C").cons("B").cons("A");
        System.out.println("Expected Head is - [A]");
        System.out.println("Current Head is - [" + lispList.head() + "]");
        System.out.println("Expected Tail is - [BC]");
        System.out.println("Current Tail is - [" + lispList.tail() + "]");
        System.out.println("Expected Result is - [ABC]");
        System.out.println("Current Result is - ["+ lispList+"]");
        System.out.println("Length of the List is -> " + lispList.length());

        System.out.println("\n\n\n------------------------");

        boolean flag1 = lispList.contains("A");
        System.out.println("Found B -> " + flag1);
        boolean flag2 = lispList.contains("X");
        System.out.println("Found X -> " + flag2);

        System.out.println("\n\n\n------------------------");

        LispList lispList2 = LispList.NIL.cons("4").cons("3").cons("2").cons("1");
        System.out.println("Expected Result is - [1234]");
        System.out.println("Current Result is - ["+ lispList2+"]");

        System.out.println("\n\n\n------------------------");

        LispList lispList3 = LispList.NIL.cons("Y").cons("X");
        System.out.println("Expected Result is - [XY]");
        System.out.println("Current Result is - ["+ lispList3+"]");

        System.out.println("\n\n\n------------------------");

        System.out.println("---- Merging Short List with Longer List ----");
        System.out.println("" + lispList3.merge(lispList));

        System.out.println("\n\n\n------------------------");

        System.out.println("---- Merging Longer List with Shorter List ----");
        System.out.println("" + lispList2.merge(lispList));

        System.out.println("\n\n\n------------------------");

        LispList emptyList = LispList.NIL;
        System.out.println("---- Empty List Length ----");
        System.out.println("" + emptyList.length());

        System.out.println("\n\n\n------------------------");

        System.out.println("---- Merging Empty List with Another List ----");
        System.out.println("" + emptyList.merge(lispList));

        System.out.println("\n\n\n------------------------");

        System.out.println("---- Merging Another List with Empty List ----");
        System.out.println("" + lispList.merge(emptyList));
    }
}
