package practice.org;

public class Practice {
	public static void main(String[] args) {
		int num=95,rem=0,sum=0;
		while(num>0||sum>9) {
			if(num==0) {
				num=sum;
				sum=0;
				
			}
			rem=num%10;
			sum=sum+rem;
			num=num/10;
	}
           System.out.println(sum);
	}
				
	}

