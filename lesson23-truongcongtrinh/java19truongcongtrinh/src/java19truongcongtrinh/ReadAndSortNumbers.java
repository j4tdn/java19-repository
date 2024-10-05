package java19truongcongtrinh;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ReadAndSortNumbers {

    public static void main(String[] args) {
        String inputFileName = "input_success.txt";
        String outputFileName = "output.txt";
        List<Integer> numbers = new ArrayList<>();

        try {
        	// Đọc file cùng cấp với src
        	BufferedReader reader = new BufferedReader(new FileReader("input_success.txt"));
        	
        	// Đọc file từ classpath 
//        	InputStream inputStream = ReadAndSortNumbers.class.getResourceAsStream("/input_success.txt");
//        	BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = reader.readLine();
            
            int n = Integer.parseInt(line.trim());

            List<String> inputStrings = new ArrayList<>();
            
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                inputStrings.add(line);
                lineCount++;
            }
            reader.close();

            if (lineCount != n) {
                System.out.println("Lỗi: Số lượng chuỗi nhập vào không khớp với giá trị n = " + n);
                System.out.println("Số chuỗi thực tế là: " + lineCount);
                return;
            }

            Pattern pattern = Pattern.compile("\\d+");

            for (String str : inputStrings) {
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    String numStr = matcher.group();
                    int number = Integer.parseInt(numStr);
                    numbers.add(number);
                }
            }

            Collections.sort(numbers);

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            for (int number : numbers) {
                writer.write(String.valueOf(number));
                writer.newLine();
            }
            writer.close();

            System.out.println("File đã được xử lý thành công và kết quả đã ghi vào " + outputFileName);

        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy file " + inputFileName);
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc hoặc ghi file");
        } catch (NumberFormatException e) {
            System.out.println("Lỗi định dạng số trong file input");
        }
    }
}
