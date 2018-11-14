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
			System.err.println("ʱ��ת������!\n");
			e.printStackTrace();
		}
		return null;
	}

	public static Teacher scannerInfo() {
		Scanner sc = new Scanner(System.in);
		Teacher one = new Teacher();
		System.out.println("����������");
		one.setName(sc.nextLine());
		System.out.println("�������Ա�");
		System.out.println("1. ��");
		System.err.println("2. Ů");
		System.out.println("3. ������");
		int sexNum = sc.nextInt();
		if (sexNum == 1) {
			one.setSex(1);
		}else if (sexNum == 2) {
			one.setSex(2);
		}if (sexNum == 3) {
			one.setSex(0);
		}else {
			System.err.println("����㴴����������");
			main(null);
		}
		
		System.out.println("����������");
		one.setAge(sc.nextInt());

		// ����ְ�����ͽ����ж�
		System.out.println("��ѡ��ְ������");
		System.out.println("1. ��ʦ");
		System.out.println("2. ������Ա");
		System.out.println("3. ʵ��Ա");
		int typeNum = sc.nextInt();
		if (typeNum == 1) {
			one.setType(Type.TEACHER.toString());
		} else if (typeNum == 2) {
			one.setType(Type.EXECUTIVE_STAFF.toString());
		} else if (typeNum == 3) {
			one.setType(Type.LAB_ASSISTANT.toString());
		} else {
			System.err.println("��������ȷ���!");
			main(null);
		}

		// ����ְ������ж�
		System.out.println("��ѡ��ְ��");
		System.out.println("1.��Ա");
		System.out.println("2.�Ƴ�/���Ƴ�");
		System.out.println("3.����/������");
		System.out.println("4.У��/��У��");

		int executiveStaffNum = sc.nextInt();
		if (executiveStaffNum == 1) {
			one.setPost("��Ա");
		} else if (executiveStaffNum == 2) {
			one.setPost("�Ƽ�");
		} else if (executiveStaffNum == 3) {
			one.setPost("����");
		} else if (executiveStaffNum == 4) {
			one.setPost("У��");
		} else {
			System.err.println("��������ȷ���!");
			main(null);
		}

		// ����ְ�ƽ����ж�
		System.out.println("��ѡ��ְ��");
		System.out.println("1.����");
		System.out.println("2.������");
		System.out.println("3.��ʦ");
		System.out.println("4.����");
		System.out.println("5.ʵ����Ա");
		System.out.println("6.������Ա");

		int titleNum = sc.nextInt();
		if (titleNum == 1) {
			one.setTitle("����");
		} else if (titleNum == 2) {
			one.setTitle("������");
		} else if (titleNum == 3) {
			one.setTitle("��ʦ");
		} else if (titleNum == 4) {
			one.setTitle("����");
		} else if (titleNum == 5) {
			one.setTitle("ʵ����Ա");
		} else if (titleNum == 6) {
			one.setTitle("������Ա");
			System.out.println("��ѡ����");
			System.out.println("1.�߹�");
			System.out.println("2.����ʦ");
			System.out.println("3.����");
			int administrativeNum = sc.nextInt();
			if (administrativeNum == 1) {
				one.setAdministrative("�߹�");
			} else if (administrativeNum == 2) {
				one.setAdministrative("����ʦ");
			} else if (administrativeNum == 3) {
				one.setAdministrative("����");
			} else {
				System.out.println("��������ȷ�ı�ţ�");
				main(null);
			}
		} else {
			System.out.println("��������ȷ���!");
			main(null);
		}

		// ����ѧ�������ж�
		System.out.println("��ѡ��ѧ��");
		System.out.println("1. ����");
		System.out.println("2. ˶ʿ");
		System.out.println("3. ��ʿ");
		int educationNum = sc.nextInt();
		if (educationNum == 1) {
			one.setEducation("����");
		} else if (educationNum == 2) {
			one.setEducation("˶ʿ");
		} else if (educationNum == 3) {
			one.setEducation("��ʿ");
		} else {
			System.out.println("��������ȷ���!");
			main(null);
		}

		System.out.println("������������ò");
		one.setPolitic(sc.next());

		System.out.println("��������Ժʱ��");
		one.setCollegeTime(string2Date(sc.next()));

		System.out.println("�����빤��ʱ��");
		one.setCollegeTime(string2Date(sc.next()));
		sc.close();
		return one;
	}

	public static void showInfo(Teacher one) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("����:" + one.getName() +
				"\n�Ա�:" + one.getSex() +
				"\n����:" + one.getAge() + 
				"\nְ������:" + one.getType() + 
				"\nְ��:" + one.getPost() + 
				"\nְ��:" + one.getTitle() + 
				"\nѧ��:" + one.getEducation() + 
				"\n������ò:" + one.getPolitic() + 
				"\n��Ժʱ��:" + dateFormat.format(one.getCollegeTime()) +
				"\n����ʱ��:" + dateFormat.format(one.getCollegeTime()));
	}
	
}
