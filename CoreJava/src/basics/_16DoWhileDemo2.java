package basics;

public class _16DoWhileDemo2 {

	public static void main(String[] args) {
		int row,column;
		System.out.println("*************Multiplication Table*************** \n");
		row=1;
		do {
			column=1;
			do {
				int mul=row*column;
				System.out.print(mul+"\t");
				column=column+1;
			}while(column<=10);
			System.out.println();
			row++;
		}while(row<=5);

	}

}
