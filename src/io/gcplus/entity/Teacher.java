package io.gcplus.entity;

import java.util.Date;

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
	private int sex;
	// ���䣨Ů�˵����������ܣ�
	private int age;
	// ���
	private String type;
	// ְ��
	private String post;
	// ְ��
	private String title;
	// ѧ��
	private String education;
	// ������ò
	private String politic;
	// ��Ժʱ��
	private Date collegeTime;
	// ����ʱ��
	private Date workTime;
	//���������Ĺ��췽�����޲Σ�
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	//��ʽ���췽�����������ģ�
	public Teacher(String name, int age, int sex, String type, String post,String title, String education,
			String politic, Date collegeTime, Date workTime) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.type = type;
		this.post = post;
		this.title = title;
		this.education = education;
		this.politic = politic;
		this.collegeTime = collegeTime;
		this.workTime = workTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
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

	public Date getCollegeTime() {
		return collegeTime;
	}

	public void setCollegeTime(Date collegeTime) {
		this.collegeTime = collegeTime;
	}

	public Date getWorkTime() {
		return workTime;
	}

	public void setWorkTime(Date workTime) {
		this.workTime = workTime;
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
