package intoOne;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {

	private List<Category> categories;
	
	public CategoryService() {
		categories = new ArrayList<>();
	}

	// insert into categories (id,name) values(5,"test");
	public void addCategory(Category category) {

		categories.add(category);
		System.out.println(category.getName() +" "+  category.getId());
	}
	
	public void getCategory() {
		for(Category listele : categories) {
			System.out.println(listele.getId() +""+ listele.getName());
		}
		}
	
	public List<Category> getAll(){
		return categories;
	}
	
	

}
