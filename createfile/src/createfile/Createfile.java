
package createfile;

import java.io.File;
import java.io.IOException;

public class Createfile {

    public static void main

        
        try{
            File myObj=new File("E:\\2nd Semester\\Java\\filehandle\\file1.txt");
            if(myObj.createNewFile()){
                System.out.println("File created: "+myObj.getName());
            }
            else{
                System.out.println("File is already exsits!..");
            }
            
        }
        cat ch(IOException e){
             System.ou t .println("An error occured");
             e .printStackTrace(); 
              
        }  
    
}

           
            
            

        

