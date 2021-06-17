
package writeinfo;
import java.io.FileWriter;
import java.io.IOException;

public class Writeinfo {

    public static void main(String[] args) {
       try{
           FileWriter myWriter=new FileWriter("E:\\2nd Semester\\Java\\filehandle\\file1.txt");
           myWriter.write("Java is an OOP language");
           myWriter.close();
           
           System.out.println("Successfully wrote to the file");
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
}
