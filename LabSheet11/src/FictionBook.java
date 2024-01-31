import java.time.Year;

public class FictionBook implements Author,Book{
	public String author_name;
	public String email;
	public String title;
	public int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		if(author_name.indexOf(" ")==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getLastName() {
		int result = author_name.indexOf(' ');
		return author_name.substring(result+1).toUpperCase();
	}
	
	public String getFirstName() {
		int result = author_name.indexOf(" ");
		return author_name.substring(0,result).toUpperCase();
	}
	
	public boolean checkEmail(){
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int totalPublicYear(){
		return Year.now().getValue() - publicYear;
	}
	
	public String toString() {
		return title + " write by " + getLastName().charAt(0) + "." + getFirstName() + "(" + this.email + ")" + "\nPublished for " + totalPublicYear() + " years.";
	}

	@Override
	public String getTitle() {
		return title;
	}

}
