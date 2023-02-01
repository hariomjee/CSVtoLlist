package com.example.CSVtoLlist;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CSVto {

    public static void main(String[] args) throws IOException, CsvException {
        List<String> q = new ArrayList<>();
        List<String> q1 = new ArrayList<>();
        List<String> q2 = new ArrayList<>();
        List<String> q3 = new ArrayList<>();
        List<String> q4 = new ArrayList<>();
        List<String> q5= new ArrayList<>();
        List<String> q6 = new ArrayList<>();
        List<String> check_in = new ArrayList<>();
        List<String> checkk_out = new ArrayList<>();
        Map<Integer,String> xyz = new HashMap<>();
        Map<String,List<String>> abc = new HashMap<>();
        Map<Integer,String> xyz1 = new HashMap<>();
        String fileName = "/Users/shrinepro1/Downloads/CSVtoLlist/Transaction_20230116134931.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();
            r.forEach(x-> abc.put(x[1], Arrays.stream(x).toList()));
            r.forEach(x -> q.add(x[1]));
            r.forEach(x -> q1.add(x[2]));
            r.forEach(x -> q2.add(x[3]));
            r.forEach(x -> q3.add(x[4]));
            r.forEach(x -> q4.add(x[5]));
            r.forEach(x -> q5.add(x[6]));
            r.forEach(x -> q6.add(x[7]));
            System.out.println("========"+q);
            System.out.println("========"+q1);
            System.out.println("========"+q2);
            System.out.println("========"+q3);
            System.out.println("========"+q4);
            System.out.println("========"+q5);
            System.out.println("========"+q6);

            for(int i = 0 ;i<q5.size();i++)
            {
                if(q5.get(i).toLowerCase().equals("check in") )
                {
                    xyz.put(Integer.parseInt(q.get(i)),q5.get(i));
                }
                else if(q5.get(i).toLowerCase().equals("check out"))
                {
                    xyz1.put(Integer.parseInt(q.get(i)),q5.get(i));
                }
            }
            System.out.println("****CHECK IN*****"+xyz);
            System.out.println("****CHECK OUT*****"+xyz1);
            System.out.println("++++++++++++++"+abc.keySet());

            for(int i =0 ; i< abc.size() ; i++)
            {
                if(abc.keySet().contains("41"))
                {
                    if(abc.values().contains("Check In"))
                    {
                    }
                }
            }

        }
//
        catch (Exception e){

        }


    }
}
