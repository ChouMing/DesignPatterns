package com.zmychou.cor;

public class Tinkers implements IHandler 
{
	private IHandler handler;
	@Override 
		public void handle(String task){
		if ("fix".equals(task))
		{
			System.out.println("I am a tinker,I can handle it");
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
