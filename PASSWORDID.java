package HappyDay;

import java.util.*;

class User
{
	String userId, password, name;
	static int count;
	
	public User(String userId, String password, String name) {
		this.userId=userId;
		this.password=password;
		this.name=name;
		count++;		
	}
}

public class UserId 
{
	public static void print_line()	
	{
		System.out.println("====================");
	}
	
	public static void print_text()	
	{
		print_line();
		System.out.println("1. Sign Up");
		System.out.println("2. Login");
		System.out.println("3. Print All Users");
		System.out.println("4. Exit");
		print_line();
		System.out.println("번호를 입력하시오. : ");
	}
	
	public static void All_users(User[] lst, int count)
	{
		for(int i=0; i<count; i++)
		{
			System.out.println("{"+lst[i].userId+","+lst[i].password+","+lst[i].name+"}");
		}
	}
	
	public static void Login_User(User[] lst, int count, String ID, String PW, String name)	
	{
		int login_state = 0, login_no = 0;
		for(int i=0; i<count; i++)
		{
			if(lst[i].userId.equals(ID) && lst[i].password.equals(PW))
			{
				login_state = 1;
				login_no = i;
				break;
			}
			else if(lst[i].userId.equals(ID) || lst[i].password.equals(PW))
			{
				login_state =2;
			}
			else 
			{
				login_state = 3;
			}
		}
		if(login_state == 1)
		{
			System.out.println(login_no+"으로 로그인 되셨습니다.");
		}
		else if(login_state ==2)
		{
			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
		}
		else if(login_state ==3)
		{
			System.out.println("정보가 없습니다 .");
		}
	
	}
	
	public static void main(String[] args)
	{
		User[] usr_list = new User[1024];
		int input=0, count=0;
		String ID, PW, name;
		Scanner scan = new Scanner(System.in);
		while(input!=4)
		{
			print_text();
			input =scan.nextInt();
			switch(input)
			{
			case 1:
				System.out.print("ID : ");
				ID = scan.next();
				System.out.print("Password : ");
				PW = scan.next();
				System.out.print("name : ");
				name = scan.next();
				usr_list[count] = new User(ID,PW,name);
				count = usr_list[count].count;
				break;
				
			case 2:
				System.out.print("ID : ");
				ID = scan.next();
				System.out.print("Password : ");
				PW = scan.next();
				System.out.print("name : ");
				name = scan.next();
				Login_User(usr_list, usr_list[count].count, ID,PW,name);
				break;
			
			case 3:
				All_users(usr_list, usr_list[count].count);
				break;
				
			case 4:
				System.out.print("종료합니다.");
				break;	
			}		
		}		
	}
}
