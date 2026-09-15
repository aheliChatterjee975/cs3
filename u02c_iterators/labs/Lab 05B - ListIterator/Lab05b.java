//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class Lab05b
{
   public static void main(String[] args)
   {
      ListIteratorTest test;

      test = new ListIteratorTest("a b c d e");
      out.println(test);

      test.setTest("c");
      out.println(test);

      test.replace("b", "B");
      out.println(test);

      test.replace("d", "D");
      out.println(test);


      test = new ListIteratorTest("one two three two four");
      out.println(test);

      test.setTest("two");
      out.println(test);

      test.replace("three", "THREE");
      out.println(test);
   }
}
