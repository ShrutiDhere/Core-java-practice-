package com.inheritance;

public class Meta_Main_Method {
	
     public static void main(String[] args) {
    	 
    	 System.err.println(" Welcome To Instagram Application ");
    	 System.out.println(" ");
	 Instagram insta = new Instagram();
	 
	 insta.Register();
	 insta.Login();
	 insta.addStory();
	 insta.uploadReels();
	 insta.Logout();
	 
	 System.err.println("--------------------------------------");
	 
	 
	 System.err.println(" Welcome To Facebook Application ");
	 System.out.println(" ");
	 Facebook fb = new Facebook();
	 
	 fb.Register();
	 fb.Login();
	 fb.addPost();
	 fb.addComment();
	 fb.Logout();
	 
	 
	 
	 
    	 
	}
}
