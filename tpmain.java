package tppack;
import java.util.*;
public class tpmain {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter a whole number");
		int nb = scr.nextInt();
		CollectNbr a = new CollectNbr(nb);
		a.VerifierNombre(a.nbr);
	}

}