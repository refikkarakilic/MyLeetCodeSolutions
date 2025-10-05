package easy;

public class judgeCircle {

    public boolean judgeCircle(String moves) {

        int[] array = {0,0};
        char C;

        for(int i=0;i<moves.length();i++){
            C = moves.charAt(i);

            if (C == 'U' || C == 'D'){
                    if (C== 'U') array[0]++;
                else {
                    array[0]--;
                }}
                if(C == 'L' || C == 'R') {
                    if(C=='R') array[1]++;
                    else array[1]--;
            }


                }
                boolean result = (array[0] ==0 && array[1]==0);
        return result;
            }


        }






