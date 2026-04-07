

import java.io.*;

public class even_odd_site {
    public static void main(String[] args) throws IOException {
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        //Write the Title
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        //For each number, if it is even write it on the left column and if it is odd write on the right column
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        file.write("</table>\n</body>\n</html>");
        file.close();
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        //Print out each line in the table
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
