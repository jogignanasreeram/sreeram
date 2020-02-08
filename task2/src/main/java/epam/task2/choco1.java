package epam.task2;

public  class choco1 extends Abstract_method1{
	public int total_weight(int[] choc,int n)
	{
		int tot=0;
		for(int i=0;i<n;i++)
		{
			tot+=choc[i];
		}
		return tot;
	}
	public int num_of_candy(int low,int high,int[] choc,int c)
	{
		int count=0;
		for(int i=0;i<c;i++)
		{
			if(choc[i]>=low && choc[i]<=high)
				count++;
		}
		return count;
	}

}
