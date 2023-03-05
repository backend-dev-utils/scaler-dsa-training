package advanced.classes.day_50.assignment;

public class DeleteOne {
    public static void main(String[] args) {

    }

    public int solve(int A[]){
        int n=A.length-1;

        //int lgcd[]=new int[A.length];

        //build an array for right gcd just like right prefix sum

        int rgcd[]=new int[A.length];

        rgcd[n]=A[n];

        for(int i=n-1;i>=0;i--)

        {

            int gcd=calcGCD(A[i],rgcd[i+1]);

            rgcd[i]=gcd;

        }

//Calculate left gcd while traversing the array and at the same time also check //maxGCD

        int lgcd=A[0];

        int maxGCD=Integer.MIN_VALUE;

        for(int i=0;i<=n;i++)

        {

//condition 1. when i==0 then there is no left gcd available

//only need to pick the right gcd of i+1

            if(i==0)

            {

                maxGCD=Math.max(rgcd[i+1],maxGCD);

                continue;

            }

//condition 2. when we delete the last element of the array in that case we only need

//the left gcd till previous element.

            if(i==n)

            {

                maxGCD=Math.max(lgcd,maxGCD);

                lgcd=calcGCD(lgcd,A[i]);

                break;

            }

//condition 3: if your are deleting any element besides 0th or the last element

//in that case calculate gcd of lgcd till previous element and rgcd off i+1 element.

            int curGCD=calcGCD(lgcd,rgcd[i+1]);

            maxGCD=Math.max(curGCD,maxGCD);

            lgcd=calcGCD(A[i],lgcd);

        }

        return maxGCD;



    }



//method to get the gcd of two numbers

    public int calcGCD(int a,int b)

    {

        while(a>0)

        {

            int temp=a;

            a=b%a;

            b=temp;

        }

        return b;

    }
}

/**
 * Cheated from discussion tab
 */