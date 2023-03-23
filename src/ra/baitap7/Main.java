package ra.baitap7;


import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Human> queueNam = new LinkedList<>();
        Queue<Human> queueNu = new LinkedList<>();
        try {
            File file = new File("src/output.txt");
            file.createNewFile();

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                boolean sex = arr[1].equals("nam");
                int born = Integer.parseInt(arr[2]);
                if (arr[1].equals("nam")) {
                    queueNam.add(new Human(arr[0], born, sex));
                } else {
                    queueNu.add(new Human(arr[0], born, sex));
                }
            }
            for (Human human: queueNam
                 ) {
                System.out.println(human);
                bw.write(human.toString());
                bw.newLine();
            }
            for (Human human: queueNu
            ) {
                bw.write(human.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
