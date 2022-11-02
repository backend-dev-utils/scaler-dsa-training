package advanced.classes.day_64.homework;

import java.util.HashMap;

public class PointsOnSameLine {
    public int solve(int[] A, int[] B) {
        int n=A.length,totalPoints=0,equal,maxi;
        HashMap<String,Integer> hm=new HashMap<>(); // we can also create HashMap inside the outer loop
        for(int i=0;i<n;i++){ // but then we have to remove #hm.clear() method.
            maxi=0;equal=0;
            for(int j=i+1;j<n;j++){
                if(A[i]==A[j] && B[i]==B[j]) equal++; //for points that are overlaping.
                else{
                    int x=A[j]-A[i]; //slope for any 2 points with co-ordinates (x,y) & (x1,y1)
                    int y=B[j]-B[i]; // is (y1-y)/(x1-x)
                    int gcd=GCD(y,x); // dividing every co-ordinates with their gcd to get smallest
                    String str=(x/gcd)+"*"+(y/gcd); // possible ratio and then converting them to string.
                    hm.put(str,hm.getOrDefault(str,0)+1);
                    maxi=Math.max(maxi,hm.get(str));
                }
            }
            totalPoints=Math.max(totalPoints,equal+maxi+1);// this extra 1 is added because for any
            // frequency in HashMap the count of corresponding or fixed point should also be counted
            hm.clear();
        }
        return totalPoints;
    }
    public int GCD(int x, int y){
        if(x==0) return y;
        return GCD(y%x,x);
    }
}
