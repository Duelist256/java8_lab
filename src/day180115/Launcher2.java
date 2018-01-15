package day180115;

interface Left {
    int value = 100;

    static int getValue() { return value; }
}

interface Right {
    int value = -100;

    static int getValue() { return value; }
}

class GrandGrandChild extends GrandChild implements Left, Right {

}

public class Launcher2 {
    public static void mGrandGrandain(String[] args) {
        GrandGrandChild grandGrandChild = new GrandGrandChild();
        System.out.println(grandGrandChild.getValue());

        Left left = grandGrandChild;
//        System.out.println(left.getValue());
    }
}
