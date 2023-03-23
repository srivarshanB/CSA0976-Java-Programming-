import java.io.*;
class dec_to_bin
{
    public static int reverseBits(int n)
    {
        int rev=0;
        while(n>0) 
	{
            rev<<=1;
            if ((int)(n & 1) == 1)
                rev ^= 1;
            n>>=1;
        }
        return rev;
    }
    public static void main(String arg[])
    {
        int n = 11;
        System.out.println(reverseBits(n));
    }
}