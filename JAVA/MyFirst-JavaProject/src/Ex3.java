/**
 * ���9*9�ھ���
 * �������п��ǣ���9��9�У�i�����У�j�����С�
 * @author fuylb
 *
 */
public class Ex3 
{
	public static void main(String[] args)
	{ 
			int i=0;
			int j=0;
			for(i=1;i<=9;i++)
		{ 
			for(j=1;j<=i;j++)
				System.out.print(i+"*"+j+"="+i*j+"\t");
			System.out.println();
		}
	}

}
