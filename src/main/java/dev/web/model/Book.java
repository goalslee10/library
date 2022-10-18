package dev.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@Column(name = "BOOK_LOCATION")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookLocation;
	
	@Column(name = "BOOK_NAME")
	private String bookName;
	
	@Column(name = "AUTHOR_NAME")
	private String authorName;

	public Book() {
	}

	public Book(Long bookLocation, String bookName, String authorName) {
		this.bookLocation = bookLocation;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public Book(Long bookLocation) {
		this.bookLocation = bookLocation;
	}

	public Long getBookLocation() {
		return bookLocation;
	}

	public void setBookLocation(Long bookLocation) {
		this.bookLocation = bookLocation;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
}
