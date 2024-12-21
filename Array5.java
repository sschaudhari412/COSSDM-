import java.util.Scanner;

class Array5{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		int size= sc.nextInt();

		int[] a= new int[size];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=a.length-1;i>=0;i--){
			if(a[i]%2==0){
				System.out.println(a[i]);
			}
		}
	}
}

