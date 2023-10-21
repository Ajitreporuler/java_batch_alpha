package com.oops.javaAbstractAndInterface;

public class Story implements Like{

	@Override
	public void sendEmoji() {
		System.out.println("sending emoji......");
		
	}
	
	
	
public static void main(String[] args) {
	Like story=new Story(); 
	Like post=new Post();
	story.sendEmoji();
	
	story.likeWithAudio();
	System.out.println("................");
	
	post.sendEmoji();
	post.likeWithAudio();
}
}
