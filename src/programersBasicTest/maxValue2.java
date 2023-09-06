package programersBasicTest;

public class maxValue2 {
    public static void main(String[] args) {
        //내가 하고 싶은 것: 전부 곱한 버전의 배열을 구한 후 거기서 최댓값 뽑아내기
        int answer=0;
        int[] a = {1, 9, 10};
        int leng =0;
        for(int i=1; i<a.length; i++){
            leng += i;
        }
        //a 배열을 전부 곱한 버전인 배열 b 구하기
        int[] b = new int[leng];
        int count = 0;
        for(int i = 0; i<(a.length-1); i++){
            for(int j = i+1; j<a.length; j++){
                b[count]=a[i]*a[j];
                count++;
            }
        }
        //둘 씩 비교하여 최댓값 구하기
        if(leng>1) {
            answer = Math.max(b[0], b[1]);
            for (int i = 1; i < b.length - 1; i++) {
                if (answer < Math.max(b[i], b[i + 1])) {
                    answer = Math.max(b[i], b[i + 1]);
                }
            }
        }else{
            answer = b[0];
        }
        for(int i=0; i<b.length;i++){
            System.out.println("b["+i+"] = " + b[i]);
        }
        System.out.println("answer = " + answer);
    }
}
