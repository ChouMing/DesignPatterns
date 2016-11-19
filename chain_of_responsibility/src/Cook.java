package com.zmychou.cor;

public class Cook implements IHandler 
{
	private IHandler handler;
	@Override 
		public void handle(String task){
		if ("cook".equals(task))
		{
			System.out.println("I am a cook,I can handle it");
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
