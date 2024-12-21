import java.util.Scanner;
class ArrayEvenno{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		int [] a= new int[size];

		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.println(a[i]);
			}
		}
	}
}
