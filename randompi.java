class randompi
{
	public static void main(String[] args)
	{
		calc();
	}
	static double gcd(double a,double b)
	{
		if (a == 0 || b == 0)
			return 0;	
		if (a == b)
			return a;
		if (a > b)
			return gcd(a-b, b);
		return gcd(a, b-a);
	}
	static int coprime(double a, double b) {
		int cnt=0;
		if ( gcd(a, b) == 1)
			cnt++;
		return cnt;
	}
	static double calc()
	{
		double a,b;
		int c=0;
		int ranges = 1024;
		double sample_size=10000;
		for(int i=0;i<sample_size;i++)
		{
			a = (int) ((Math.random() * ranges));
			b = (int) ((Math.random() * ranges));
			c += coprime(a, b);
		}
		System.out.println("SS is "+sample_size+" range is "+ranges);
		System.out.println(c+" coprimes");
		double pi = Math.sqrt(6/((double)c/sample_size));
		System.out.println("pi " + pi);	
		return pi;
	}
	
}
