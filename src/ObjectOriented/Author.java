package ObjectOriented;

//Object
public class Author {
    
	///use the public static in order to be common to every new object created
	public static int totalId =0;
	
	
	private int id;
	private String name;
	private String email;
	private char gender;

	// Constructor 1 with full parameters
	public Author(String name, String email, char gender) {
		totalId++;
		this.id = totalId;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	// Constructor 2 with empty parameters
	public Author() {
		totalId++;
		this.id = totalId;
		this.name = "Anonymouse";
		this.email = "nomail@mail.com";
		this.gender = 'N';
	}
	// Constructor 3 with empty mail
	public Author(String name , char gender) {
		totalId++;
		this.id = totalId;
		this.name = name;
		this.email = "nomail@mail.com";
		this.gender = gender;
	}
	// Getters and Setters
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}
	 
	@Override
	public String toString() {
		return name + gender + "at " + email + ", gender=";
	}

	public static void main(String[] args) {
        // use the getters to get info and print
		Author anAuthor = new Author("Hen Faibish", "Hen.Faibish@solaredge.com", 'm');
		System.out.println("id#" + " " + totalId + " " +anAuthor.getName()+ "  " +anAuthor.getEmail()+ "  "  + anAuthor.getGender());
		Author bnAuthor = new Author("Toni Manda",'F');
		System.out.println("id#" + " " + totalId + " " + bnAuthor.getName()+ "  " +bnAuthor.getEmail()+ "  "  + bnAuthor.getGender()+ "\n\n\n");
	    
		// use setter to set new info in specific object
		bnAuthor.setEmail("NoMail");
		
		// new print to see that actually the setter change the mail
		System.out.println("After Changing the mail for toni:");
		System.out.println("id#" + " " + totalId + " " + bnAuthor.getName()+ "  " +bnAuthor.getEmail()+ "  "  + bnAuthor.getGender());

		// create array of Author objects
		Author[] arrAthor = new Author[5];
		    for (int i=0;i<arrAthor.length;i++)
		    	arrAthor[i]= new Author();
		           
		    
		    // print the id for the Author array
		    for (int i=0;i<arrAthor.length;i++)
		    	System.out.println(arrAthor[i].id);
		    	
		    
		
		
	}

}
