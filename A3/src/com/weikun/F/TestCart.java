package com.weikun.F;

import java.util.List;

public class TestCart {
	private static List<Goods> list=Cart.list;
	public void buyGoods(Goods newGoods){
		
		
		boolean flag=false;
		for(int i=0;i<list.size();i++){
			Goods oldGoods=list.get(i);
			
			if(newGoods.getNo().equals(oldGoods.getNo())){//购物车中已经有了想要买的商品。
				oldGoods.setQuantity(newGoods.getQuantity()+oldGoods.getQuantity());
				flag=true;
				break;
				
			}
		}
		if(!flag){
			list.add(newGoods);//纯新商品
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCart c=new TestCart();
		c.buyGoods(new Goods("001","牛奶",10,2));
		c.buyGoods(new Goods("001","牛奶",10,3));
		c.buyGoods(new Goods("002","奶牛",100,4));
		c.buyGoods(new Goods("001","牛奶",10,4));
		int total=0;
		for(Goods g :list){
			total+=g.getPrice()*g.getQuantity();
			System.out.println(g.getNo()+"~"+g.getName()+"~"+g.getQuantity());			
		}
		System.out.println("总计:"+total);
	}

}
