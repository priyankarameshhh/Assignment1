package test;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		int n = s1.nextInt();
		
		if(n > 5 && n < 8)
		{
			for(int i =n; i>0; i--)
			{
				System.out.println("Distance to run: "+ i);
				if ( i == n-1)
					System.out.println("Good work keep it up");
				if ( i < 3)
					System.out.println("Almost there");
				if ( i == 1)
					System.out.println("Done for the day");
					
			}
		}
		else
		{
			System.out.println("Choose distance between 5 and 8");
		}
		
		

	}

}




























package test;

public class Question2 {
	

	public static void main(String[] args) {
		
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		int n= arr.length;
		int sum=0;
		int max=0;
		
		for(int i=0; i <n ; i++)
		{
			sum= sum + arr[i];
			if(sum > max)
			{
				max = sum;
			}
			if( sum < 0)
			{
				sum=0;
			}
		}
		System.out.println(max);		
		
	}

}





























package test;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int n = s1.nextInt();
		int arr[]= new int[n];
		int sum=0;
		
		for(int i=0; i < n; i++)
		{
			arr[i]= s1.nextInt();
			
		}
		for(int i=0; i< n; i++)
		{
			sum= sum + arr[i];
		}
		
		if( sum % 2 == 0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	
		
		
		

	}

}
























package test;


public class Question4 {



public static int min(int arr[],int l,int h)

   {

       if (h == l)

           return 0;

       if (arr[l] == 0)

           return Integer.MAX_VALUE;

       int min = Integer.MAX_VALUE;

       for (int i=l+1;i<=h && i<=l+arr[l];i++) 

       {

           int jump= min(arr, i, h);

           if (jump!= Integer.MAX_VALUE && jump+1<min)

           {

               min = jump+1;

           }

       }

       return min;

   }


   public static void main(String args[])

   {

       int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };

       int n = arr.length;

       System.out.print(min(arr, 0, n - 1));

   }



}





























package test;



public class Question5 {

public static void main(String[] args)

{

    int n=8;

    String arr[]

        = { "Manoj Kumar","Tom Hanks","Manoj Bajpayee","Tom Cruise","John Wick","Alice Smith","Alice wonderland","John Cena"};

    String swap;

    for (int i=0;i<n;i++)

    {

        for (int j=i+1;j<n;j++) 

        {

            if (arr[i].compareTo(arr[j])>0){

                swap = arr[i];

                arr[i] = arr[j];

                arr[j] = swap;

            }

        }

    }

    for (int i=0;i<n;i++) 

    {

       System.out.println(arr[i]);

    }

}

}
