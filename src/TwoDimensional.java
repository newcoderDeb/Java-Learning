
public class TwoDimensional {

	public static void main(String[] args) {
		
		int size=5;
		int num[][] = new int[size][];
		/*num[0] = new int[1];
		num[1] = new int[2];
		num[2] = new int[3];
		num[3] = new int[4];
		num[4] = new int[5];
		num[5] = new int[6];*/
		int i,j,k=0;
		for(i=0;i<size;i++)
		{
			num[i] = new int[i+1];
		}
		for(i=0;i<size;i++)
			for(j=0;j<i+1;j++)
			{
				num[i][j] = k;
				k++;
			}
		
		for(i=0;i<size;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
