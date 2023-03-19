package Array;

import java.util.Scanner;

public class CharArray {

public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size");
int size = sc.nextInt();
char a[]= new char[size]; 
for(int i = 0; i<a.length;i++){
	System.out.println("Enter the charecter for index "+i);
	a[i] = sc.next().charAt(0);
}
for(int i =0;i<a.length;i++){
	System.out.print(a[i]+"  ");
}
// befor sorting
System.out.println(); 
for(int i=0;i<a.length-1;i++){
	for(int j=i+1;j<a.length;j++){
		if(a[i]>a[j]){
			char temp =a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
}
//after sorting
for(int i=0; i<a.length;i++){
	System.out.print(a[i]+"  ");
}
}

}
