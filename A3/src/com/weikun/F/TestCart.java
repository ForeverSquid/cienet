package com.weikun.F;

import java.util.List;

public class TestCart {
	private static List<Goods> list=Cart.list;
	public void buyGoods(Goods newGoods){
		
		
		boolean flag=false;
		for(int i=0;i<list.size();i++){
			Goods oldGoods=list.get(i);
			
			if(newGoods.getNo().equals(oldGoods.getNo())){//���ﳵ���Ѿ�������Ҫ�����Ʒ��
				oldGoods.setQuantity(newGoods.getQuantity()+oldGoods.getQuantity());
				flag=true;
				break;
				
			}
		}
		if(!flag){
			list.add(newGoods);//������Ʒ
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCart c=new TestCart();
		c.buyGoods(new Goods("001","ţ��",10,2));
		c.buyGoods(new Goods("001","ţ��",10,3));
		c.buyGoods(new Goods("002","��ţ",100,4));
		c.buyGoods(new Goods("001","ţ��",10,4));
		int total=0;
		for(Goods g :list){
			total+=g.getPrice()*g.getQuantity();
			System.out.println(g.getNo()+"~"+g.getName()+"~"+g.getQuantity());			
		}
		System.out.println("�ܼ�:"+total);
	}

}
