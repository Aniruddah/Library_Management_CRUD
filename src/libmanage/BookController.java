package libmanage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController {

	BookModel bookModel;

	public Scanner dot1 = new Scanner(System.in);
	public Scanner dot2 = new Scanner(System.in);

	static List<BookModel> bookList = new ArrayList<BookModel>();

	public void add() {
		bookModel = new BookModel();
		System.out.println("Please Enter your Info~~");
		System.out.println("Enter the BookId: ");
		int xx = dot1.nextInt();
		System.out.println("Enter the Book Name: ");
		String xy = dot2.next();
		System.out.println("Enter the Author Name: ");
		String yy = dot2.next();
		System.out.println("Enter the Book Quantity :");
		int yx = dot1.nextInt();
		bookModel.setId(xx);
		bookModel.setName(xy);
		bookModel.setAuthorName(yy);
		bookModel.setBookQuantity(yx);
		bookList.add(bookModel);
	}

	public void display() {

		for (BookModel book : bookList) {

			System.out.print(book.getId() + " ");
			System.out.print(book.getName() + " ");
			System.out.print(book.getAuthorName() + " ");
			System.out.print(book.getBookQuantity() + " ");
			System.out.println();
		}
	}

	public void delete() {
		boolean flag = true;
		System.out.println("Please Enter the Book ID~~");
		int aa = dot2.nextInt();
		if (bookList.isEmpty()) {
			System.out.println("List is empty");
		}

		else {
			for (BookModel book : bookList) {
				if (aa == book.getId()) {
					bookList.remove(book);
					System.out.println("Removed from list");
					flag = true;
					break;
				}
				flag = false;
			}

			if (flag == false) {
				System.out.println("ID not found");
			}

		}

	}

	public void update() {
		boolean flag = true;
		System.out.println("Please Enter the Book ID :");
		int aa = dot1.nextInt();
		for (BookModel book : bookList) {
			if (aa == book.getId()) {
		      System.out.println("Please Enter the Book Name :");
		      String a=dot2.next();
			  book.setName(a);
			  System.out.println("Please Enter the Author Name :");
			  String b=dot2.next();
			  book.setAuthorName(b);
			  System.out.println("Please Enter the Book Quantity :");
			  int c=dot2.nextInt();
			  book.setBookQuantity(c);
			  System.out.println("Updated in list");
			  flag=true;
			  break;
			
			} 
			flag=false;

			if(flag==false) {
				
				System.out.println("Query Not found");
			}

		}
	}
}
