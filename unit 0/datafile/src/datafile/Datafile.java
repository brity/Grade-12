/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datafile;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author lenovo
 */
public class Datafile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        FileReader fr = new FileReader("Datafile.txt");

        // Create a buffered reader
        BufferedReader br = new BufferedReader(fr);

        // Read and display lines from file
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        fr.close();

    }

}
