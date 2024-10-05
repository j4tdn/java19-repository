package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            StringBuilder number = new StringBuilder();
            for(int j = 0; j < line.length(); j++){
                char ch = line.charAt(j);
                if(Character.isDigit(ch)){
                    number.append(ch);
                }else {
                    if(!number.isEmpty()){
                        numbers.add(Integer.parseInt(number.toString()));
                        number.setLength(0);
                    }
                }
            }
            if(!number.isEmpty()){
                numbers.add(Integer.parseInt(number.toString()));
            }
        }
        br.close();
        Collections.sort(numbers);

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        for (int number : numbers) {
            bw.write(String.valueOf(number));
            bw.newLine();
        }
        bw.close();
    }
}

