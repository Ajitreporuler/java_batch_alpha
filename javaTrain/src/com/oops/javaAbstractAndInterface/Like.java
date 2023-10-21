package com.oops.javaAbstractAndInterface;

public interface Like {
void sendEmoji();
default void likeWithAudio() {
	System.out.println("like with audio.......");
}
}
