import java.io.FileInputStream;

public class FileTester2 {
    public static void main(String args[]) {
        try (FileInputStream fin = new FileInputStream("C:\\Users\\Dell pc\\Desktop\\rr.txt")) {
            int i = fin.read();
            System.out.print((char) i);

            //        fin.close();
              }catch(Exception e){System.out.println(e);}

            //   }
//}
        }
    }


