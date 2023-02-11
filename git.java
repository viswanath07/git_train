class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
         return s;
		int n=numRows;
		 int sec = (int) Math.ceil(s.length() / (2 * numRows - 2.0));
        int c = sec * (numRows - 1);
		char a[][]=new char[n][c];
		int i=0,j=0,p=0;
		for(i=0;i<n;i++)
			for(j=0;j<c;j++)
				a[i][j]='0';
		i=0;j=0;
		while(true)
		{
			if(p==s.length())
						break;
			a[i][j]=s.charAt(p++);
			if(i!=n-1)
				i++;
			if(i==n-1)
			{
				while(true)
				{
					if(p==s.length())
						break;
					a[i][j]=s.charAt(p++);
					i--;j++;
					if(i==0)
						break;
					
				}
				//i=0;
				//j--;
			}
			if(p==s.length())
				break;
		}
		String r="";
		for(i=0;i<n;i++)
		{
			for(j=0;j<c;j++)
				if(a[i][j]!='0')
					r+=a[i][j];
				//System.out.print(a[i][j]+"  ");
			//System.out.println();
		}
		return r;
        
    }
}