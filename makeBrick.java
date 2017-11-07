package codingBath;

public class makeBrick {

    // We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
    // Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops

    public static void main(String[] args) {

        makeBrick m = new makeBrick();
        boolean answer = m.makeBricks(3, 1, 8);
//        System.out.println("The answer is :5" + answer);
        System.out.println(m.makeBricks(3, 1, 8));
        System.out.println(m.makeBricks(3, 1, 9));
        System.out.println(m.makeBricks(3, 2, 10));
    }

    public boolean makeBricks(int small, int big, int goal) {

        int maxBig = goal / 5;
        if (maxBig <= big) {
            goal -= maxBig * 5;
        } else {
            goal -= big * 5;
        }
        return goal <= small;
    }


}
