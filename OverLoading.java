public class OverLoading {
    int add( int a, int b ){
        return a + b;
    }
    int add( int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        OverLoading sum = new OverLoading();
        System.out.println(sum.add(2,5));
        System.out.println(sum.add(2,5,7));
    }

}

    