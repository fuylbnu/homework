/**
 * ��1+2!+3!+...+20!�ĺ�
 * @author fuylb
 *
 */
public class Ex5 
{
	static long sum = 0; 
	static long fac = 0;
	public static void main(String[] args)
	{ 
		long sum = 0;
		long fac = 1;
		for(int i=1; i<=20; i++)
		{
			fac = fac * i;
			sum += fac;
		}
		System.out.println(sum);
	}
}
