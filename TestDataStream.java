import java.io.*;
public class TestDataStream {
    public static void main(String[] args) throws IOException{
        try( //create output stream for file temp.dat
           DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
        ) { //write test scores
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        }

        try(
            DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
        ) {
            //read test scores from file
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}
