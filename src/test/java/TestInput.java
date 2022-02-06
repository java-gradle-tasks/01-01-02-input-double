import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class TestInput {

      @Test
      public void test() {

          String newLine="";
          String avarage_input="";
          if (System.getProperty("os.name").startsWith("Windows")) {
              newLine="\r\n";
              avarage_input="4,25";
          } else {
              newLine="\n";
              avarage_input="4.25";
          }

          InputStream stdin = System.in;

          String input=avarage_input+newLine;
          System.setIn(new ByteArrayInputStream(input.getBytes()));

          ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
          PrintStream ps = new PrintStream(byteArrayOutputStream);
          PrintStream stdout = System.out;
          System.setOut(ps);

          MySemesterAverage.main(new String[0]);

          System.setIn(stdin);
          System.setOut(stdout);

          String outStream="Adja meg az elso feleves atlagat:";
          String expected=outStream;

          String actual=byteArrayOutputStream.toString();

          boolean found=actual.contains(expected);

          Assertions.assertTrue(found,"Hianyzik az input a kodbol vagy az input szovege nem megfelelo!");

      }
   }
