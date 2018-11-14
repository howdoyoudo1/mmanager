package management;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.sun.jmx.snmp.internal.SnmpAccessControlModel;

import io.gcplus.entity.post.post;
import io.gcplus.entity.type.ExecutiveType;
import io.gcplus.entity.type.Type;
import io.gcplus.entity.title.*;
import io.gcplus.entity.Teacher;
import io.gcplus.entity.education.*;

public class Test {

	public static void main(String[] args) {
		Teacher teacher = scannerInfo();
		showInfo(teacher);
	}

	public static Date string2Date(String date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-DD");
		try {
			if (date == null || date.equals("")) {
				date = "2000-01-01";
			}
			Date day = dateFormat.parse(date);
			return day;
		} catch (ParseException e) {
			System.err.println("时间转换出错!\n");
			e.printStackTrace();
		}
		return null;
	}

	public static Teacher scannerInfo() {
		Scanner sc = new Scanner(System.in);
		Teacher one = new Teacher();
		System.out.println("请输入姓名");
		one.setName(sc.nextLine());
		System.out.println("请输入性别");
		System.out.println("1. 男");
		System.err.println("2. 女");
		System.out.println("3. 外星人");
		int sexNum = sc.nextInt();
		if (sexNum == 1) {
			one.setSex(1);
		}else if (sexNum == 2) {
			one.setSex(2);
		}if (sexNum == 3) {
			one.setSex(0);
		}else {
			System.err.println("你打算创造新人类吗？");
			main(null);
		}
		
		System.out.println("请输入年龄");
		one.setAge(sc.nextInt());

		// 输入职工类型进行判断
		System.out.println("请选择职工类型");
		System.out.println("1. 教师");
		System.out.println("2. 行政人员");
		System.out.println("3. 实验员");
		int typeNum = sc.nextInt();
		if (typeNum == 1) {
			one.setType(Type.TEACHER.toString());
		} else if (typeNum == 2) {
			one.setType(Type.EXECUTIVE_STAFF.toString());
		} else if (typeNum == 3) {
			one.setType(Type.LAB_ASSISTANT.toString());
		} else {
			System.err.println("请输入正确编号!");
			main(null);
		}

		// 输入职务进行判断
		System.out.println("请选择职务");
		System.out.println("1.科员");
		System.out.println("2.科长/副科长");
		System.out.println("3.处长/副处长");
		System.out.println("4.校长/副校长");

		int executiveStaffNum = sc.nextInt();
		if (executiveStaffNum == 1) {
			one.setPost("科员");
		} else if (executiveStaffNum == 2) {
			one.setPost("科级");
		} else if (executiveStaffNum == 3) {
			one.setPost("处级");
		} else if (executiveStaffNum == 4) {
			one.setPost("校级");
		} else {
			System.err.println("请输入正确编号!");
			main(null);
		}

		// 输入职称进行判断
		System.out.println("请选择职称");
		System.out.println("1.教授");
		System.out.println("2.副教授");
		System.out.println("3.讲师");
		System.out.println("4.助教");
		System.out.println("5.实验人员");
		System.out.println("6.行政人员");

		int titleNum = sc.nextInt();
		if (titleNum == 1) {
			one.setTitle("教授");
		} else if (titleNum == 2) {
			one.setTitle("副教授");
		} else if (titleNum == 3) {
			one.setTitle("讲师");
		} else if (titleNum == 4) {
			one.setTitle("助教");
		} else if (titleNum == 5) {
			one.setTitle("实验人员");
		} else if (titleNum == 6) {
			one.setTitle("行政人员");
			System.out.println("请选择编号");
			System.out.println("1.高工");
			System.out.println("2.工程师");
			System.out.println("3.助工");
			int administrativeNum = sc.nextInt();
			if (administrativeNum == 1) {
				one.setAdministrative("高工");
			} else if (administrativeNum == 2) {
				one.setAdministrative("工程师");
			} else if (administrativeNum == 3) {
				one.setAdministrative("助教");
			} else {
				System.out.println("请输入正确的编号！");
				main(null);
			}
		} else {
			System.out.println("请输入正确编号!");
			main(null);
		}

		// 输入学历进行判断
		System.out.println("请选择学历");
		System.out.println("1. 本科");
		System.out.println("2. 硕士");
		System.out.println("3. 博士");
		int educationNum = sc.nextInt();
		if (educationNum == 1) {
			one.setEducation("本科");
		} else if (educationNum == 2) {
			one.setEducation("硕士");
		} else if (educationNum == 3) {
			one.setEducation("博士");
		} else {
			System.out.println("请输入正确编号!");
			main(null);
		}

		System.out.println("请输入政治面貌");
		one.setPolitic(sc.next());

		System.out.println("请输入来院时间");
		one.setCollegeTime(string2Date(sc.next()));

		System.out.println("请输入工作时间");
		one.setCollegeTime(string2Date(sc.next()));
		sc.close();
		return one;
	}

	public static void showInfo(Teacher one) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("姓名:" + one.getName() +
				"\n性别:" + one.getSex() +
				"\n年龄:" + one.getAge() + 
				"\n职工类型:" + one.getType() + 
				"\n职务:" + one.getPost() + 
				"\n职称:" + one.getTitle() + 
				"\n学历:" + one.getEducation() + 
				"\n政治面貌:" + one.getPolitic() + 
				"\n来院时间:" + dateFormat.format(one.getCollegeTime()) +
				"\n工作时间:" + dateFormat.format(one.getCollegeTime()));
	}
	
}
