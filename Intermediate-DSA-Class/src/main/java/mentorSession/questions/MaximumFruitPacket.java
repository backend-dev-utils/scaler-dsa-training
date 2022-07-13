package mentorSession.questions;

public class MaximumFruitPacket {
    public static void main(String[] args) {

    }

    public static int solve(int A, int B, int C) {
        int packetCount = 0;

        while(A >= 1 && B >= 1 && ((A + B + C) >= 3)){ // min 1 apple and 1 banana
            if(C >= 1){                             // at least one 1 cherry is present
                if(A >= 1 && B >= 1)
                {
                    packetCount++;
                    C--; A--; B--;
                }
            }else{
                if(A > 1 && B >= 1){
                    packetCount++;
                    A = A - 2;
                    B--;
                }else if(A == 1 && B >= 1) {
                    packetCount++;
                    B = B-2;
                    A--;
                }
            }
        }
        return packetCount;
    }
}