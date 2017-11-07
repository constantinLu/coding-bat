package WarmUp1;

public class frontBack {


    public static void main(String[] args) {
        frontBack fb = new frontBack();
        System.out.println(fb.frontBack("code"));
        System.out.println(fb.frontBack("a"));
        System.out.println(fb.frontBack("Chocolate"));

    }

    public String frontBack(String str) {
        if (str.length() <= 1)
            return str;
        String mid = str.substring(1, str.length() - 1);
        char last = str.charAt(str.length() - 1);
        char first = str.charAt(0);
        //String s = str.substring(0, 1);
        //String back = str.substring(str.length() - 1, str.length());
        //String  fina = back + str + s;
        return last + mid + first;
    }

}






















