
public class New_Thread extends Thread{
	public static void main(String[] args) {
		New_Thread left=new New_Thread();
		left.setName("left");
		left.start();
		
		New_Thread right=new New_Thread();
		right.setName("right");
		right.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag=true;
		int i=0;
		while(flag){
			if(Thread.currentThread().getName().equals("left")){
				System.out.println("�����ã��ú�ѧϰ�����Բ�������"+i);
				i++;
			}
			if(Thread.currentThread().getName().equals("right")){
				System.out.println("�ұ���ã��ú�ѧϰ�����Բ�������"+i);
				i++;
			}
			if(i>=5){
				System.exit(1);
				
			}
			
		}
		
	}
}
