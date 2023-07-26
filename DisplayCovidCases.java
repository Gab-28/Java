// a program that will display one province in the ROI, the respective counties and number of new COVID-19's cases
import java.util.Scanner;
import java.util.ArrayList;
public class DisplayCovidCases  {
    public static void main(String[] args) {

      Scanner input = new Scanner (System.in); // scanner object to allow input from user;

        int i;
        int j;

        String counties[] = new String [12]; // innitialize the array to the maximum number of counties present
        int new_cases [] = new int [12]; // the same maximum number for the cases as well

        stars();
        System.out.println("This program will display one province that you will choose,\nthe respective counties and the number of new cases of covid19.\n");
        stars();
        System.out.println("Enter only one province (Connaught, Munster, Leinster or Ulster) : \n"); // prompt user to enter only one province
        String province = input.nextLine(); // variable province will receive the input from user



        switch (province) {
			 case "Connaught":
				counties = new String[5];  // array counties stores 5 counties
				new_cases = new int [5];   // array new_cases stores 5 new cases

				enterCounties (counties); // method called to enter counties
				enterCases (new_cases);   // method called to enter new_cases
				break;
			case "Munster":
			    counties = new String[6]; // array counties stores 6 counties
			    new_cases = new int [6];  // array new_cases stores 6 new cases

				enterCounties(counties);
                enterCases (new_cases);
			    break;
			case "Leinster":
			    counties = new String[12]; // array counties stores 12 counties
				new_cases = new int [12];  // array new_cases stores 12 new cases

				enterCounties(counties);
                enterCases (new_cases);
			    break;
			case "Ulster":
			  counties = new String[3]; // array counties stores 12 counties
			  new_cases = new int [3];  // array new_cases stores 12 new cases

			  enterCounties(counties);
              enterCases (new_cases);
               break;
            default:
              System.out.println (" Type the correct name: ");
			}

             // display to the user the county and respective new case(s)
			  for ( i=0; i <counties.length; i++) { // looping statement that repeats the number of counties mentioned
				for ( j=0; j < new_cases.length; j++) { // looping statement that repeats of cases mentioned
					if (i==j) {  // control statement to select only the cases and counties that matches the same index value in the looping
					System.out.println (" \nThe county " + counties[i] + " has " + new_cases[j] + " new case(s).");
						 				}
									}
								}


                  stars();
                  menu (); // display menu

		            System.out.println (" Choose one of the options:\n"); // prompt user to choose from the menu
		 	 		int menu = input.nextInt();



		 	 		switch (menu) {
		 	 		 case 1:
		 	 		        System.out.println ("The average number of new case(s) is " + averageNumber(new_cases)); // display the average of number of new cases
		 	 		        break;
		 	 		 case 2:
		 	 		        System.out.println ("The largest number is " + largestNumber(new_cases)); // display the largest number of new cases
		 	 		        break;
		 	 		 case 3:
		 	 		        System.out.println ("The smallest number is  " +   smallestNumber(new_cases)); // display the smallest number of new cases
		 	 		        break;
		 	 		 case 4:
		 	 		        System.out.println ("Array before sorting method: "); // sort and display the number of new cases in descending order
		 	 		                      for (i=0; i<new_cases.length; i++) {
		 					             System.out.println (new_cases [i] + " " );
		 						               }
		 						        sortNumber(new_cases);

		 						        System.out.println ("Array after sorting in descending order");

		 						       for( i=0; i<new_cases.length; i++) {

		 						       System.out.println (new_cases[i]);
		 							   }
		 				     break;
		 		      case 5:
		 		             System.out.println (findName(counties)+"\n"); // search for an individual county by using the county name
		 		             break;
	 		        }
	 		         stars();
	 		         menu (); // display menu

					 System.out.println ("Choose one of the options:\n"); // prompt user to choose from the menu
					 menu = input.nextInt();


					switch (menu) {
					case 1:
				            System.out.println ("The average number of new case(s) is " + averageNumber(new_cases)); // display the average of number of new cases
				            break;
			        case 2:
					        System.out.println ("The largest number is " + largestNumber(new_cases)); // display the largest number of new cases
					        break;
					case 3:
					        System.out.println ("The smallest number is " +   smallestNumber(new_cases)); // display the smallest number of new cases
					        break;
					 case 4:
					         System.out.println ("Array before sorting method: "); // sort and display the number of new cases in descending order
					                           for (i=0; i<new_cases.length; i++) {
							 					 System.out.println (new_cases [i] + " " );
							 						               }
							 					 sortNumber(new_cases);

							 				     System.out.println ("Array after sorting in descending order");

							 				    for( i=0; i<new_cases.length; i++) {

							 					System.out.println (new_cases[i]);
							 							   }
							 break;
					case 5:
						   System.out.println (findName(counties)+"\n"); // search for an individual county by using the county name
						   break;
	 		        }

	 		         stars();
	 		         menu (); // display menu

						System.out.println ("Choose one of the options:\n"); // prompt user to choose from the menu
						menu = input.nextInt();



					switch (menu) {
					case 1:
							System.out.println ("The average number of new case(s) is " + averageNumber(new_cases)); // display the average of number of new cases
							break;
				    case 2:
						    System.out.println ("The largest number is " + largestNumber(new_cases)); // display the largest number of new cases
						    break;
					case 3:
							System.out.println ("The smallest number is " +   smallestNumber(new_cases)); // display the smallest number of new cases
							break;
					case 4:
							 System.out.println ("Array before sorting method: "); // sort and display the number of new cases in descending order
							 	 		                      for (i=0; i<new_cases.length; i++) {
							 					             System.out.println (new_cases [i] + " " );
							 						               }
							 						        sortNumber(new_cases);

							 						        System.out.println ("Array after sorting in descending order");

							 						       for( i=0; i<new_cases.length; i++) {

							 						       System.out.println (new_cases[i]);
							 							   }
							 break;
					case 5:
							System.out.println (findName(counties)); // search for an individual county by using the county name
							break;
	 		        }
	 		         stars();
	 		         menu (); // display menu

					System.out.println ("Choose one of the options:\n"); // prompt user to choose from the menu
					menu = input.nextInt();



				switch (menu) {
				case 1:
						System.out.println ("The average number of new case(s) is " + averageNumber(new_cases)); // display the average of number of new cases
						break;
				case 2:
						System.out.println ("The largest number is " + largestNumber(new_cases)); // display the largest number of new cases
						break;
			    case 3:
						System.out.println ("The smallest number is " +   smallestNumber(new_cases)); // display the smallest number of new cases
						break;
				case 4:
						System.out.println ("Array before sorting method: "); // sort and display the number of new cases in descending order
							 	 		                      for (i=0; i<new_cases.length; i++) {
							 					             System.out.println (new_cases [i] + " " );
							 						               }
							 						        sortNumber(new_cases);

							 						        System.out.println ("Array after sorting in descending order ");

							 						       for( i=0; i<new_cases.length; i++) {

							 						       System.out.println (new_cases[i]);
							 							   }
						break;
				 case 5:
						 System.out.println (findName(counties)+"\n"); // search for an individual county by using the county name
						 break;
	 		        }

  stars();
  	 		         menu (); // display menu

  					System.out.println ("Choose one of the options:\n"); // prompt user to choose from the menu
  					 menu = input.nextInt();



  				   switch (menu) {
  					case 1:
  							 System.out.println ("The average number of new case(s) is " + averageNumber(new_cases)); // display the average of number of new cases
  							 break;
  				    case 2:
  							 System.out.println ("The largest number is " + largestNumber(new_cases)); // display the largest number of new cases
  							 break;
  				    case 3:
  						     System.out.println ("The smallest number is " +   smallestNumber(new_cases)); // display the smallest number of new cases
  						     break;
  					case 4:
  							System.out.println ("Array before sorting method: "); // sort and display the number of new cases in descending order
  							 	 		                      for (i=0; i<new_cases.length; i++) {
  							 					             System.out.println (new_cases [i] + " " );
  							 						               }
  							 						        sortNumber(new_cases);

  							 						        System.out.println ("Array after sorting in descending order");

  							 						       for( i=0; i<new_cases.length; i++) {

  							 						       System.out.println (new_cases[i]);
  							 							   }
  							break;
  					case 5:
  							 System.out.println (findName(counties)+"\n"); // search for an individual county by using the county name
  	 		              break;

			               }

                } // end of main method

			  public static void enterCounties (String counties2[]) {  // method created to enter counties with no return value
			  				Scanner input = new Scanner (System.in);  // scanner object to allow input from user;
			  				System.out.println ("\nEnter the counties: \n"); // prompt user to enter the counties
			  				for (int i=0; i< counties2.length; i++) { // repetition statement to allow user to enter counties
			  					counties2 [i] = input.nextLine(); // array counties2 stores the counties entered by the user
			  					   if (counties2[i].equals(" ")) { // control statement if user inputs any information except the name
									   System.out.println ("Enter a valid name");
									   }
			  			} // end of repetition statement
			  		} // end of method enterCounties

			  public static void enterCases (int new_cases2 []) { //method created to enter new cases with no return value
			  				Scanner input = new Scanner (System.in);   // scanner object to allow input from user
			  				System.out.println ("\nEnter the new cases: \n "); // prompt user to enter the new cases
			  				for (int j=0; j< new_cases2.length;j++) {  // repetition statement to allow user to enter counties
			  				    new_cases2 [j] = input.nextInt();    // array counties2 stores the counties entered by the user

			  					 } // end of repetition statement
				         }  // end of method enterCases


              public static void menu () { // display menu

                 System.out.println (" _______________________________________________________________________\n");
                 System.out.println (" |           Choose an option from the list above                       |\n");
		         System.out.println (" | 1 - Display the average number of new cases                          | \n");
				 System.out.println (" | 2 - Display the largest number of new cases                          | \n");
				 System.out.println (" | 3 - Display the smallest number of new cases                         |  \n");
				 System.out.println (" | 4 - Sort and display the number of new cases in descending order     |  \n");
				 System.out.println (" | 5- Search for an individual county by using the county name          | \n");
				 System.out.println (" |______________________________________________________________________|\n");
                   } //end of method menu


               public static void stars () {

				  System.out.println ("******************************************************************\n");
				   }


             public static double averageNumber ( int number[]) {   // display average number
			    int total = 0; // initialize total to 0
			       for (int value: number) {  // the value stored in variable value sums with total
				        total += value;
                        } //end looping statement
			       return (double) total/number.length; // return average of numbers with typecast to double variable total
			    } // end method averageNumber


		     public static int smallestNumber (int number[]) { //display smallest number
			   int smallNumber = number[0]; // assuming the smallest number is the first element
                    for (int value: number) { // variable value stores numbers from number array
					      if (value < smallNumber ) { // control statement if value is smaller than smallNumber
						       smallNumber = value;  // smallNumber receives the value stored in variable value
						     } //end control statement
					 } // end looping statement
                   return smallNumber; // return the smallest number
			     } // end method smallestNumber


            public static int largestNumber (int number[]) { // display largest number
			  int largeNumber = number[0]; // assuming the highest number is the first element
			      for (int value: number) { // variable value stores numbers from number array
				         if (value > largeNumber) { // if value number is higher than largeNumber
					        largeNumber = value;  // largeNumber receives the value stored in variable value
					        } //end control statement
				     } // end looping statement
			      return largeNumber; // return largeNumber
			  } // end of method largestNumber



          private static void sortNumber(int number[]) {
               int x= number.length;
	           int swap = 0;
	           for (int pass=1; pass < x ;pass++) { // start of loop statement around array
	   	       for (int i=0; i<(x-1); i++) { // for each loop decreasing one number in comparison
	   		        if (number[i] < number[i+1]) { // swap the elements
	   					swap= number[i];
	   					number[i] = number[i+1];
	   					number[i+1] = swap;
	   							 } // end of control statement
	   						 } // end of for loop
	   			} // end of for loop

        } // end private method


        public static String findName(String c[]) {
			Scanner input = new Scanner(System.in);
			System.out.println ("Enter the name of the county you wish to search:"); // prompt user
			String search = input.nextLine(); // variable search receives answer

				for (int i=0; i<c.length;i++) { // for statement will loop through the array c []
					if (c[i].equals(search)) {  // if the name is found
                          System.out.println ("The county is present at location " + (i+1)); // display in what position the name is
		                  }
					 }

				return ("");

             }
	}