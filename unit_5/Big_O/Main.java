import java.util.*;
import java.lang.*;
import java.io.*;

// chat.openai.com

class Main {
    public static void main(String[] args) throws IOException {
        for (int i=0; i<10; i++) {
            CSV.search("./data/search/", String.format("search_%d.csv", i), true);
            CSV.sort("./data/sort/", String.format("sort_%d.csv", i), true);
        }
    }
}