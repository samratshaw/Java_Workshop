package sg.edu.nus.iss.club;

public class Person {

	/* Instance variables of the class declared below */
	private String surname;
	private String firstName;
	private String secondName;
	
	/* Constructors */
	public Person() throws IllegalArgumentException{
		this(null, null, null);
	}
	
	public Person(String surname, String firstName, String secondName) throws IllegalArgumentException{
		super();
		setFirstName(firstName);
		setSurName(surname);
		setSecondName(secondName);
	}
	
	/* Private methods */
	private void setSecondName(String secondName) {
		/* The 'secondName' can be 'null'. */
		this.secondName = secondName;
	}
	
	private void setFirstName(String firstName) throws IllegalArgumentException {
		if (firstName == null) {
			throw new IllegalArgumentException("First Name cannot be null");
		}
		this.firstName = firstName;
	}
	
	private void setSurName(String surname) throws IllegalArgumentException{
		if (surname == null) {
			throw new IllegalArgumentException("Surname cannot be null");
		}
		this.surname = surname;
	}
	
	/* Public methods */
	
	/*
	 * Setter for the surName attribute.
	 */
	public String getSurname() {
		return surname;
	}
	
	/*
	 * Setter for the firstName attribute.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * Setter for the secondName attribute.
	 */
	public String getSecondName() {
		return secondName;
	}
	
	/*
	 * Method displays the complete name of the Person. Takes into account that "second name" can be null.
	 */
	public String show() {
		if(secondName == null){
			return "First Name: " + firstName + "\nSurname: " + surname;
		}
		return "First Name: " + firstName + "\nSecond Name: " + secondName + "\nSurname: " + surname;
	}
}
