import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class StrTest {
    String a = "1";
    int b = 2;
    long c = 3L;
    double d = 4;
    boolean e = true;
    Long f = 3L;
    Double g = 4D;
    BigDecimal h = new BigDecimal(5);
    Integer i = 7;
    Boolean j = false;
    Date k = new Date();
    Object l = new Object();
    public static void main(String[] args) {

        System.out.println(Season.CS.toString());
    //    String s = "ghuhnjjj";
    //    if(s.contains("jk"));
        StrTest strTest = new StrTest();
        Field[] fields = strTest.getClass().getDeclaredFields();
        Arrays.asList(fields).forEach(field -> System.out.println(field.getGenericType().toString()));


    }
}
