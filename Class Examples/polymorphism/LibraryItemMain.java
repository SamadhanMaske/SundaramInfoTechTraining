package com.polymorphism;

class LibraryItem{
	private String title;
	private String author;
	private int yearPublished;
	public LibraryItem(String title, String author, int yearPublished) {
		super();
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	public void displayDetails(){
		System.out.println("Title: "+ getTitle() + " Author: "+ getAuthor() + " Year Published: "+ getYearPublished());
	}
}

class Book extends LibraryItem{
	private String genere;

	public Book(String title, String author, int yearPublished, String genere) {
		super(title, author, yearPublished);
		this.genere = genere;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}

	public void displayDetails(){
		//System.out.println("Title: "+ getTitle() + " Author: "+ getAuthor() + " Year Published: "+ getYearPublished());
		super.displayDetails();
		System.out.println("Genere: "+ getGenere());
	}
	
}

class Magazine extends LibraryItem{
	private int issueNumber;

	public Magazine(String title, String author, int yearPublished) {
		super(title, author, yearPublished);
		// TODO Auto-generated constructor stub
	}

	public Magazine(String title, String author, int yearPublished, int issueNumber) {
		super(title, author, yearPublished);
		this.issueNumber = issueNumber;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}
	public void displayDetails(){
		//System.out.println("Title: "+ getTitle() + " Author: "+ getAuthor() + " Year Published: "+ getYearPublished());
		super.displayDetails();
		System.out.println("Issue number : "+ getIssueNumber());
	}
}
public class LibraryItemMain {

	public static void main(String[] args) {
		LibraryItem book = new Book("Journey Home", "HH RNS", 2010, "Spirituality");
		LibraryItem magazine = new Magazine("DYS", "HG RSP", 2000, 101);
		
		book.displayDetails();
		magazine.displayDetails();
	}

}
