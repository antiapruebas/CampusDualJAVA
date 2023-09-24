package com.campusdual.ejercicioTryCatch;

import java.io.*;
import java.util.Random;

public class FileWR {

    private Random r = new Random();

    private void write() throws FileNotFoundException {
        try(PrintWriter pw = new PrintWriter(new File("salida.txt"))) {
            for(int i = 0; i < 10; i++){
                pw.println(this.r.nextInt(10)+1);
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
    }
    private void read() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader (new File ("salida.txt")))) {
            String line;
            while ( (line = br.readLine()) !=null)  {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw e;
        }

    }

    public static void main(String[] args) {

       FileWR wr = new FileWR();

        try {
            wr.write();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            wr.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
