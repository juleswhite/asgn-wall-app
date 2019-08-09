package edu.vanderbilt.wall.wall;

import java.time.LocalDateTime;
import java.util.UUID;

public class Post {

	private String user;
	
	private String id = UUID.randomUUID().toString();

	private long time;

	private String content;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
