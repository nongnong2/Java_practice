import java.util.Scanner;

/* 자료형[] 배열이름 = new 자료형 [배열크기]
배열의 반복은 enhanced for문을 사용하면 편함
for(요소:배열){
    반복할 문장
}*/
//입력받은 숫자만큼 배열에 채워넣기 
class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇개의 수를 넣으시겠습니까? : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("무슨 수를 넣으시겠습니까? : ");
            int input_num = sc.nextInt();
            arr[i] = input_num;
        }
        sc.close();
        //배열 반복 출력
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

        System.out.print('\n');
        //배열 반복 출력 - enhanced for 문 
        for(int e: arr){
            System.out.print(e);
        }
    }
}