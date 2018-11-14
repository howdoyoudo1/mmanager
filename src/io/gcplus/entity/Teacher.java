package io.gcplus.entity;

import java.util.Date;

import io.gcplus.entity.post.post;
import io.gcplus.entity.type.Type;

/**
 * ��ʦ�࣬������ʦ���������Ա�����
 * 
 * @author κ�켾
 * 
 * ����Ǹ������Եĳ��󼯺�
 * 
 *
 */
public class Teacher {
	/**
	 * ÿ���˶��Ƕ�һ�޶��ģ�Ϊ�������ˡ�
	 * ��ʵ�У���������ò����������ͬ�����ˡ�
	 * ������Ҫ����һ��Ψһ�ԵĶ��������֣������ݿ������uuid
	 * 
	 */
	private String uuid;//�洢��ʦ�Ĺ���
	// ����
	private String name;
	// �Ա��У�Ů���Ҳ�������㣩
	private String sex;
	// ���䣨Ů�˵����������ܣ�
	private int age;
	// ���
	private Type type;
	// ְ��
	private String post;
	// ְ��
	private String title;
	// ѧ��
	private String education;
	// ������ò
	private String politic;
	// ��Ժʱ��
	private Date collegetime;
	// ����ʱ��
	private Date worktime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPolitic() {
		return politic;
	}

	public void setPolitic(String politic) {
		this.politic = politic;
	}

	public Date getCollegetime() {
		return collegetime;
	}

	public void setCollegetime(Date collegetime) {
		this.collegetime = collegetime;
	}

	public Date getWorktime() {
		return worktime;
	}

	public void setWorktime(Date worktime) {
		this.worktime = worktime;
	}

	private String teacher;// ��ʦ
	private String executiveStaff;// ������Ա
	private String labAssistant;// ʵ��Ա
	private String clerk;// ��Ա
	private String section;// �Ƽ�
	private String division;// ����
	private String school;// У��
	private String profeeror;// ����
	private String associate;// ������
	private String lecturer;// ��ʦ
	private String assistant;// ����
	private String experimenter;// ʵ��Ա
	private String administrative;// ����������Ա
	private String engineering;// �߹�
	private String engineer;// ����ʦ
	private String helper;// ����
	private String bachelor;// ����
	private String master;// ˶ʿ
	private String doctor;// ��ʿ

	public String getClerk() {
		return clerk;
	}

	public void setClerk(String clerk) {
		this.clerk = clerk;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getProfeeror() {
		return profeeror;
	}

	public void setProfeeror(String profeeror) {
		this.profeeror = profeeror;
	}

	public String getAssociate() {
		return associate;
	}

	public void setAssociate(String associate) {
		this.associate = associate;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public String getAssistant() {
		return assistant;
	}

	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	public String getExperimenter() {
		return experimenter;
	}

	public void setExperimenter(String experimenter) {
		this.experimenter = experimenter;
	}

	public String getAdministrative() {
		return administrative;
	}

	public void setAdministrative(String administrative) {
		this.administrative = administrative;
	}

	public String getEngineering() {
		return engineering;
	}

	public void setEngineering(String engineering) {
		this.engineering = engineering;
	}

	public String getEngineer() {
		return engineer;
	}

	public void setEngineer(String engineer) {
		this.engineer = engineer;
	}

	public String getHelper() {
		return helper;
	}

	public void setHelper(String helper) {
		this.helper = helper;
	}

	public String getBachelor() {
		return bachelor;
	}

	public void setBachelor(String bachelor) {
		this.bachelor = bachelor;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getExecutiveStaff() {
		return executiveStaff;
	}

	public void setExecutiveStaff(String executiveStaff) {
		this.executiveStaff = executiveStaff;
	}

	public String getLabAssistant() {
		return labAssistant;
	}

	public void setLabAssistant(String labAssistant) {
		this.labAssistant = labAssistant;
	}

}
