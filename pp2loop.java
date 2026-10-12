public class pp2loop {
    public static void main(String[] args) {
        int x;
        System.out.println("using for loop");
        for( x=2;x<=20;x+=2){
           System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("using while loop");
        x=2;
        while(x<=20){
            System.err.print(x+" ");
            x+=2;
        }
        System.out.println();
        System.out.println("using do while loop ");
        x=2;
        do{
            System.out.print(x+" ");
            x=x+2;
        }while(x<=20);

    }
}
