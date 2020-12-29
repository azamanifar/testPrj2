import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class listtheoytest {

    @DataPoints
    public static String[]  st={"cat","ant","bat"};

    @DataPoints
    public static List[] ls={Arrays.asList("ant","bat"),
            Arrays.asList("bat","car","dog","hat"),Arrays.asList("Snap","car","pop")};

    @Theory
    public void removeandAtTheSameValidation(List<String> ls,String s)
    {
        assumeTrue(ls!=null);
        assumeTrue(ls.contains(s));
        List<String> copy=new ArrayList<String>(ls);
        copy.remove(s);
        copy.add(s);
        assumeTrue(ls.equals(copy));
    }


}
