public class Fibonacci{
	//Definicion de variables
		int n;
		int f = 0;
		int t1 = 1;
		int t2;
		public int serie (int c){
		n=c;
				for (int i=1; i<=n; i++){
				t2 = f;
				f = t1 + f;
				t1 = t2;
				System.out.println(t1);
			}
			return c;
		}
}