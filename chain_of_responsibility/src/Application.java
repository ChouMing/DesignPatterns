package com.zmychou.cor;

public class Application 
{
	private IHandler handler;

	public Application(){
		handler = initChain();
	}
	public static void main(String[] args) 
	{
		Application app = new Application();
		
		app.handler.handle("cook");
		app.handler.handle("fix");
		app.handler.handle("craft");
	}

	public IHandler initChain(){
	//		System.out.println("Hello World!");

		Tinkers tinker = new Tinkers();
		Craftman craftman = new Craftman();
		Cook cook = new Cook();
		tinker.nextHandler(craftman);
		craftman.nextHandler(cook);
//		cook.nextHandler(tinker);
		return tinker;
	}

}
