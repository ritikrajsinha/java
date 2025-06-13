import java.util.*;

public class Strings_ {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("ritika");
        str.append("Sinha");
        str.deleteCharAt(2);
        str.insert(2, "java");
        String res=str.substring(2);
        String emp=str.substring(2, 6);
        System.out.println(emp);
        System.out.println(res);
        System.out.println(str);

        
    }

    
}
