/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String path = "c:\\temp\\out.txt";
        String[] lines = {"Good morning", "Good afternoon", "Good night"};
        
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(path, true))) {
            for(String line : lines) {
                bf.write(line);
                bf.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}