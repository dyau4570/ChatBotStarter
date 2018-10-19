import java.util.Scanner;

/**
 * A simple class to run our chatbot teams.
 * @author Brooklyn Tech CS Department
 * @version September 2018
 */
public class ThePharmacist
{

	/**
	 * Create instances of each chatbot, give it user input, and print its replies. Switch chatbot responses based on which chatbot the user is speaking too.
	 */
	public static void main(String[] args)
	{
		Ibuprofen chatbot1 = new Ibuprofen();
		Oxycodone chatbot2 = new Oxycodone();
		Aderall chatbot3 = new Aderall();
		

		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to the legal drugbot. How can I help you?");
		String statement = in.nextLine();


		while (!statement.equals("Bye"))
		{
			//Use Logic to control which chatbot is handling the conversation\
			//This example has only chatbot1
			System.out.println("What legal drug would you like to learn about? \n Your options are A : Ibuprofen B : Oxycodone and C : Aderall");
			statement = in.nextLine();
			if(statement.equals("A") || statement.equals("a")){
				chatbot1.chatLoop(statement);
			}else if(statement.equals("B") || statement.equals("b")){
				chatbot2.chatLoop(statement);
			}else if(statement.equals("C") || statement.equals("c")){
				chatbot3.chatLoop(statement);
			}
			//chatbot1.chatLoop(statement);


			//statement = in.nextLine();


		}
	}

}
