package day11.review.inner;

public class Main {
    /**
     * 내부 클래스
     * static, private 사용할 수 있다
     */
    private static class SubCalculator implements Calculator{
        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] view){

        Calculator cal1= new AddCalculator();
        int r1 = cal1.operate(10, 20);
        System.out.println("r1 = " + r1);

        Calculator cal2 = new SubCalculator();
        int r2 = cal2.operate(30, 10);
        System.out.println("r2 = " + r2);

        /*
        * 익명 클래스*/
        Calculator cal3 = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1*n2;
            }
        };
        int r3 = cal3.operate(6,9);
        System.out.println("r3 = " + r3);

        /*
        * 람다식*/
        Calculator cal4 = (n1, n2) -> n1/n2;
        int r4 = cal4.operate(81,3);
        System.out.println("r4 = " + r4);
    }
}
