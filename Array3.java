import java.util.Scanner;
class Array3{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();

		float [] f1 = new float[size];

		for(int i=0;i<f1.length;i++){
			f1[i]=sc.nextFloat();
		}
		for(int i=0;i<f1.length;i++){
			System.out.println((int)f1[i]);
		}
	}
}


