/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfile;

import java.io.*;
import java.util.*;

/**
 * File management class
 *
 * @author Davide
 * @version 1.0
 */
public class MyFile {

    /**
     * Class constructor
     *
     * @author Davide
     */
    public MyFile() {
    }

    /**
     * Function that permits you to return the file's content in a String
     *
     * @author Davide
     * @param pathFile Path of the file
     * @return String File's content
     */
    public String stringReadAllFile(String pathFile) {
        try {
            File name = new File(pathFile);
            BufferedReader input = new BufferedReader(new FileReader(name));
            ArrayList<String> tempTXT = new ArrayList<>();
            String txt;
            String temp = "";

            if (name.isFile()) {
                while ((txt = input.readLine()) != null) {
                    tempTXT.add(txt);
                }
                input.close();
            }

            for (int i = 0; i < tempTXT.size(); i++) {
                if (i == tempTXT.size() - 1) {
                    temp += tempTXT.get(i);
                } else {
                    temp += tempTXT.get(i) + "\n";
                }
            }

            return temp;

        } catch (IOException e) {
            //visualizzo errore
            System.err.println("Read file error");
            return "";
        }
    }

    /**
     * Function that permits you to return the file's content in a String Arraylist
     *
     * @author Davide
     * @param pathFile Path of the file
     * @return String Arraylist File's content
     */
    public ArrayList<String> arrayListReadAllFile(String pathFile) {
        try {
            File name = new File(pathFile);
            BufferedReader input = new BufferedReader(new FileReader(name));
            ArrayList<String> temp = new ArrayList<>();
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

    /**
     * Function that permits you to return file's content from a specific line in a String
     *
     * @author Davide
     * @param pathFile Path of the file
     * @param nLine Start reading file from this line
     * @return String File's content from a specific line
     */
    public String stringReadAllFileFromLine(String pathFile, int nLine) {
        try {
            File name = new File(pathFile);
            BufferedReader input = new BufferedReader(new FileReader(name));
            ArrayList<String> tempTXT = new ArrayList<>();
            String txt;
            String temp = "";

            if (name.isFile()) {

                for (int i = 0; i < nLine - 1; i++) {
                    input.readLine();
                }

                while ((txt = input.readLine()) != null) {
                    tempTXT.add(txt);
                }
                input.close();
            }

            for (int i = 0; i < tempTXT.size(); i++) {
                if (i == tempTXT.size() - 1) {
                    temp += tempTXT.get(i);
                } else {
                    temp += tempTXT.get(i) + "\n";
                }
            }

            return temp;

        } catch (IOException ioException) {
            //visualizzo errore
            System.err.println("Read file error");
            return "";
        }
    }

    /**
     * Function that permits you to return the file's content from a specific line in a String ArrayList
     *
     * @author Davide
     * @param pathFile Path of the file
     * @param nLine Start reading file from this line
     * @return String Arraylist File's content from a specific line
     */
    public ArrayList<String> arrayListReadAllFileFromLine(String pathFile, int nLine) {
        try {
            File name = new File(pathFile);
            BufferedReader input = new BufferedReader(new FileReader(name));
            ArrayList<String> temp = new ArrayList<>();
            String txt;

            if (name.isFile()) {

                for (int i = 0; i < nLine - 1; i++) {
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
