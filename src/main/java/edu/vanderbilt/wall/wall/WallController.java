package edu.vanderbilt.wall.wall;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WallController {

	/**
	 * Implement the following API:
	 * 
	 *  /posts/add
	 *    Adds a post (works for get and post requests)
	 *    Returns the JSON for the newly added post as produced
	 *    by the default ObjectMapper in Spring
	 *  Example:
	 *    http://localhost:8080/posts/add?user=foo&content=bar
	 *    ==> {"user":"foo","id":"04ea628b-49cd-489c-bfe5-17633b05cd2d","time":"2019-08-08T11:20:18.874","content":"bar"}
	 *    
	 *  /posts
	 *    Returns a JSON array of the current list of posts
	 *    Works for get or post requests
	 *  Example:
	 *    http://localhost:8080/posts
	 *    ==> [{"user":"foo","id":"59734773-d495-4a71-9a86-33c83e4e5530","time":1565296819451,"content":"bar"},
	 *         {"user":"foo2","id":"abda0033-234a-40e9-b1a3-b7ebae9c4d0b","time":1565296821054,"content":"bar2"}]
	 *         
	 *  /posts/{post-id}
	 *    Returns the JSON for the post with the given id
	 *  Example:
	 *    http://localhost:8080/posts/abda0033-234a-40e9-b1a3-b7ebae9c4d0b
	 *    ==>  {"user":"foo2","id":"abda0033-234a-40e9-b1a3-b7ebae9c4d0b","time":1565296821054,"content":"bar2"}
	 * 
	 *  /wall
	 *    Returns the HTML for the wall that includes each post's user, time, and content
	 *    The content type must be set to text/html;charset=UTF-8
	 *    The format of the wall html is up to you
	 *  
	 */

	
}
