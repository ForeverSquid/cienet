
public class A{

	
	public static void main(String [] args){
		
		
		int a[]={4,1,3,7,9,2,5};
		
		quickSort(a,0,a.length-1);
		
		for(int i:a){
			System.out.println(i);
		}
		
	}
	/*
		a:Ҫ�Ƚϵ�����
		start:��ѡ����ٽ�ֵ��������
		end:���һ��Ԫ�ص�������
		
	*/
	public static void quickSort(int [] data,int start,int end){
		
		//ȷ��ָ�뷽����߼�������Ҳ���Ǵ������������������� 
		boolean flag=true; //false:��->��  true����->��
		int i=start;
		int j=end;
		if(i>=j){//�ж��Ƿ��м��� �����м䷵��..�ж�ÿ���ݹ��˳���������֮���˳�
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
				j--;//�ҵ���
				
			}else{					
				i++;//����
			}	
			
			
		}
		//�ڶ��αȽϣ���һ���Ѿ�������
		i--;
		j++;
		quickSort(data,start,i);	
		quickSort(data,j,end);	
		
	}
	

}