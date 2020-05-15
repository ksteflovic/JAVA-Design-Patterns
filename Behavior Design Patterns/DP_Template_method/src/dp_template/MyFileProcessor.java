package dp_template;

import java.io.*;

/**
 *
 * @author KI
 */
public class MyFileProcessor extends AbstractFileProcessor {

    // TO DO
    private PrintWriter pw;

    public MyFileProcessor(String[] fileNames) {
        super(fileNames);
    }

    @Override
    public void processInputFile(BufferedReader in, BufferedWriter out) throws IOException {
        pw = new PrintWriter(out);
        pw.println("SUBOR");

        int line_count = 0;
        String line = "", line_occur = "", word = "ahoj", no_space = "", html = "" ;

        while ((line = in.readLine()) != null) {
            line_count++;

            if (line.contains(word)) {
                line_occur += line_count + ", ";
            }
            // obsah pôvodných súborov bez prázdnych riadkov, viacnásobných medzier a pod.
            no_space += line.replaceAll(" ","").replaceAll("\\n", "");

            // obsah pôvodných súborov sformátovaný pomocou základných HTML značiek
            if(line_count==1)
                html = "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n";
            html += line+"</ br>";
        }

        // pre každý súbor počet jeho  riadkov,
        pw.println("Line count: "+line_count+"\n");

        // čísla riadkov obsahujúcich konkrétne slovo,
        if(!line_occur.isEmpty())
            pw.println("Word " + word +" is on lines: "+line_occur+"\n");
        else
            pw.println("Word " + word +" is not in this file."+"\n");

        // štatistika výskytu jednotlivých písmen (frekvenčná analýza),
        occurences(no_space);

        pw.println("File without any space: "+no_space+"\n");

        pw.println("HTML parsed file:");
        html += "\n</body>\n";
        html += "</html>";
        pw.println(html);
        pw.println("------------------------------");
    }

    private void occurences(String str){
        int[] freq = new int[str.length()];
        int i, j;

        char string[] = str.toCharArray();

        for(i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                pw.println(string[i] + "-" + freq[i]);
        }

        pw.print("\n");
    }

}