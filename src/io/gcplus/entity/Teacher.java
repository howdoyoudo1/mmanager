package io.gcplus.entity;

import java.util.Date;

import io.gcplus.entity.post.post;
import io.gcplus.entity.type.Type;

/**
 * 教师类，包含老师的姓名，性别，年龄
 * 
 * @author 魏红季
 * 
 * 类就是各个属性的抽象集合
 * 
 *
 */
public class Teacher {
	/**
	 * 每个人都是独一无二的，为了区分人。
	 * 现实中，我们用相貌来区分两个同名的人。
	 * 我们需要创建一个唯一性的东西来区分，在数据库里面叫uuid
	 * 
	 */
	private String uuid;//存储老师的工号
	// 姓名
	private String name;
	// 性别（男，女，我不想告诉你）
	private String sex;
	// 年龄（女人的年龄是秘密）
	private int age;
	// 类别
	private Type type;
	// 职务
	private String post;
	// 职称
	private String title;
	// 学历
	private String education;
	// 政治面貌
	private String politic;
	// 进院时间
	private Date collegetime;
	// 工作时间
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

	private String teacher;// 教师
	private String executiveStaff;// 行政人员
	private String labAssistant;// 实验员
	private String clerk;// 科员
	private String section;// 科级
	private String division;// 处级
	private String school;// 校级
	private String profeeror;// 教授
	private String associate;// 副教授
	private String lecturer;// 讲师
	private String assistant;// 助教
	private String experimenter;// 实验员
	private String administrative;// 行政管理人员
	private String engineering;// 高工
	private String engineer;// 工程师
	private String helper;// 助工
	private String bachelor;// 本科
	private String master;// 硕士
	private String doctor;// 博士

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
