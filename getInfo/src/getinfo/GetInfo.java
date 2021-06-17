
package getinfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetInfo {

    public static void main(String[] args) {
        try{
            File myObj=new File("E:\\2nd Semester\\Java\\filehandle\\file1.txt");
            Scanner myReader=new Scanner(myObj);
            
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("an error is occured!");
            e.printStackTrace();
        }
    }
    
}
