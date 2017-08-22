package Sorting;
import java.io.*;
public class BubbleSort {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array length...");
		int l = Integer.parseInt(br.readLine());
		int list[] = new int[l];
		for(int i=0;i<l;i++){
			System.out.println("Enter array element...");
			list[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
				if(list[i]>list[j]){
					int tmp=list[i];
					list[i]=list[j];
					list[j]=tmp;
				}
			}
		}
		for(int i=0;i<l;i++){
			System.out.print(list[i]+" ");
		}
	}

}
