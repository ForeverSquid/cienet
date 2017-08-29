package com.cienet.other;

public  class MyButton {
	public static void main(String [] args){					
		OnClick_ my1=new OnClick_(){
				public void OnClick(){
				 	System.out.println("onclick1");
				}
		};
		
		my1.OnClick();
		
		MyButton my=new MyButton();
		my.setOnClick(new OnClick_(){
				public void OnClick(){
				 	System.out.println("onclick2");
				}
		});
		OnClick_ t=my.go();
		t.OnClick();
	}	
	
	public void  setOnClick(OnClick_ l){
		l.OnClick();			
	}
	public OnClick_ go(){
		return new OnClick_(){
			public void OnClick(){				
				System.out.println("onclick3");
			}			
		};
	}	
}
interface OnClick_{	
	void OnClick();
}

