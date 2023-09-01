package programersBasicTest;

public class arrayCenter {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = {9,-1,0};
        int answer = s.solution(a);

        System.out.println(answer);
    }
}
class Solution {
    public int solution(int[] array) {
        int leng = array.length;
        int[] array2 = new int[leng];
        for(int i=0; i<leng; i++){
            for(int j=i; j<leng; j++){
                if(array[i]>=array[j]){
                    array2[i]=array[j];
                }
            }
        }

        for(int i=0; i<leng; i++){
            System.out.println("array2[i] = " + array2[i]);
        }
        System.out.println(leng/2);
        int answer = array2[(leng/2)];
        return answer;
    }
}