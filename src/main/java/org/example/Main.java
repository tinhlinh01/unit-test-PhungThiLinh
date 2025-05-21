package org.example;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        // Tạo danh sách điểm
        List<Double> scores = Arrays.asList(9.0, 7.5, 8.5, 6.0, 10.0, -1.0, 11.0);

        // Tạo đối tượng StudentAnalyzer
        StudentAnalyzer analyzer = new StudentAnalyzer();

        // Gọi hàm countExcellentStudents
        int excellentCount = analyzer.countExcellentStudents(scores);

        // In kết quả ra màn hình
        System.out.println("Số học sinh đạt loại Giỏi: " + excellentCount);

    }
}