public class Q1 {
    public static void main(String[] args) {
        final int max=122;
        final int min=65;

        int rand1 =(int) (Math.random()*(max-min+1)+min);

        boolean big = rand1>=65 && rand1<=90;
        boolean small = rand1>=97 && rand1<=122;

        System.out.printf("%c\n", rand1);

        while(!big && !small){
            int rand2 =(int) (Math.random()*(max-min+1)+min);
            if((rand2>=65 && rand2<=90) || (rand2>=97 && rand2<=122)){
                System.out.printf("%c\n", rand2);
                break;
            }
        }



    }
}
