/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfile;

import java.io.*;
import java.util.*;

/**
 *
 * @author Davide
 */
public class MyFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }

    public String stringReadAllFile(String pathFile) {
        try {
            File name = new File(pathFile);
            BufferedReader input = new BufferedReader(new FileReader(name));
            String txt;
            String temp = "";

            if (name.isFile()) {
                while ((txt = input.readLine()) != null) {
                    if (input.readLine() == null) {
                        temp += txt;
                    } else {
                        temp += txt + "\n";
                    }
                }

                input.close();
            }

            return temp;

        } catch (IOException ioException) {
            //visualizzo errore
            System.err.println("Read file error");
            return "";
        }
    }

    public ArrayList<String> arrayListReadAllFile(String pathFile) {
        try {
            File name = new File(pathFile);
            BufferedReader input = new BufferedReader(new FileReader(name));
            ArrayList<String> temp = new ArrayList<String>();
            String txt;

            if (name.isFile()) {
                while ((txt = input.readLine()) != null) {
                    temp.add(txt);
                }

                input.close();
            }

            return temp;

        } catch (IOException ioException) {
            //visualizzo errore
            System.err.println("Read file error");
            return null;
        }
    }

    public String stringReadAllFileFromLine(String pathFile, int nRow) {
        try {
            File name = new File(pathFile);
            BufferedReader input = new BufferedReader(new FileReader(name));
            String txt;
            String temp = "";

            if (name.isFile()) {

                for (int i = 0; i < nRow - 1; i++) {
                    input.readLine();
                }

                while ((txt = input.readLine()) != null) {
                    if (input == null) {
                        temp += txt;
                    } else {
                        temp += txt + "\n";
                    }
                }

                input.close();
            }

            return temp;

        } catch (IOException ioException) {
            //visualizzo errore
            System.err.println("Read file error");
            return "";
        }
    }

    public ArrayList<String> arrayListReadAllFileFromLine(String pathFile, int nRow) {
        try {
            File name = new File(pathFile);
            BufferedReader input = new BufferedReader(new FileReader(name));
            ArrayList<String> temp = new ArrayList<String>();
            String txt;

            if (name.isFile()) {

                for (int i = 0; i < nRow - 1; i++) {
                    input.readLine();
                }

                while ((txt = input.readLine()) != null) {
                    temp.add(txt);
                }

                input.close();
            }

            return temp;

        } catch (IOException ioException) {
            //visualizzo errore
            System.err.println("Read file error");
            return null;
        }
    }

}
