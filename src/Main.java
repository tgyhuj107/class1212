import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        String str1=scn.nextLine();
//        int n=Integer.parseInt(str1);
//        for (int r=1;r<=n;r++){
//            String str=scn.nextLine();
//            String data[]=str.split(" ");
//            for (int i=0;i<data.length;i++){
//                for (int j=i+1;j<data.length;j++){
//                    if ((int)(data[i].charAt(0))<(int)(data[j].charAt(0))){
//                        String table=data[i];
//                        data[i]=data[j];
//                        data[j]=table;
//                    }else if ((int)(data[i].charAt(0))==(int)(data[j].charAt(0))&&Integer.parseInt(data[i])>Integer.parseInt(data[j])){
//                        if (Integer.parseInt(data[i])>Integer.parseInt(data[j])){
//                            String table=data[i];
//                            data[i]=data[j];
//                            data[j]=table;
//                        }
//                    }
//                }
//            }
//            for (int i=0;i<data.length;i++){
//                System.out.print(data[i]+" ");
//            }
//            System.out.println();
//        }

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
//        int n=Integer.parseInt(scn.nextLine());
//        for (int i=0;i<n;i++){
//            String str =scn.nextLine();
//            String[] strData=str.split(" ");
//            int m=strData.length;
//            int data[]=new int[m];
//            for (int j=0;j<m;j++){
//                switch (strData[j].charAt(0)){
//                    case 'C':
//                        data[j]=0;
//                        break;
//                    case 'D':
//                        data[j]=13;
//                        break;
//                    case 'H':
//                        data[j]=26;
//                        break;
//                    case 'S':
//                        data[j]=39;
//                        break;
//                }
//                data[j]=data[j]+Integer.parseInt(strData[j].substring(1));
//            }
//            for (int j=0;j<m;j++){
//                for (int k=j+1;k<m;k++){
//                    if (data[j]<data[k]){
//                        int x=data[j];
//                        data[j]=data[k];
//                        data[k]=x;
//                        String table=strData[j];
//                        strData[j]=strData[k];
//                        strData[k]=table;
//                    }
//                }
//            }
//            for (int j=0;j<strData.length;j++){
//                System.out.print(strData[j]+" ");
//            }
//            System.out.println();
//        }
        //OOXX
//        int [][] data=new int[3][3];
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                data[i][j]=scn.nextInt();
//            }
//        }
//        for (int i=0;i<3;i++){
//            if (data[i][0]==data[i][1] && data[i][1]==data[i][2]){
//                System.out.println("True");
//                break;
//            }else if (data[0][i]==data[1][i] && data[1][i]==data[2][i]){
//                System.out.println("True");
//                break;
//            }else if (data[0][0]==data[1][1]&&data[1][1]==data[2][2]){
//                System.out.println("True");
//                break;
//            }else if (data[0][2]==data[1][1]&&data[1][1]==data[2][0]){
//                System.out.println("True");
//                break;
//            }else {
//                System.out.println("False");
//                break;
//            }
//        }
        //
//        int a =scn.nextInt(),b=scn.nextInt();
//        int[][] data=new int[a][b];
//        for (int i=0;i<a;i++){
//            for (int j=0;j<b;j++){
//                data[i][j]=scn.nextInt();
//            }
//        }
//        for (int i=0;i<b;i++){
//            for (int j=0;j<a;j++){
//                System.out.print(data[j][i]+" ");
//            }
//            System.out.println();
//        }
        //
        String str =scn.nextLine();
        int n=str.split(" ").length;
//        System.out.println((int)'Z'-(int)'a');
        int[] data1=new int[26];
        int[] data2=new int[26];
        for (int i=0;i<str.length();i++){
            int m=str.charAt(i)-'a';
            if (m>=0&&m<26){
                data1[i]++;
            }else {
                m=str.charAt(i)-'A';
                if (m>=0&&m<26){
                    data2[i]++;
                }
            }
        }
        for (int i=0;i<data1.length;i++){
            if (data1[i]!=0){
                System.out.println(((char) (int)('a')+i)+":"+data1[i]);
            }
        }
        for (int i=0;i<data2.length;i++){
            if (data2[i]!=0){
                System.out.println(((char) (int)('a')+i)+":"+data1[i]);
            }
        }






    }
}
