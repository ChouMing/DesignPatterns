package com.zmychou.cor;
public interface IHandler
{
	public abstract void handle(String task);
	public abstract void nextHandler(IHandler handler);
} 
