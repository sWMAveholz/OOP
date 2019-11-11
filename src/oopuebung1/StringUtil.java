package oopuebung1;

import java.util.Arrays;

public class StringUtil {

    public static String[] string2StringArray(String s){
        String[] parts = s.split("\\s+");
        Arrays.sort(parts);
        return parts;

    }

    public static String stringArray2String(String[] arr){
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i<arr.length;i++){
            buf.append(arr[i]);
            if(i<arr.length-1) buf.append(" ");
        }
        return new String(buf);
    }

    public static boolean areAnagramms(String string1, String string2){
        if(string1.equals(string2)) return false;

        String ber1= removeJunk(string1);
        String ber2 = removeJunk(string2);

        ber1=ber1.toLowerCase();
        ber2=ber2.toLowerCase();

        ber1=sort(ber1);
        ber2=sort(ber2);

        return ber1.equals(ber2);

    }

    public static String removeJunk(String string){
        StringBuilder dest = new StringBuilder();
        char c;
        for (int i = 0;i<string.length();i++){
            c = string.charAt(i);
            if (Character.isLetter(c)){
                dest.append(c);
            }
        }
        return dest.toString();

    }

    public static String sort(String string){
        char[] chararry = string.toCharArray();
        Arrays.sort(chararry);
        return new String(chararry); //muss so sein, sonst Fehler!
    }
}
