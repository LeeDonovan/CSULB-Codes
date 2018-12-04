/* This class is used to illustrate the Comparable interface */
/* It also overrides equals(),hashCode(), toString() */

class Author implements Comparable<Author>{
    String firstName;
    String lastName;
/* Constructor */
    public Author(String inlast, String infirst) {
		lastName=inlast;
		firstName=infirst;

	}

// compareTo should return < 0 if this is supposed to be
// less than other, > 0 if this is supposed to be greater than
// other and 0 if they are supposed to be equal
    public int compareTo(Author other){
                if (this.lastName.equals(other.lastName))
			return (this.firstName.compareTo(other.firstName));
		else
			return (this.lastName.compareTo(other.lastName));
    }

/* equals() returns true if both the lastname and the firstname are the same */
    public boolean equals(Author other) {
		if (this.lastName.equals(other.lastName) &&
			this.firstName.equals(other.firstName))
			return true;
		else
			return false;
	}

	/* hashCode() returns the sum of the individual Strings' hashCode() values */
	public int hashCode() {
		return lastName.hashCode()+firstName.hashCode();
	}

	public String toString() {
		return "The author's name is: " + firstName + " " + lastName;
	}

	public static void main (String [] args) {
		Author auth1 = new Author("Wells","Herbert");
		Author auth2 = new Author("Verne","Jules");
		Author auth3 = new Author("Verne","Jules");
		System.out.println("compareTo(1 to 2): " + auth1.compareTo(auth2));
		System.out.println("compareTo(2 to 1): " + auth2.compareTo(auth1));
		System.out.println("equals(1 to 2): " + auth1.equals(auth2));
		System.out.println("compareTo(2 to 3): " + auth1.compareTo(auth2));
		System.out.println("equals(2 to 3): " + auth2.equals(auth3));
		System.out.println("hashCode(1): " + auth1.hashCode());
		System.out.println("hashCode(2): " + auth2.hashCode());
		System.out.println("hashCode(3): " + auth3.hashCode());
		System.out.println(auth1);
	}
}