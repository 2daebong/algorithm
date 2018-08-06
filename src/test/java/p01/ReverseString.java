package p01;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseString {

    @Test
    public void main() {

        String s = "reverse";

        reverse(s);
    }

    private void reverse(String str) {
        if(str.length() == 0) {
            return;
        }

        System.out.print((str.substring(str.length()-1, str.length())));

        reverse(str.substring(0, str.length()-1));
    }

}