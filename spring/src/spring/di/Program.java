package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 지시서로 넘기쟈
		
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		ApplicationContext context= 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole)context.getBean("console");
		//ExamConsole console = (ExamConsole)context.getBean(ExamConsole.class);
		console.print();
		
		List<Exam> exams= (List<Exam>) context.getBean("exams");//new ArrayList<>();
		exams.add(new NewlecExam(1,1,1,1));
		
		new ArrayList();
		for(Exam e:exams)
			System.out.println(e);
		
	}

}
