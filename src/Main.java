import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String str1=scn.nextLine();
        int n=Integer.parseInt(str1);
        for (int r=1;r<=n;r++){
            System.out.println("a");
            String str=scn.nextLine();
            String data[]=str.split(" ");
            for (int i=0;i<data.length;i++){
                for (int j=i+1;j<data.length;j++){
                    if ((int)(data[i].charAt(0))<(int)(data[j].charAt(0))){
                        String table=data[i];
                        data[i]=data[j];
                        data[j]=table;
                    }else if ((int)(data[i].charAt(0))==(int)(data[j].charAt(0))){
                        if (Integer.parseInt(data[i])>Integer.parseInt(data[j])){
                            String table=data[i];
                            data[i]=data[j];
                            data[j]=table;
                        }
                    }
                }
            }
            System.out.println("d");
            for (int i=0;i<data.length;i++){
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }

        //**
//        String str=scn.nextLine();
//        String s[]=str.split(" ");
//        for (int i=0;i<s.length;i++){
//            System.out.print(s[i]+" ");
//        }
//        String n=scn.nextLine();
//        int a=Integer.parseInt(n);
//        for (int i=0;i<a;i++){
//
//            String str =scn.nextLine();
//            System.out.println(str);
//
//        }
    }
}
