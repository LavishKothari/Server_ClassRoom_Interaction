/*
 * this class will store the student's information
 * 
 * Each student will have the following properties : 
 * 		studentName 	- The name of the student
 * 		macAddress 		- The MAC address of the tablet the student is using.
 * 		pic 			- the relative address of the pic of student
 * 		textMessage  	- the detailed doubt of the student
 * 		doubtType 		- type of doubt - either "audio" or "text"
 */
import java.util.LinkedList;

public class Student
{
	// this class stores the student information
	String studentName,macAddress,pic,doubtSubject,textMessage="Text............................................\nhello lavish kothari how are you\nwhat are you doing?.................",doubtType;
	
	/* This is the LinkedList that will store the list of students who are having a Text doubt*/
	static LinkedList<Student> studentListText=new LinkedList<Student>(); 
	
	/* This is the LinkedList that will store the list of students who are having a Audio doubt*/
	static LinkedList<Student> studentListAudio=new LinkedList<Student>();
	
	/* This Linked List will have the list of all the students */
	static LinkedList<Student> studentList=new LinkedList<Student>();
	
	Student(String studentName,String macAddress,String pic,String doubtSubject,String doubtType)
	{
		this.doubtType=doubtType;
		this.doubtSubject=doubtSubject;
		this.studentName=studentName;
		this.macAddress=macAddress;
		this.pic=pic;
		if(doubtType.equals("audio")) // if the doubtType is audio then add the student to studentListAudio
		{
			textMessage="";
			studentListAudio.add(this);
		}
		else if(doubtType.equals("text"))// if the doubtType is audio then add the student to studentListText
			studentListText.add(this);
		else if(doubtType.equals(""))// if the doubtType is not specified then add it to simple studentList
		{
			studentList.add(this);
		}
	}

	public static LinkedList<Student> getStudentListText()
	{
		return studentListText;
	}
	public static LinkedList<Student> getStudentListAudio()
	{
		return studentListAudio;
	}
}