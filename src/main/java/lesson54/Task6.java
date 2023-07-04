package lesson54;

public class Task6 {
    public static void main(String[] args) {
        String a = args[0];
        System.out.println(toInt(a));
    }
    public static int toInt(String str) {
        int num=0;
        int pos =1;
        boolean flag = false;
        if(str.charAt(0)=='-'){
            str=str.substring(1);
            flag=true;
        }

        for(int i=str.length()-1;i>=0;i--){
            num+= (str.charAt(i)-'0')*pos;
            pos*=10;

        }
        if(flag){
            num=-1*num;
        }
        return num;
        }
}
