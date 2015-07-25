
public class A{

	
	public static void main(String [] args){
		
		
		int a[]={4,1,3,7,9,2,5};
		
		quickSort(a,0,a.length-1);
		
		for(int i:a){
			System.out.println(i);
		}
		
	}
	/*
		a:要比较的数组
		start:你选择的临界值的索引号
		end:最后一个元素的索引号
		
	*/
	public static void quickSort(int [] data,int start,int end){
		
		//确定指针方向的逻辑变量，也就是从左搜索还是向右搜索 
		boolean flag=true; //false:左->右  true：右->左
		int i=start;
		int j=end;
		if(i>=j){//判断是否到中间了 ，到中间返回..判断每个递归退出的条件，之后退出
			return;	
		}		
		while(i!=j){
				System.out.println("i:"+i);
				
				System.out.println("j:"+j);
			if(data[i]>data[j]){
				
				int m=0;				
				m=data[j];
				data[j]=data[i];
				data[i]=m;
				flag=(flag==true)?false:true;
					
			
					
			}
			if(flag){
				j--;//右到左
				
			}else{					
				i++;//左到右
			}	
			
			
		}
		//第二次比较，第一次已经完事了
		i--;
		j++;
		quickSort(data,start,i);	
		quickSort(data,j,end);	
		
	}
	

}