package com.example.CSVtoLlist;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CSVtoList {
    public static void main(String[] args) {
        List<List<String>> records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader("/Users/shrinepro1/Downloads/CSVtoLlist/Transaction_20230116134931.csv"));)
        {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));

            }
            HashSet<String> date= new HashSet<>();
            for(int i=1;i<records.size();i++){

                if(records.get(i).get(1).equals("41"))    // if you want to find some details using id
                {
                    date.add(records.get(i).get(4));
                    System.out.println("Name="+records.get(i).get(2)+",   "+"Employee Id="+records.get(i).get(1)+",   "+"Date:"+records.get(i).get(4)+  "    Time:"+records.get(i).get(5)+","+"    Type- "+records.get(i).get(6));
                }

            }
            ArrayList<String> filter= new ArrayList<>();
            for(String da:date){
                for(int i=1;i<records.size();i++){
                    if(records.get(i).get(1).equals("1")){

                        if(records.get(i).get(4).equals(da)){
                            filter.add(records.get(i).get(5)+records.get(i).get(6));
                        }

                    }
                }
                System.out.println("date is:-"+da+"And value is  "+filter);
                filter.clear();
            }
           // System.out.println(date);
          //  System.out.println("here is one record"+records.get(2));


        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
