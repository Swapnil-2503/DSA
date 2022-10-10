package String;

public class practise1 {
    public static void main(String[] args) {
        String a="baccdac";//remove a from string
        String b="You have apple you are healthy"; //skeep apple
        String ans="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='a'){
                ans=ans+a.charAt(i);
            }
        }

        String word="apple";
        String anss="";
        String ans2="";
        for(int i=0;i<b.length();i=i++){
           if(b.charAt(i)!=' '){
            ans2=ans2+b.charAt(i);
           }
           else{
            if(ans2!=word){
               anss=anss+ans2;
            }
            ans2="";
           }
        }
        //System.out.println(ans);
        System.out.println(anss);
    }
}
