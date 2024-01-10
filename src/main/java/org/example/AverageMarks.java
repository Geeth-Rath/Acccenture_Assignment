package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageMarks {


    public void getStudentAverage(String [] stuarray){
        ArrayList <String> al = new ArrayList();
        for(String s : stuarray){
            int sum = 0;
            String sm [] = s.split("\\s");
            String name = sm[0] + " " +sm[1];

            for (int i = 2; i <= sm.length-1; i++) {
                sum = (Integer.valueOf(sm[i]) + sum);
//
            }
            int avgSum = sum / (sm.length-2);
            if (avgSum < 10){
                al.add(name+" - " + avgSum);
            }
        }
        for (String item: al){
            System.out.println(item);
        }


    }
}
