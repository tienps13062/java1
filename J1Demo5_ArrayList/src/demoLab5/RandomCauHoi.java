/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoLab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class RandomCauHoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Câu hỏi thứ %d: ", list.size());
            String cauHoi = scanner.nextLine();

            list.add(cauHoi);
        }

        Collections.shuffle(list);

        for (String x : list) {
            System.out.println(x);
        }
    }
}
