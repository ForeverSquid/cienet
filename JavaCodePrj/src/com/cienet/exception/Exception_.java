package com.cienet.exception;

class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	MyException(){
        super("myexception");
    }
    MyException(String msg){
        super(msg);
    }
}
public class Exception_ {
    public void function1(int n){
        System.out.println("111111");
        function2(n);  
        System.out.println("b111111");
    }
    public void function2(int n){
        System.out.println("222222");
        try{
            function3(n);
        }catch(MyException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally{
            System.out.println("jiesu");
        }
        System.out.println("b222222");
    }
    public void function3(int n)throws MyException{
        System.out.println("333333");
        function4(n);
        System.out.println("b333333");
    }
    public void function4(int n) throws MyException{
        System.out.println("444444");
        function5(n);
        System.out.println("b444444");
    }
    public void function5(int n) throws MyException{
        System.out.println("555555");
        if(n<0){
            throw new MyException("cuo");
            
        }else{
            System.out.println("55555success!");
        }
        System.out.println("555555");
    }
    
    public static void main(String[] args) {
        Exception_ ed = new Exception_();
        ed.function1(-100);
    }
}
