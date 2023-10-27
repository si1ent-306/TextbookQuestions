public class tuitionCalculation {
    public static void main(String[] args){
        //Suppose the tuition for a university is $10,000 this year and increases 5% every year.
        double tuition = 10000.00;
        final double INTREST = 0.05;
        int year ;
        // In one year, the tuition will be $10,500.
        // Write a program that displays the tuition in 10 years,
        for(year = 0; year <= 10; year++ ){
            System.out.print(year + " : ");
            System.out.printf("%.2f%n",tuition);
            System.out.println();
            tuition += (tuition * INTREST);
        }
    }
}
