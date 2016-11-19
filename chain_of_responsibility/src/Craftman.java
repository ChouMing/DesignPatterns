package com.zmychou.cor;

public class Craftman implements IHandler 
{
	private IHandler handler;
	@Override 
		public void handle(String task){
		if ("craft".equals(task))
		{
			System.out.println("I am a craftman,I can handle it");
		}
		else
		{
			System.out.println("I can not handle it,next");
			if (handler != null)
			{
				handler.handle(task);
			}
		}
	} 
	@Override
		public void nextHandler(IHandler handler){
		this.handler = handler;
	}
}
