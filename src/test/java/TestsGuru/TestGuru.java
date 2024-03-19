package TestsGuru;

import org.testng.annotations.Test;

public class TestGuru extends BaseTestGuru{

	@Test
	void New_Customer() {
		MP.NewCustomer();
	}
	
	@Test
	void Edit_Customer() {
	MP.EditCustomer();
	
	}
	
	@Test
	void Delete_Customer() {
	MP.DeleteCustomer();
	
	}
	
	
}
