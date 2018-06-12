package score;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x;
			
			Scanner s1 =new Scanner(System.in); 
			Scanner s2 =new Scanner(System.in); 
			Scanner s3 =new Scanner(System.in); 
			Scanner s4 =new Scanner(System.in); 
			Scanner s5 =new Scanner(System.in); 
			Scanner s6 =new Scanner(System.in); 
			Scanner s7 =new Scanner(System.in); 
			x = s7.nextInt();
			String [] id=new String[x-1]; 
			String [] Subject={"gpa","mid","fin","quiz","att"}; 
			int [] gpa=new int[x-1]; 
			int [] mid=new int[x-1]; 
			int [] fin=new int[x-1]; 
			int [] quiz=new int[x-1]; 
			int [] att=new int[x-1]; 

			double[] sum = new double[x-1]; 
			int q1,q2,q3,q4,q5,q6,q7,q8,q9,q10; 
			System.out.println("請輸入姓名"); 
			for(q1=0; q1<x ;q1++){ 
				id[q1] =s1.next(); 
			} 

			for(q2=0; q2<5 ;q2++){ 
			System.out.println("請輸入" +id[0] + "的" + Subject[q2] + "成績"); 
				gpa[q2]=s2.nextInt();
			} 

			for(q3=0; q3<5 ;q3++){ 
			System.out.println("請輸入" +id[1] + "的" + Subject[q3] + "成績"); 
				mid[q3]=s3.nextInt();	
			} 

			for(q4=0; q4<5 ;q4++){ 
			System.out.println("請輸入" +id[2] + "的" + Subject[q4] + "成績"); 
				fin[q4]=s4.nextInt();
			} 

			for(q5=0; q5<5 ;q5++){ 
			System.out.println("請輸入" +id[3] + "的" + Subject[q5] + "成績"); 
				quiz[q5]=s5.nextInt();
			} 

			for(q6=0; q6<5 ;q6++){ 
			System.out.println("請輸入" +id[4] + "的" + Subject[q6] + "成績"); 
				att[q6]=s6.nextInt();
			} 

			String[] attr = new String[5];
			for(q7=0; q7<x ;q7++) {
				if (att[q7] == 0) {
					attr[q7] = "否";
				}
				if(att[q7] == 1) {
					attr[q7] = "是";
				}
				for(q8=0; q8<x ;q8++){ 
					sum[q8] = gpa[q8]*0.2 + mid[q8] * 0.3 + fin[q8]*0.3 + quiz[q8]*0.2;
					if(att[q8] == 1) {
						sum[q8] = sum[q8] + 5;
						if(sum[q8] >= 100) {
							sum[q8] = 100;
						}
					}
				}
			}
			
			System.out.println("\n學號\t平時\t期中\t期末\t小考\t全勤\t總分\t等級"); 
			for(q9=0; q9<x; q9++){ 
				System.out.println(id[q9] + "\t" + gpa[q9] +"\t" + mid[q9] + "\t" + fin[q9] +"\t" + quiz[q9]+"\t"+ att[q9] +"\t" + sum[q9]); 
			} System.out.println("_______________________________________________"); 

			for(int s=0; s<sum.length-1; s++){ 
			for(int t=s+1; t<sum.length; t++){ 
			if(sum[t] > sum[s]){ 
			double tmp = sum[t]; 
			sum[t] = sum[s]; 
			sum[s] = tmp; 
			} 
			} 
			}System.out.println(); 
			for(int k=0; k<sum.length; k++){ 
			System.out.println("第" + (k+1) + "名的分數是" + sum[k] + "分。" + "學號是" + id[k]); 

			} 
	}

}
