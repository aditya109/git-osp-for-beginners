import java.util.Scanner;

public class ShowShape{
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);

        
        String repeat="y";
        
        while(repeat.equalsIgnoreCase("y")){

            System.out.println("\n=================================================================");
            System.out.println("=\t\t     PROGRAM SHOW SHAPE AREA\t\t\t=");
            System.out.println("=================================================================");
            System.out.println("=   LIST OF THE SHAPE :\t\t\t\t\t\t=");
            System.out.println("=   * SQUARE\t\t\t\t\t\t\t=");
            System.out.println("=   * TRIANGLE\t\t\t\t\t\t\t=");
            System.out.println("=================================================================");

            Scanner ipt = new Scanner(System.in);
            int a;
            int b;
            String shape;
            System.out.print("\nInput the shape what you need it : ");
            shape = ipt.nextLine();

            if(shape.equalsIgnoreCase("triangle")){
                int base,height;
                
                System.out.println(" ");
                System.out.print("Input side 1 : ");
                base = ipt.nextInt();
                System.out.print("Input side 2 : ");
                height = ipt.nextInt();
                
                float areaTriangle = (float) base * height;
                areaTriangle/=2;
                System.out.println("\nArea of the triangle is " + areaTriangle);
                System.out.println(" ");
                if(base==height){
                    for(a=base;a>=1;a--){
                        for(b=a;b<height;b++){
                            System.out.print(" * ");
                        }
                        System.out.print(" * \n");  
                    }
                }
                else{
                    System.out.println("Input failure, this is not Equilatrtal Angled Triangle");
                }
            }
            else if(shape.equalsIgnoreCase("square")){
                int side1,side2;
                
                System.out.println(" ");
                System.out.print("Input side 1 : ");
                side1 = ipt.nextInt();
                System.out.print("Input side 2 : ");
                side2 = ipt.nextInt();
                if(side1==side2){
                    int areaSquare = side1 * side2;
                    System.out.println("\nArea of the square is " + areaSquare);    
                    System.out.println(" ");
                    for(a=1;a<=side1;a++){
                        for(side2=side1;side2>1;side2--){
                            System.out.print(" * ");
                        }
                        System.out.print(" * \n");
                    }
                }
                else{
                    System.out.println("Input failure, it's not Square");  
                } 
            }
            System.out.print("\nInput again (y/n) ? ");
            Scanner e = new Scanner(System.in);
            repeat = e.nextLine();
        }
        System.out.print("Press any button to escape ... ");
        String any = ip.nextLine();
    }
}