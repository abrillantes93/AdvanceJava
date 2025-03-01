import java.io.*;

public class Copy {
    /** Main Method
     * @param args[0] for source file
     * @param args[1] for target file */ 
    
     public static void main(String[] args) throws IOException{
        //check command-line parameter usage
        if (args.length !=2) {
            System.out.println("Usage: java Copy sourceFile targetFile");
     }

     //check if source file exsists
     File sourceFile = new File(args[0]);
     if(!sourceFile.exists()){
        System.out.println("Source file" + args[0] + " does not exist");
        System.exit(2);
     }
     //check if target file exsists
     File targetFile = new File(args[0]);
     if(!targetFile.exists()){
        System.out.println("Target file" + args[0] + " does not exist");
        System.exit(3);
     }

     try( 
        //create an input stream
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
        //create an output stream
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
     ) {
        int r, numberOfBytesCopied = 0;
        while ((r = input.read()) != -1) {
            output.write((byte)r);
            numberOfBytesCopied++;
        }
        //display file size
        System.out.println(numberOfBytesCopied + " bytes copied");
     }
}
}
