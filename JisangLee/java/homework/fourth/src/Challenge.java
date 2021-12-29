public class Challenge {
    public static void main(String[] args) {
        // 1. 1 ~ 100 을 순회한다. (순차 순회할 필요는 없다) - 방어 루틴 안쓸거라
        // 2. 루프 내에서 난수 값을 할당 받는다.
        // 3. 현재 i값이 난수의 배수인지 판정한다.
        // 4. 배수라면 출력하고 sum에 합산
        //    아니라면 i에 가장 가까운 i 보다 큰 난수(랜덤) 배수값을 찾아서 출력하고 합산한다.
        //    또한 현재 i 값은 랜덤값의 배수가 아니므로 출력한 값으로 i값을 갱신한다.
        // 5. 다시 루프를 돌면서 위의 작업들을 반복한다면
        //    방어루틴이 없어도 안정된 동작을 보일 것이다.

        //final int START = 1;  //시작값 설정

        final int END = 100;  //끝값 설정

        final int MAX = 10;
        final int MIN = 2;
        final int REMAIN = 0;
        int range = MAX - MIN + 1;
        int rand = 0;


        int sum = 0;

        int distance = 0;

        //랜덤함수가 3이 나와 배수가 3이 나오고
        //랜덤함수가 5가 나와 배수가 5가 나오고
        //랜덤함수가 2가 나와 배수가 6이 나오고
        //랜덤함수가 3이 나와 배수가 9가 나오고
        //3 5 6 9로 이동하였으니 2,1,3 이동


        int multiple = 0;
        for(int cnt=1; cnt<=END; cnt += distance) {
            rand = (int)(Math.random() * range + MIN);

            if(cnt % rand == REMAIN) {
                System.out.printf("%d의 배수를 출력: %d\n", rand, multiple);
                sum += multiple;
                distance = sum - multiple;
               //

            }

            System.out.printf("총합: %d\n",sum );
        }


    }
}

