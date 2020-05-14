package monsters;

import java.io.*;

public abstract class Monster implements Cloneable {

    private String appearence;

    public Monster(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            StringBuilder pom = new StringBuilder();
            while ((line = br.readLine()) != null) {
                pom.append(line);
                pom.append("\n");
            }
            appearence = pom.toString();
            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String show() {
        return appearence;
    }

    public abstract String makeBooo();

    @Override
    public Object clone() throws CloneNotSupportedException {   

        return super.clone();
    }
    
    
}
