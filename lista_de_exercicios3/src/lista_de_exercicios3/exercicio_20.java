package lista_de_exercicios3;

public class exercicio_20 {

	public static void main(String[] args) {
		int n[][]= new int[4][4];
		
		n= preencher();
		mostrar(n);
		
	}
	public static int[][]preencher() {
		int n[][]= new int[4][4];
		 for(int i=0;i<n.length;i++) {
			 for(int j=0; j<n.length;j++) {
				 if(j%2==0) {
					 n[i][j]=0;
				 }else {
					 n[i][j]=1;
				 }
			 }
		 }
		 return n;
	}
	public static void mostrar(int n[][]) {
		for(int i=0; i<n.length;i++) {
			for(int j=0; j<n.length;j++) {
				
					System.out.print(" "+n[i][j]);
				
		}
			System.out.print("\n");
		
		}
		
		
	}
}


