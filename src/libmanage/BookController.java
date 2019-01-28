package libmanage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController {
	public Scanner dot1=new Scanner(System.in);
	public Scanner dot2=new Scanner(System.in);
	BookModel bookModel=new BookModel();
	static List<BookModel> bookList=new ArrayList<BookModel>();

	public void add() {
	   	
		System.out.println("Please Enter your choice:");
		System.out.println("1. Add Book Info \n2. Delete Book info \n3. Update Book Info \n4. Search Book Info");
		int x=dot1.nextInt();
		
		if (x==1) {
			System.out.println("Please Enter your Info~~");
			System.out.println("Enter the BookId: ");
			int xx=dot1.nextInt();
			System.out.println("Enter the Book Name: ");
			String  xy=dot2.next();
			System.out.println("Enter the Author Name: ");
			String yy=dot2.next();
			System.out.println("Enter the Book Quantity :");
			int yx=dot1.nextInt();
			bookModel.setId(xx);
			bookModel.setName(xy);
			bookModel.setAuthorName(yy);
			bookModel.setBookQuantity(yx);
			bookList.add(bookModel);
		}
	}
	
	public void display() {
		
		for(BookModel book:bookList) {
			
			System.out.print(book.getId()+" ");
			System.out.print(book.getName()+" ");
			System.out.print(book.getAuthorName()+" ");
			System.out.print(book.getBookQuantity()+" ");
			System.out.println();
		}
	}
	
	
}
                                                                                                                              