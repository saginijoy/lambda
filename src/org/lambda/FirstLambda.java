package org.lambda;

import java.io.File;
import java.io.FileFilter;
import java.net.InetAddress;

/**
 *
 * @author José
 */
public class FirstLambda {

    public static void main(String[] args) {
    	try{  
    		InetAddress ip=InetAddress.getLocalHost();  
    		  
    		System.out.println("Host Name: "+ip.getHostName());  
    		System.out.println("IP Address: "+ip.getHostAddress());  
    		}catch(Exception e){System.out.println(e);}  
        
//        FileFilter filter = new FileFilter() {
//
//            @Override
//            public boolean accept(File pathname) {
//                
//                return pathname.getName().endsWith(".java");
//            }
//        };
        
        FileFilter filterLambda = (File pathname) -> 
                pathname.getName().endsWith(".java");
        
        File dir = new File("c:/tmp");
        
        File[] files = dir.listFiles(filterLambda);
        
        for (File f : files) {
            System.out.println(f);
        }
    }
}
