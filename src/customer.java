

import java.util.Scanner;
public class customer {




    {
        String name;
        int totalprice=0;
        int quantity;

    }
    class Cart
    {

    }
    class Fix
    { int ch,ch1;
        void choice()
        {
            System.out.println("Do you want to shop ? ");
            System.out.println("1.Yes \n2.No");
            Scanner sc= new Scanner(System.in);
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("1.Electronics \n2.Clothing \n3.Furniture \n4.Grossary \n5.Stationary");
                System.out.println("Enter Your Choice-");
                // Scanner sc= new Scanner(System.in);
                int c=sc.nextInt();
                if(c==1)
                {
                    System.out.println("*********");
                    System.out.println("   Welcome to Electronics section");
                    System.out.println("*********");
                }
                else if(c==2)
                {
                    System.out.println("*********");
                    System.out.println("   Welcome to clothing section");
                    System.out.println("*********");
                }

                else if(c==3)
                {
                    System.out.println("*********");
                    System.out.println("   Welcome to Furniture section");
                    System.out.println("*********");
                }

                else if(c==4)
                {
                    System.out.println("*********");
                    System.out.println("   Welcome to Grossaries section");
                    System.out.println("*********");
                }

                else if(c==5)
                {
                    System.out.println("*********");
                    System.out.println("   Welcome to Stationary section");
                    System.out.println("*********");
                }
                else
                {
                    System.out.println("Enter Valid Choice");
                    int d= sc.nextInt();
                }

            }
            else
            {
                System.out.println("Thank You for visiting...\n Visit Again!!!");
            }


        }

    }

    class Main
    {
        public static void main(String [] args)
        {
            System.out.println("-----------------------------");
            System.out.println("   Welcome to Online Shop");
            System.out.println("-----------------------------");
            System.out.println("Enter Your Name");
            Scanner sc= new Scanner(System.in);
            String name=sc.nextLine();
            Customer c = new Customer();
            System.out.println("Your Name:"+name);

            Fix f= new Fix();
            f.choice();
            //ClothSect cs= new ClothSect();
            //cs.cloth(c);

        }
    }
}

