package lab4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author h8saini
 */
public class Record {
//applying singleton design pattern to Record class 

    private static Record r = new Record("record.txt");
// Name of the associated file   
    private String filename;

    public Record(String n) {
        filename = n;
    }

// Effects: Reads and prints the contents of the associated
// file to the standard output.   
    public void read() {
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

//Effects: Appends the specified message, msg, to the
// associated file.   
    public void write(String msg) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(msg);
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
// Fill the blank below that obtains the sole instance   
// of the Record class.
// (You should not invoke the Record constructor here.)   

// Do not modify the code below   
        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt " + "contains the following lines:");
        r.read();

    }
}