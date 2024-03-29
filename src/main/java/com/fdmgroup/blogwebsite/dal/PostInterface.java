package com.fdmgroup.blogwebsite.dal;

import com.fdmgroup.blogwebsite.entity.Post;

public interface PostInterface {
	public void addPost(Post post);
	public void removePost(int postId);
	public void modifyPostTitle(int postId, String title);
	public void modifyPostDate(int postId, String date);
	public void modifyPostCategory(int postId, String category);
	public void modifyPostContent(int postId, String content);
	public void modifyPostTag(int postId, String tag);
	public Post getPost(int postId);
	public java.util.List getPostList();
}
