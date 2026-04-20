package exercice_5;

public class Permutation {
	public static boolean checkPermutation(int[] n) {
		boolean res=true;int conut=0,next=0;
		int positionNumber_1=0;
		for (int i = 0; i < n.length; i++) {
			if(n[i]==1)
			{
				positionNumber_1=i;
				break;
			}
		}
		// position de 1 jusqu'a la fin
		//System.out.println(" 1 position "+ positionNumber_1);
		for (int i = positionNumber_1+1; i < n.length; i++) {
			//System.out.println("Next "+next);
			if(next==0)
			{
				next=n[positionNumber_1]+1;
				//System.out.println(" value "+next);
			}
			//System.out.println(" check Next "+ n[i]+"   ***  "+next);
			 if(n[i]==next)
			{
				next++;
			}
			else
			{
			//	System.out.println("Finish");
				res=false;
				break;
			}
				
		}
		// position 0  jusqu'a la fin
		next=0;
		for (int i = 0; i < positionNumber_1; i++) {
			//System.out.println("Next "+next);
			if(next==0)
			{
				next=n[i];
				//System.out.println(" value "+next);
			}
			//System.out.println(" check Next "+ n[i]+"   ***  "+next);
			 if(n[i]==next)
			{
				next++;
			}
			else
			{
				//System.out.println("Finish");
				res=false;
				break;
			}
				
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []tab=new int[]{4,5,6,7,1,2,3};
		boolean check=checkPermutation(tab);
		if(check)
			System.out.println("Perfect");
		else
			System.out.println("NOT PERFECT");
	}

}
