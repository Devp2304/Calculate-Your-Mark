import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Dev.Patel
    // Friday September 17, 2021
    // ISC 4U
    // Dev's Parallel Arrays!!!

    System.out.println("\n");

    System.out.print("How Many Courses are you taking? ");
    int course = Integer.parseInt(scan.nextLine());

    String[] code = new String[course];

    Double[] mark = new Double[course];

    String[] name = new String[course];

    for (int i = 0; i < code.length; i++) {
      // Course Code //

      System.out.print("Enter The Course Code: ");
      code[i] = scan.nextLine();
      // Mark //

      System.out.print("Enter Your Mark: ");
      mark[i] = Double.parseDouble(scan.nextLine());
      //Teacher//

      System.out.print("Enter The Teachers Name: ");
      name[i] = scan.nextLine();
    }

    System.out.println("\n");

    // Display all courses, marks and teachers  //

    for (int i = 0; i < code.length; i++) {
      System.out.println(code[i] + " - " + name[i] + " - " + mark[i] + "%" + "\n");
    }

    System.out.println("\n");

    // The average of all marks //

    double sum = 0;

    for (int i = 0; i < mark.length; i++) {
      sum += mark[i];
    }

    System.out.println("The Average of all your marks is: " + Math.round(sum / mark.length * 10) / 10.0 + "%" + "\n");

    System.out.println("\n");

    // Highest Mark //

    int pos1 = 0;

    for (int i = 0; i < mark.length; i++) {
      if (mark[i] > mark[pos1]) {
        pos1 = i;
      }
    }
    System.out.println("Your Highest Mark Is In: " + code[pos1] + " - " + name[pos1] + " - " + mark[pos1] + "%" + "\n");

    System.out.println("\n");

    // Lowest Mark //

    int pos2 = 0;

    for (int i = 0; i < mark.length; i++) {
      if (mark[i] < mark[pos2]) {
        pos2 = i;

      }
    }
    System.out.println("Your Lowest Mark Is In: " + code[pos2] + " - " + name[pos2] + " - " + mark[pos2] + "%" + "\n");

    System.out.println("\n");

    // Failing //

    int pos3 = 0;

    for (int i = 0; i < mark.length; i++) {
      if (mark[i] < 50) {
        pos3 = i;
        System.out.println(
            "You Are Failing This Course:  " + code[pos3] + " - " + name[pos3] + " - " + mark[pos3] + "%" + "\n");

      }
    }

    System.out.println("\n");

    // Above 90% //

    int pos4 = 0;

    for (int i = 0; i < mark.length; i++) {
      if (mark[i] > 90) {
        pos4 = i;
        System.out.println("You Have Above A 90% In This Course: " + code[pos4] + " - " + name[pos4] + " - "
            + mark[pos4] + "%" + "\n");
      }
    }

    System.out.println("\n");

    // Enter Course Code //

    System.out.print("Please Enter The Course Code: ");

    String ccode = scan.nextLine();

    int pos5 = 0;

    for (int i = 0; i < code.length; i++) {
      if (ccode.equalsIgnoreCase(code[i])) {
        pos5 = i;

      }
    }


    System.out.println(
        "Here Is All The Information About The Course: " + code[pos5] + " - " + name[pos5] + " - " + mark[pos5] + "%");

  }
}