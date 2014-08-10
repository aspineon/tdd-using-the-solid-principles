package single_responsibility.before;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String title;
	private String author;
	private List<String> pages;
	private int currentPage = 0;
	
	public Book(String title, String author, ArrayList<String> pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void turnPage() {
		if (currentPage < pages.size() - 1) {
			currentPage++;
		}
	}

	public void printCurrentPage() {
		System.out.println(pages.get(currentPage));
	}

	public int getCurrentPage() {
		return currentPage;
	}
}
