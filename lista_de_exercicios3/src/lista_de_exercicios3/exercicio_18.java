package lista_de_exercicios3;

public class exercicio_18 {

	public static void main(String[] args) {
		int n[][]= new int [4][4];
		
		n=preencher();
		mostrar(n);


	}
	public static int[][]preencher () {
		int n[][]= new int [4][4];
		
		for(int i=0; i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(i==j) {
					n[i][i]= 0;
					
				}else if(i<j) {
					n[i][j]= 1;
					
				}else {
					n[i][j]= -1;
				}
			}
		}
		return n;
		
	}
	public static void mostrar(int n[][]) {
		for(int i=0; i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				
				if(n[i][j]!=-1) {
					System.out.print(" "+n[i][j]+" ");
				}else {
					System.out.print(n[i][j]+" ");
				}
					
				}
			System.out.print("\n");
			
			}
		   
		}
		
	}


