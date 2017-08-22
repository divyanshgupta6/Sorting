import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class SelectionSort {


	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array length...");
		int l = Integer.parseInt(br.readLine());
		int list[] = new int[l];
		for(int i=0;i<l;i++){
			System.out.println("Enter array elements...");
			list[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<l;i++){
			for(int j=0;j<l-1;j++){
				if(list[j]>list[j+1]){
					int tmp=list[j];
					list[j]=list[j+1];
					list[j+1]=tmp;
				}
			}
		}
		for(int i=0;i<l;i++){
			System.out.print(list[i]+" ");
		}
	}

}
