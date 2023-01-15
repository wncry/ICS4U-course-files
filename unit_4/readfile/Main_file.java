import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MixTape tape = new MixTape(); 
        try {
            File file = new File("data.txt");
            Scanner fr = new Scanner(file);

            System.out.println("file name: " + file.getName());
            System.out.println("file size: " + file.length());

            if (fr.hasNext() == true) {
                fr.nextLine();  // header line
            } else {
                System.out.println("err: file empty");
            }

            while (fr.hasNextLine()) {
                String ln = fr.nextLine();
                String[] line = ln.split(",");

                if (line.length!=4) {
                    System.out.println("err: bad data");
                    continue;  // skip
                }
                String song_artist = line[0];
                String song_name = line[1];
                double song_len = Double.parseDouble(line[2]);
                String user = line[3];

                tape.add_song(artist, songName, songLen, user);
            }

            fr.close();

        }

        catch (FileNotFoundException e) {
            System.out.println("err: file not found");
            // e.printStackTrace();
        }

        System.out.println(tape);
        System.out.println(tape.get_tape_length());
        for (int i=0; i<tape.get_song_count(); i+=2){
            System.out.println(tape.getSong(i));
        }
    }
}