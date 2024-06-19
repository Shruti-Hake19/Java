package jprograms;

public class StringDeclare {
    public static void main(String[]args){
        String str1="java";
        System.out.println(str1);

        String str2=new String("java");
        System.out.println(str2);

        char[]ch = {'j','a','v','a'};
        String str3 = new String(ch);
        System.out.println(str3);

        String str4 = new String(ch,2,2);
        System.out.println(str4);

        byte[]bt = {10,34,56,23,8};
    }

}
