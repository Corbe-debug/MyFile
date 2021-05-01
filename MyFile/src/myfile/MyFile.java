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
 * @version 2.0
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
            ArrayList<String> tempTXT = new ArrayList<>();
            String txt;
            String temp = "";

            //Check if the file exists
            if (name.isFile()) {

                //Reading file...
                BufferedReader input = new BufferedReader(new FileReader(name));
                while ((txt = input.readLine()) != null) {
                    tempTXT.add(txt);
                }

                //Close reading
                input.close();

                //Convert ArrayList<String> in a String
                for (int i = 0; i < tempTXT.size(); i++) {
                    if (i == tempTXT.size() - 1) {
                        temp += tempTXT.get(i);
                    } else {
                        temp += tempTXT.get(i) + "\n";
                    }
                }

                //Return String
                return temp;

                //The file doesn't esist
            } else {
                System.err.println("File not found");
                return "";
            }

        } catch (IOException e) {
            //visualizzo errore
            System.err.println("Read file error");
            return "";
        }
    }

    /**
     * Function that permits you to return the file's content in a String
     * Arraylist
     *
     * @author Davide
     * @param pathFile Path of the file
     * @return String Arraylist File's content
     */
    public ArrayList<String> arrayListReadAllFile(String pathFile) {
        try {
            File name = new File(pathFile);
            ArrayList<String> temp = new ArrayList<>();
            String txt;

            //Check if the file exists
            if (name.isFile()) {

                //Reading file...
                BufferedReader input = new BufferedReader(new FileReader(name));
                while ((txt = input.readLine()) != null) {
                    temp.add(txt);
                }

                //Close reading
                input.close();

                //Return String ArrayList
                return temp;

                //The file doesn't esist
            } else {
                System.err.println("File not found");
                return null;
            }

            //Exception detected
        } catch (IOException ioException) {
            //visualizzo errore
            System.err.println("Read file error");
            return null;
        }
    }

    /**
     * Function that permits you to count file's lines
     *
     * @author Davide
     * @param pathFile Path of the file
     * @return int File's lines
     */
    public int nLines(String pathFile) {
        try {
            File name = new File(pathFile);
            ArrayList<String> temp = new ArrayList<>();
            String txt;

            //Check if the file exists
            if (name.isFile()) {

                //Reading file...
                BufferedReader input = new BufferedReader(new FileReader(name));
                while ((txt = input.readLine()) != null) {
                    temp.add(txt);
                }

                //Close reading
                input.close();

                //Counting lines...
                int lines = 0;
                int count = temp.size();
                if (count == 0) {
                } else {
                    lines = count;
                }

                //Return nLines
                return lines;

                //The file doesn't esist
            } else {
                System.err.println("File not found");
                return 0;
            }

            //Exception detected
        } catch (IOException ioException) {
            //visualizzo errore
            System.err.println("Read file error");
            return 0;
        }
    }

    /**
     * Function that permits you to return file's content from a specific line
     * in a String
     *
     * @author Davide
     * @param pathFile Path of the file
     * @param nLine Start reading file from this line
     * @return String File's content from a specific line
     */
    public String stringReadFileFromLine(String pathFile, int nLine) {
        try {
            File name = new File(pathFile);
            ArrayList<String> tempTXT = new ArrayList<>();
            String txt;
            String temp = "";

            //Check if the file exists
            if (name.isFile()) {

                //Check if the program can read from this line
                //Call function nLines(String pathFile)
                int n = nLines(pathFile);
                if (nLine > n) {
                    System.err.println("File's lines: " + n + " , you can't start read from line: " + nLine);
                    return "";
                }

                //Reading file...
                BufferedReader input = new BufferedReader(new FileReader(name));

                //Skip nLine -1 lines
                for (int i = 0; i < nLine - 1; i++) {
                    input.readLine();
                }

                //Read others lines and save them in a ArrayList<String>
                while ((txt = input.readLine()) != null) {
                    tempTXT.add(txt);
                }

                //Close reading
                input.close();

                //Convert ArrayList<String> in a String
                for (int i = 0; i < tempTXT.size(); i++) {
                    if (i == tempTXT.size() - 1) {
                        temp += tempTXT.get(i);
                    } else {
                        temp += tempTXT.get(i) + "\n";
                    }
                }

                //Return String
                return temp;

                //The file doesn't esist
            } else {
                System.err.println("File not found");
                return "";
            }

            //Exception detected
        } catch (IOException ioException) {
            System.err.println("Read file error");
            return "";
        }
    }

    /**
     * Function that permits you to return the file's content from a specific
     * line in a String ArrayList
     *
     * @author Davide
     * @param pathFile Path of the file
     * @param nLine Start reading file from this line
     * @return String Arraylist File's content from a specific line
     */
    public ArrayList<String> arrayListReadFileFromLine(String pathFile, int nLine) {
        try {
            File name = new File(pathFile);
            ArrayList<String> temp = new ArrayList<>();
            String txt;

            //Check if the file exists
            if (name.isFile()) {

                //Check if the program can read from this line
                //Call function nLines(String pathFile)
                int n = nLines(pathFile);
                if (nLine > n) {
                    System.err.println("File's lines: " + n + " , you can't start read from line: " + nLine);
                    return null;
                }

                //Reading file...
                BufferedReader input = new BufferedReader(new FileReader(name));

                //Skip nLine -1 lines
                for (int i = 0; i < nLine - 1; i++) {
                    input.readLine();
                }

                //Read others lines and save them in a ArrayList<String>
                while ((txt = input.readLine()) != null) {
                    temp.add(txt);
                }

                //Close reading
                input.close();

                //Return ArrayList<String>
                return temp;

                //The file doesn't exists
            } else {
                System.err.println("File not found");
                return null;
            }

            //Exception detected
        } catch (IOException ioException) {
            System.err.println("Read file error");
            return null;
        }
    }

    /**
     * Function that permits you to overwrite the file's content with your
     * String
     *
     * @author Davide
     *
     * @param pathFile Path of the file
     * @param text What you want to overwrite, from your String
     * @return boolean Result of the operations
     */
    public boolean overwriteFile(String pathFile, String text) {
        try {
            File name = new File(pathFile);
            BufferedWriter writer = new BufferedWriter(new FileWriter(name));

            //Overwriting file...
            writer.write(text);

            //Close overwriting
            writer.close();

            //Return result of the operations
            return true;

            //Exception detected
        } catch (IOException ioException) {
            System.err.println("Overwrite file error");
            return false;
        }
    }

    /**
     * Function that permits you to overwrite the file's content with your
     * String ArrayList
     *
     * @author Davide
     *
     * @param pathFile Path of the file
     * @param text What you want to overwrite, from your String Arraylist
     * @return boolean Result of the operations
     */
    public boolean overwriteFile(String pathFile, ArrayList<String> text) {
        try {
            File name = new File(pathFile);
            BufferedWriter writer = new BufferedWriter(new FileWriter(name));

            //Overwriting file...
            for (int i = 0; i < text.size(); i++) {
                if (i == text.size() - 1) {
                    writer.append(text.get(i));
                } else {
                    writer.append(text.get(i) + "\n");
                }
            }

            //Close overwriting
            writer.close();

            //Return result of the operations
            return true;

            //Exception detected
        } catch (IOException ioException) {
            System.out.println(ioException);
            return false;
        }
    }

    /**
     * Function that permits you to append your String at the end of the file
     *
     * @author Davide
     * @param pathFile Path of the file
     * @param text What you want to overwrite, from your String
     * @return boolean Result of the operations
     */
    public boolean appendToFile(String pathFile, String text) {
        try {
            File name = new File(pathFile);

            //Check if the file exists
            if (name.isFile()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(name, true));

                //Appending file...
                writer.append("\n" + text);

                //Close appending
                writer.close();

                //Return result of the operations
                return true;

                //The file doesn't exists
            } else {
                System.err.println("File not found");
                return false;
            }
            //Exception detected
        } catch (IOException ioException) {
            System.err.println("Overwrite file error");
            return false;
        }
    }

    /**
     * Function that permits you to append your String Arraylist at the end of
     * the file
     *
     * @author Davide
     * @param pathFile Path of the file
     * @param text What you want to overwrite, from your String Arraylist
     * @return boolean Result of the operations
     */
    public boolean appendToFile(String pathFile, ArrayList<String> text) {
        try {
            File name = new File(pathFile);

            //Check if the file exists
            if (name.isFile()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(name, true));

                //Appending file...
                for (int i = 0; i < text.size(); i++) {
                    writer.append("\n" + text.get(i));
                }

                //Close appending
                writer.close();

                //Return result of the operations
                return true;

                //The file doesn't exists
            } else {
                System.err.println("File not found");
                return false;
            }
            //Exception detected
        } catch (IOException ioException) {
            System.err.println("Overwrite file error");
            return false;
        }
    }

    /**
     * Function that permits you to append your String in a specific line. The
     * lines after this specific line will be shifted
     *
     * @author Davide
     * @param pathFile Path of the file
     * @param text What you want to append, from your String
     * @param nLines In which line you want to apped your String
     * @return boolean Result of the operations
     */
    public boolean appendToFileFromLine(String pathFile, String text, int nLines) {
        try {
            File name = new File(pathFile);
            ArrayList<String> temp = new ArrayList<>();
            String txt;

            //Check if the file exists
            if (name.isFile()) {

                //Reading file...
                BufferedReader input = new BufferedReader(new FileReader(name));
                while ((txt = input.readLine()) != null) {
                    temp.add(txt);
                }

                //Add String in position nLines
                temp.add(nLines - 1, text);

                //Overwriting file...
                BufferedWriter writer = new BufferedWriter(new FileWriter(name));

                for (int i = 0; i < temp.size(); i++) {
                    if (i == temp.size() - 1) {
                        writer.append(temp.get(i));
                    } else {
                        writer.append(temp.get(i) + "\n");
                    }
                }

                //Close overwriting
                writer.close();

                //Return result of the operations
                return true;

                //The file doesn't exists
            } else {
                System.err.println("File not found");
                return false;
            }
            //Exception detected
        } catch (IOException ioException) {
            System.err.println("Overwrite file error");
            return false;
        }
    }

    /**
     * Function that permits you to append your String ArrayList in a specific
     * line. The lines after this specific line will be shifted
     *
     * @author Davide
     * @param pathFile Path of the file
     * @param text What you want to append, from your String
     * @param nLines In which line you want to apped your String ArrayList
     * @return boolean Result of the operations
     */
    public boolean appendToFileFromLine(String pathFile, ArrayList<String> text, int nLines) {
        try {
            File name = new File(pathFile);
            ArrayList<String> temp = new ArrayList<>();
            String txtRead;

            //Check if the file exists
            if (name.isFile()) {

                //Reading file...
                BufferedReader input = new BufferedReader(new FileReader(name));
                while ((txtRead = input.readLine()) != null) {
                    temp.add(txtRead);
                }

                //Add String ArrayList in position nLines
                int c = nLines - 1;
                if (nLines - 1 < 0) {
                    c = 0;
                }
                
                for (int i = 0; i < text.size(); i++) {
                    temp.add(c, text.get(i));
                    c++;
                }

                //Overwriting file...
                BufferedWriter writer = new BufferedWriter(new FileWriter(name));

                for (int i = 0; i < temp.size(); i++) {
                    if (i == temp.size() - 1) {
                        writer.append(temp.get(i));
                    } else {
                        writer.append(temp.get(i) + "\n");
                    }
                }

                //Close overwriting
                writer.close();

                //Return result of the operations
                return true;

                //The file doesn't exists
            } else {
                System.err.println("File not found");
                return false;
            }
            //Exception detected
        } catch (IOException ioException) {
            System.err.println("Overwrite file error");
            return false;
        }
    }
}
