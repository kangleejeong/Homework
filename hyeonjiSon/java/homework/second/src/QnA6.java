public class QnA6 {
    public static void main(String[] args) {

        int ran;

        //무한반복
        //while : ~하는 동안
        //while(참) : 참인 동안
        //참인 '동안'이니까 무한반복 한다는 뜻
        while (true){
            ran = (int)(Math.random() * 58 + 65);

            if(65 <= ran) {
                if (ran <= 90) {
                    System.out.printf("rand: %c(%d)\n", ran, ran);
                }
            }

            if(97 <= ran) {
                if (ran <= 122) {
                    System.out.printf("rand: %c(%d)\n", ran, ran);
                }
            }
        }
    }
}
