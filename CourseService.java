package intoOne;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

	public List<Course>  courseList = new ArrayList<Course>();
	
	
	
	// belirli bir alana göre veri isitiyorum.
	// select * from coourses cr WHERE cr.name ='java';
	//course tablom var , ad, id  ,soyad , araba modeli 
	
		public void addCourse(Course course) {
			courseList.add(course);
			System.out.println(course.getCourseDescription());
		}
		
		
		public void getCourse() {
			for(Course listele : courseList) {
				System.out.println(listele.getCourseId() +""+ listele.getCourseTitle());
			}
			
		}

			public List<Course> getAll(){
				return courseList;
			}
			
		
		

	
}
