import java.util.Scanner;


//TOTAL TIME COMPLEXITY -> O( n*n )
//TOTAL SPACE COMPLEXITY -> O( n )

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        //TimeComplecity -> O(n)
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        printZeroSum(arr);
    }

    public static void printZeroSum(int[] arr)
    {

        //TimeComplexity ->  O(n*n)
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                if(sum==0)
                {
                    printAns(i,j,arr);
                }

            }
        }
    }

    private static void printAns(int i, int j, int[] arr) {
        //TimeComplexity -> O(n)
        for(int k=i;k<=j;k++)
        {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
}