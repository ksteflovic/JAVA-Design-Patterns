package dp_template;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author KI
 */
public abstract class AbstractFileProcessor {

    private String[] fileNames;
    private BufferedReader in;
    private BufferedWriter out;

    public AbstractFileProcessor(String[] fileNames) {
         this.fileNames = fileNames;  
    }

    // sablonova metoda
    public final void processAllIntputFiles() {
        // algoritmus
        try {
            
            out = new BufferedWriter( new FileWriter ("src/docs/"+fileNames[fileNames.length-1]));
            
            for (int i = 0; i < fileNames.length-1; i++) {
                in = new BufferedReader (new FileReader ("src/docs/"+fileNames[i]));
                
                // abstraktna metoda
                processInputFile(in, out);
                
                in.close();
            }
            
            out.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // abstraktna metoda
    public abstract void processInputFile(BufferedReader in, BufferedWriter out) throws IOException;
}
