package Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

           String line = br.readLine();
           while(line != null){
               String fields[] = line.split(",");
               String name = fields[0];
               int count = Integer.parseInt(fields[1]);

               if (map.containsKey(name)){
                   int votes = map.get(name);
                   map.put(name, count + votes);
               } else {
                   map.put(name,count);
               }
               line = br.readLine();
           }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String m : map.keySet()){
            System.out.println(m + ": " + map.get(m));
        }

        sc.close();
    }
}
