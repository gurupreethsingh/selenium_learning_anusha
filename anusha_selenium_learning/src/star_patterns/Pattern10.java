package star_patterns;

public class Pattern10 {

	public static void main(String[] args)
	{
		 int num = 1; 
	  for(int i = 1; i<=5 ; i++)
	  {
         	int k = 1; 
		  for(int j = 1; j<=5; j++)
		  {
			  if(j%2 == 0)
			  {
				  System.out.print(num);
			  }
			  else
			  {
				  System.out.print(k);
				  k++;
			  }
		  }
		  System.out.println();
		  num++;
	  }
	}
}