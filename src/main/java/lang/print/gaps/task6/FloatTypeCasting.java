package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void roundNumber(float numberToBeRounded) {
        int roundInt = (int) numberToBeRounded;
        numberToBeRounded = numberToBeRounded - roundInt;
        numberToBeRounded = numberToBeRounded * 10;
        numberToBeRounded = (int) (numberToBeRounded / 5);
        numberToBeRounded = numberToBeRounded + roundInt;
        System.out.println((int) numberToBeRounded);

    }

}
