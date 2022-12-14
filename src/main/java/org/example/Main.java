package org.example;

public class Main {
    public static void printHearts(int count) {
        if(count < 0) {             // 입력 받은 카운트 변수가 음수일 경우
            count = -count;         // 변수를 양수로 바꿔준다.

            for (int i = 1; i <= count; i++) {  // 입력 받은 카운트 수 만큼의 행을 생성 해주는 for문
                for (int j = count; j >= i; j--) {  // 입력 받은 카운트 수 만큼의 하트를 출력 해주고 for문이 돌때마다 하나씩 감소
                    System.out.print("♡");
                }
                if(i == count) {
                    System.out.print("");           // 입력 받은 카운트 수 만큼의 행만 생성 되어야 되기 때문에 마지막은 행 생성을 안해준다.
                }
                else {
                    System.out.println("");         // 입력 받은 카운트에 도달하기 전까지 하트를 출력해주는 for문 마다 새로운 행 생성
                }
            }
        }

        else {                          // 입력 받은 카운트 변수가 양수일 경우
            for (int i = 1; i <= count; i++) {          // 입력 받은 카운트 수 만큼의 행을 생성 해주는 for문
                for (int j = 1; j<= i; j++) {           // 입력받은 카운트 값에 도달하기 전까지 하트를 출력해주는 for문 반복
                    System.out.print("♡");
                }

                if(i == count) {
                    System.out.print("");          // 입력 받은 카운트 수 만큼의 행만 생성 되어야 되기 때문에 마지막은 행 생성을 안해준다.
                }
                else {
                    System.out.println("");        // 입력 받은 카운트에 도달하기 전까지 하트를 출력해주는 for문 마다 새로운 행 생성
                }
            }
        }
    }

    public static void main(String[] args) {
        printHearts(-3);                     // printHearts 매서드 실행
    }
}