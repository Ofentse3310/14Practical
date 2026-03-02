import java.text.DecimalFormat;

import static java.util.Objects.hash;

public class Main {
    public static int N = 30;
    public static <insert> void main (String[]args){
        DecimalFormat twoD = new DecimalFormat("0.00");
        DecimalFormat fourD = new DecimalFormat("0.0000");
        DecimalFormat fiveD = new DecimalFormat("0.00000");

        int[] arr = new int[32654];
        for(int i = 0;i < arr.length; i++){
            arr[i] = i;
        }
        long start, finish;
        double runTime = 0, runTime2 = 0, time;
        //double totalTime = 0.0;
        int n = N;
        int repetition, repetitions = 30;


        for (repetition = 0; repetition < repetitions; repetition++) {
            start = System.currentTimeMillis();

            hash();



            finish = System.currentTimeMillis();

            time = (double) (finish - start);
            runTime += time;
            runTime2 += (time * time);
        }

        double aveRuntime = runTime / repetitions;

        System.out.print("\n\n\fStatistics\n");
        System.out.println("________________________________________________");
        System.out.println("Total time   =           " + runTime / 1000 + "s.");
        System.out.println("Total time²  =           " + runTime2);
        System.out.println("n            =           " + n);
        System.out.println("Average time / run =     " + fiveD.format(aveRuntime / n * 1000)
                + 'µ' + "s. ");

        System.out.println("Repetitions  =             " + repetitions);
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println();
    }

}