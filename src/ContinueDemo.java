
public class ContinueDemo {

	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) { // 6 
			if(i == 5) {
				//break;
				continue;
			}
			System.out.println(i);//1 2 3 4 6 7 8 9 10  
		}
	} 
	
}
