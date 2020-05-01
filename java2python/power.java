public class Power
{
    public static void main (String[] args)
    {
        System.out.println (power(1, 1024));
    }
    static double power (double x, int n)
    {
        if (n == 0)
        {
            return 1.0;
        }
        else if (n > 0)
        {
            if (n % 2 == 0)
            {
                int p = (int)power(x, n/2);
                //(x^(n/2))^2 = x^(n/2) * x^(n/2)
                return p * p;
            }
            else
            {
                //x^n = x*x^(n-1)
                return x * power(x, n-1);
            }
        }
        else
        {
            return 1.0 / power(x, -n);
        }
    }
}
