import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] ar)
    {
                  // complexity n^2.81
        Scanner ab=new Scanner(System.in);
        int[][] a=new int[2][2];
        int[][] b=new int[2][2];
        int[][] c=new int[2][2];
        int d1,d2,d3,d4,d5,d6,d7,x,y;
        for(x=0;x<2;x++)
        for(y=0;y<2;y++)
        a[x][y]=ab.nextInt();
        for(x=0;x<2;x++)
        for(y=0;y<2;y++)
        b[x][y]=ab.nextInt();
        d1= (a[0][0] + a[1][1]) * (b[0][0] + b[1][1]);
        d2= (a[1][0] + a[1][1]) * b[0][0];
        d3= a[0][0] * (b[0][1] - b[1][1]);
        d4= a[1][1] * (b[1][0] - b[0][0]);
        d5= (a[0][0] + a[0][1]) * b[1][1];
        d6= (a[1][0] - a[0][0]) * (b[0][0]+b[0][1]);
        d7= (a[0][1] - a[1][1]) * (b[1][0]+b[1][1]);
        c[0][0] = d1 + d4- d5 + d7;
        c[0][1] = d3 + d5;
        c[1][0] = d2 + d4;
        c[1][1] = d1 - d2 + d3 + d6;
        for(x=0;x<2;x++)
        {
            for(y=0;y<2;y++)
            System.out.print(c[x][y]+"\t");
            System.out.println();
        }
    }
}
