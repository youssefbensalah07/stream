import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class A extends Thread {
    public void run(){
        for (int i = 1; i <= 100; i++) {
           // System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


    class B extends Thread {
        public void run(){
            for (int i = 1; i <= 100; i++) {
                //System.out.println("hi");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            }
        }

        public class Main {
            public static void main(String[] args) {


                List<Integer> nums = Arrays.asList(1, 8, 7, 6, 3,4);

                Stream<Object> result = nums.stream()
                        .filter(n -> n%2 == 0 )
                        .map(n ->n*2 );


                result.forEach(n-> System.out.println(n));




                List<Integer> num  = Arrays.asList(1, 8, 7, 6, 3,4);

                int res = num.stream()
                        .filter(n -> n%2 == 0 )
                        .map(n ->n*2 )
                        .reduce(0,(c,e)->c+e);
                System.out.println(res);





                //data.forEach(System.out::println);


                int[][] num = new int[3][4];

                for (int i = 0; i < num.length; i++) {

                    for (int j = 0; j < num[i].length; j++) {

                        // double v = Math.random() * 10;
                      //  num[i][j] = (int) (Math.random() * 2);

                    }

                }
                for (int i = 0; i < num.length; i++) {

                    for (int j = 0; j < num[i].length; j++) {

                        //System.out.print(" " + num[i][j]);


                    }
                    //System.out.println(" ");


                }
                //Exmpl A1 = new Exmpl();
               // A1.brand = "Ios";
               // A1.price = 2000;
               // Exmpl.name = "smart";
                // A1.show();
                //Exmpl.show1(A1);
            A obj1 =new A();
            B obj2 =new B();

            //obj1.start();
              try {
                  Thread.sleep(2);
              }catch (InterruptedException e){e.printStackTrace();}

            //obj2.start();



            }
        }







