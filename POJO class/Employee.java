// Pojo = plain old java object 

public class Employee {
	
		private int empId;
		private String name;
		private float salary;
		private String city;

		public Employee() {

		}

		public Employee(int empId, String name, float salary, String city) {
			this.empId = empId;
			this.name = name;
			this.salary = salary;
			this.city = city;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
		}


	}
