package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class NumberExtractor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/test/input.txt"));
        int n = Integer.parseInt(reader.readLine().trim());
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            int length = line.length();
            String tempNumber = "";

            // cách xử lý chưa hay, còn dài
            for (int j = 0; j < length; j++) {
                char currentChar = line.charAt(j);

                if (Character.isDigit(currentChar)) {
                    // khi cộng chuỗi trong vòng lặp nhiều chuỗi, nên sử dụng StringBuilder hoặc StringBuffer nếu bài toán
                    // đa luồng
                    tempNumber += currentChar;
                } else {
                    if (!tempNumber.equals("")) { // thay thế bằng isEmpty
                        numbers.add(Integer.parseInt(tempNumber));
                        tempNumber = "";
                    }
                }
            }

            if (!tempNumber.equals("")) {
                numbers.add(Integer.parseInt(tempNumber));
            }
        }
        reader.close();
        Collections.sort(numbers);

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/test/output.txt"));
        for (Integer number : numbers) {
            writer.write(number.toString());
            writer.newLine();
        }
        writer.close();
    }
}
