
package fileinfo;
import java.io.File;
import java.io.IOException;

public class Fileinfo {

    
    public static void main(String[] args) {
        try{
         File myObj=new File("E:\\2nd Semester\\Java\\filehandle\\file1.txt");
         if(myObj.exists())
         {
             System.out.println("File name is: "+myObj.getName());
             System.out.println("Absolute path is: "+myObj.getAbsolutePath());
             System.out.println("Writable: "+myObj.canWrite());
             System.out.println("Readable: "+myObj.canRead());
             System.out.println("File size is bytes: "+myObj.length());
         }
         else{
             System.out.println("The entered file does not exist!");
         }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
