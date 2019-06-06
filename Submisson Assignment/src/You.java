/**
 * 
 * @author //Put your first and last name here
 * 
 * 
 * Assignment Instructions:
 * 	Write the following constructors and methods:
 * 	- You() : Sets all private global variables to your information
 * 	- String getFullName() : Returns a String of your first and last name with a space in between
 * 	- String setFavoriteAnimal(String animal) : Sets favoriteAnimal to animal and returns it 
 * 	- int happyBirthday() : Prints out "Happy Birthday!", increases age by 1, and returns it
 *
 * Submission Instructions:
 *  - Save your saved work on Eclipse - your workspace should be the file location of the cloned repo
 *  - In GitHub Desktop, add your summary and commit your changes
 *  - Then push your commits to GitHub
 *  - Check your repo on GitHub.com to make sure the files are as you intend
 *  - Add achiu-frhsd as a collaborator
 *
 */
public class You{

	private String firstName;
	private String lastName;
	private String favoriteAnimal;
	private int age;

	public You()
	{
		firstName = "Ashley";
		lastName = "Chiu";
		favoriteAnimal = "Class Pet - Dennis";
		int age = 5; //She looks 5 compared to everyone else
	}
	
	String getFullName()
	{
		return firstName + " " + lastName;
	}
	
	String setFavoriteAnimal(String animal)
	{
		favoriteAnimal = animal;
		return animal;
	}
	
	int happyBirthday()
	{
		System.out.println("Happy Birthday");
		age++;
		return age;
	}
	
}