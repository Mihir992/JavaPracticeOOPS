public class StarPatternPrg {
    public static void main(String[] args) {

        //Right Angled Triangel Star pattern Program in java
        //1
        //2  2
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
              System.out.println("");
        }

        //1
        //1 2
        int num1=5;
        for(int i=1;i<=num1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

        //Star Pattern Program
        //*
        //**
        int num2=5;
        for(int i=1;i<=num2;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //Star Pattern Program with spaces

    }
}