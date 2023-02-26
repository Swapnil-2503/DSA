


import java.util.*;

public class fifth{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        int a=0;
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='1' && a<5){
                a++;
            }
            else{
                ans=ans+s.substring(i-a,i);
              if(a==5){
                ans=ans+'0';
              }
              a=0;
            }
        }
        ans=ans+s.substring(i-a,i);
        System.out.print(ans);
    }
}