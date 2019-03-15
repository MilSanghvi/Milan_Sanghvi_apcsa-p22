import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator; 
	
	//write two constructors
	public Rational()
	{
		setRational(1, 1);
	}

	public Rational(int a, int b)
	{
		setRational(a, b);
	}
	//write a setRational method
	
	public void setRational(int a, int b)
	{
		setNumerator(a);
		setDenominator(b);
	}
	//write  a set method for numerator and denominator

	public void setNumerator(int a)
	{
		numerator = a;
	}
	
	public void setDenominator(int b)
	{
		denominator = b;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		numerator = this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator();
		denominator = this.getDenominator() * other.getDenominator();
		
		reduce();
	}

	private void reduce()
	{
		int divide = gcd(numerator, denominator);
		numerator /= divide;
		denominator /= divide;
	}

	private int gcd(int numOne, int numTwo)
	{
		int smaller = Math.min(numOne, numTwo);
		int gcd = 1;
		for(int i = 1; i <= smaller; i++)
		{
			if(numOne % i == 0 && numTwo % i == 0) gcd = i;
		}

		return gcd;
	}

	public Object clone ()
	{
		Rational clone = new Rational(this.getNumerator(), this.getDenominator());
		return clone;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public boolean equals(Object obj) //how do we do it if it's type Object
	{
		Rational obj2 = (Rational)obj;
		this.reduce();
		obj2.reduce();
		
		return(this.getNumerator() == obj2.getNumerator() && this.getDenominator() == obj2.getDenominator());
	}

	public int compareTo(Rational other)
	{
		int difference = this.getNumerator() * other.getDenominator() - this.getDenominator() * other.getNumerator();
		if(difference > 0) return 1;
		else if(difference == 0) return 0;
		return -1;
	}
	
	//write  toString() method
	public String toString()
	{
		String output = "";
		
		output = this.getNumerator() + "/" + this.getDenominator();
		
		return output;
	}
	
}