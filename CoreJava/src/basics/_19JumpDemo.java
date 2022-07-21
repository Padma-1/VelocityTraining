package basics;

public class _19JumpDemo {

	public static void main(String[] args) {
		int i,j;
		System.out.println("**BreakDemo**");
		for(i=1;i<=10;i++) {
			if(i==5) {
				break;
			}System.out.println(i+ " : Padma");
		}
		System.out.println("**ContinueDemo**");
		for(j=1;j<=10;j++) {
			if(j==5) {
				continue;
			}System.out.println(j+ ": Padma");
		}
	}

}
