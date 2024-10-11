package tppack;

public class CollectNbr {
	int nbr;
	public CollectNbr(int a)
	{
		nbr = a;
	}
	void VerifierNombre(int n)
	{
		if(n%2==0)
			System.out.println("the number "+n+" is even");
		else
			System.out.println("the number "+n+" is odd");
	}
}
