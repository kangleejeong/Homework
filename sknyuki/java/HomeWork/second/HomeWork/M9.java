public class M9 {
    public static void main(String[] args) {
        int Max1=90;
        int Min1=65;
        int Random1=(int)((Math.random()*(Max1-Min1)+Min1));

        int Max2=122;
        int Min2=97;
        int Random2=(int)((Math.random()*(Max2-Min2)+Min2));

        System.out.printf("첫번째 난수는 %d\t 두번째 난수는 %d",Random1,Random2);
    }
}
