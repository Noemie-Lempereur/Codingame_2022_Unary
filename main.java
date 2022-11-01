import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        String result = "";
        char[] chars = MESSAGE.toCharArray();
        int iterator = 0;
        char ancien = '0';
        for (char c : chars) {
            String binaire = "";
            binaire += Integer.toBinaryString((int) c);
            while(binaire.length()<7){
                binaire="0"+binaire;
            }
            if (iterator == 0) {
                if (binaire.charAt(0) == '0') {
                    ancien = '0';
                    result += "00 0";
                } else {
                    ancien = '1';
                    result += "0 0";
                }
                for (int i = 1; i < binaire.length(); i++) {
                    if (binaire.charAt(i) == ancien) {
                        result += "0";
                    } else {
                        if (binaire.charAt(i) == '0') {
                            ancien = '0';
                            result += " 00 0";
                        } else {
                            ancien = '1';
                            result += " 0 0";
                        }
                    }
                }
            } else {
                for (int i = 0; i < binaire.length(); i++) {
                    if (binaire.charAt(i) == ancien) {
                        result += "0";
                    } else {
                        if (binaire.charAt(i) == '0') {
                            ancien = '0';
                            result += " 00 0";
                        } else {
                            ancien = '1';
                            result += " 0 0";
                        }
                    }
                }
            }
            iterator++;
        }
        System.out.println(result);
    }
}
