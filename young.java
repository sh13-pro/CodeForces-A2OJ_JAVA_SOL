import java.util.*;
import java.lang.*;
import java.io.*;
public class young {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
		int t = in.nextInt();
        int xsum=0;
        int ysum=0;
        int zsum=0;
		while(t-- != 0){
            
            int x=in.nextInt();
            int y=in.nextInt();
            int z=in.nextInt();
            xsum+=x;
            ysum+=y;
            zsum+=z;

        }
        if (xsum == 0 && ysum == 0 && zsum == 0)
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }
        

    }
    
}
