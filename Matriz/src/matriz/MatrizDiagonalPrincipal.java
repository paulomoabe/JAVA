package matriz;

public class MatrizDiagonalPrincipal {
	public static void main(String[] args) {

		int m[][]=new int[4][4];

		preencher(m);

		mostrar(m);



	}

	public static void mostrar(int m[][]) {

		for(int i=0;i<m.length;i++) {

			for(int j=0;j<m.length;j++) {

				System.out.printf("%2d",m[i][j]);

			}

			System.out.println();

		}

		

	}

	public static int[][]preencher(int m[][]) {

	

		

		for(int i=0; i<m.length;i++) {

			for(int j=0;j<m.length;j++) {

				if(i==j) {

					m[i][j]=0;

				}else if(i<j) {

					m[i][j]=1;

				}else {

					m[i][j]=-1;

				}

			}

			

		}

		return m;

		

		

	}


}
