package intoOne;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		CategoryService catSer = new CategoryService();
		Category category = new Category();
		
		category.setId(0);
		category.setName("programlama");
		catSer.addCategory(category);
		System.out.println("******************");
		catSer.getCategory();
		System.out.println("******************");
		///////////////////////////////////////////////////////////////////////////////////////
		 List<Category> test = catSer.getAll();
		 for(Category yazdır: test) {
			 System.out.println(yazdır.getId() + " "+ yazdır.getName());
		 }
		 
		 
		System.out.println("******************");
		///////////////////////////////////////////////////////////////////////////////
		CourseService courseService = new CourseService();
		Course  course  = new Course();
		course.setCourseDescription("ccvv");
		course.setCourseId(0);
		course.setCourseTitle("sdff");
		courseService.addCourse(course);
		course.getCourseId();
		
		List<Course> crs = courseService.getAll();
		 for(Course yazdır: crs) {
			 System.out.println(yazdır.getCourseId() + " "+ yazdır.getCourseTitle());
		 }
	}
	
	
	

}
