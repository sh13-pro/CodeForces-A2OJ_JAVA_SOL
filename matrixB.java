import java.util.*;
import java.lang.Math;
import java.io.*;
public class matrixB {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
            int x = 0;
            for (int i = 1; i <= 5; ++i)
            {
               for (int j = 1; j <= 5; ++j)
                {
                   x=in.nextInt();
                   if (x == 1)
                    {
                        System.out.println(Math.abs(i - 3) + Math.abs(j - 3));
                    }
                }
            }
        }

    }  

