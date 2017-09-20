/**
 * 输出9*9口诀。
 * 分行与列考虑，共9行9列，i控制行，j控制列。
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
