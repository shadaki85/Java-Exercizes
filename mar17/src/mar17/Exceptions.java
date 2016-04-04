/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mar17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author svilupposw
 */
public class Exceptions {
 
    public static void elaboraFile() throws IOException
    {
        File file = new File("/etc/passwd");
        InputStream is = new FileInputStream(file);
        is.close();
        System.out.println("Success!");
    }
    
    public static void main(String[] args) {
       try
       {
           elaboraFile();
       }
       catch(FileNotFoundException fnfe)
       {
           System.err.println("File not found");
           fnfe.printStackTrace();
       }
       catch(IOException ioe)
       {
           System.err.println("Unauthorized");
           ioe.printStackTrace();
       }
       finally
       {
           System.out.println("da qui ci passo sempre!");
       }
    }
}
