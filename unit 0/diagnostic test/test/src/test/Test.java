//package test;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {

    public static void main(String[] args) throws Exception {
        
       FileReader fr = new FileReader("D:\\Data1.txt");
       BufferedReader br = new BufferedReader(fr);
       
       int n = Integer.parseInt(br.readLine());
       
       System.out.println("Number of cases: "+n+"\n\nProfit\t\tCopies Needed to Sell");
       
       for (int i=1; i<=n; i++){
       
           int m = Integer.parseInt(br.readLine());
           double num = m/0.7/0.99;
       
           if (num % 1 != 0.0) num+=1;
           
           int ans = (int)num;
           
           if (ans % 1000 == 0) ans = (ans/1000)*1000;
                   else ans = (ans/1000+1)*1000;
           
           System.out.println("$"+m+"\t\t"+ans);
       }
       
       br.close();
    }

}
