package sg.edu.nus.iss.club;

public class Person {

	/* Instance variables of the class declared below */
	private String surName;
	private String firstName;
	private String secondName;
	
	//TODO - Change the "IllegalArgumentException" to "Compile time exception."
	
	/* Constructors */
	public Person() throws IllegalArgumentException{
		this(null, null, null);
	}
	
	public Person(String surName, String firstName, String secondName) throws IllegalArgumentException{
		super();
		setFirstName(firstName);
		setSurName(surName);
		setSecondName(secondName);
	}
	
	/* Private methods */
	
	/*
	 * Setter for the secondName attribute.
	 */
	private void setSecondName(String secondName) {
		/* The 'secondName' can be 'null'. */
		this.secondName = secondName;
	}
	
	/*
	 * Setter for the firstName attribute.
	 */
	private void setFirstName(String firstName) throws IllegalArgumentException {
		if (firstName == null) {
			throw new IllegalArgumentException("First Name cannot be null");
		}
		this.firstName = firstName;
	}
	
	/*
	 * Setter for the surName attribute.
	 */
	private void setSurName(String surName) throws IllegalArgumentException{
		if (surName == null) {
			throw new IllegalArgumentException("Surname cannot be null");
		}
		this.surName = surName;
	}
	
	/* Public methods */
	
	/*
	 * Getter for the surName attribute.
	 */
	public String getSurName() {
		return surName;
	}
	
	/*
	 * Getter for the firstName attribute.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * Getter for the secondName attribute.
	 */
	public String getSecondName() {
		return secondName;
	}
	
	/*
	 * Method displays the complete name of the Person. Takes into account that "second name" can be null.
	 */
	public String show() {
		return toString();
	}
	
	@Override 
	public String toString() {
		if(secondName == null){
			return "First Name: " + firstName + "\nSurname: " + surName;
		}
		return "First Name: " + firstName + "\nSecond Name: " + secondName + "\nSurname: " + surName;
	}
	
	public boolean equals(Object person) {
		if (person instanceof Person) {
			Person p = (Person) person;
			if (this.getSurName().equals(p.getSurName()) && this.getFirstName().equals(p.getFirstName()))
				if (this.getSecondName() == null) {
					if (p.getSecondName() == null)
						return true;
					else
						return false;
				} else if (p.getSecondName() != null)
					if (this.getSecondName().equals(p.getSecondName()))
						return true;
		}
		return false;
	}
}
