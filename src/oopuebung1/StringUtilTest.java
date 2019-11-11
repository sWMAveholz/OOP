package oopuebung1;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void testString2StringArray1() {
        String s1 = new String("kurt fährt auto");
        String s2 = new String("kurt fährt     auto");



        String[] arrs1 = StringUtil.string2StringArray(s1);
        String[] arrs2 = StringUtil.string2StringArray(s2);

        assertArrayEquals("Ergebnis: ", arrs1,arrs2);


    }

    @Test
    public void stringArray2String() {
        String[] array = {"kurt", "fährt", "auto"};
        assertEquals("kurt fährt auto", StringUtil.stringArray2String(array));

        //String s1 = StringUtil.string2StringArray(array);
    }

    @Test
    public void testAreAnagrams(){
        System.out.println(StringUtil.areAnagramms("Debit Card","Bad Credit"));
        System.out.println(StringUtil.areAnagramms("ab","ba"));
    }


}
