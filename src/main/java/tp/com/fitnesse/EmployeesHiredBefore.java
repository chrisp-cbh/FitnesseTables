package tp.com.fitnesse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeesHiredBefore {
	private Date date;

	public EmployeesHiredBefore(Date date) {
		this.date = date;
	}

	public List<Object> query() {
		List<Object> results = new ArrayList<Object>();
		results.add(createBobMartin());
		results.add(createJamesGrenning());
		return results;
	}

	private Object createBobMartin() {
		ArrayList<Object> bobMartin = new ArrayList<Object>();
		bobMartin.add(fieldToObjectList("employee number", "1429"));
		bobMartin.add(fieldToObjectList("first name", "Bob"));
		bobMartin.add(fieldToObjectList("last name", "Martin"));
		bobMartin.add(fieldToObjectList("hire date", "10-Oct-1974"));
		return bobMartin;
	}

	private Object createJamesGrenning() {
		ArrayList<Object> jamesGrenning = new ArrayList<Object>();
		jamesGrenning.add(fieldToObjectList("employee number", "8832"));
		jamesGrenning.add(fieldToObjectList("first name", "James"));
		jamesGrenning.add(fieldToObjectList("last name", "Grenning"));
		jamesGrenning.add(fieldToObjectList("hire date", "15-Dec-1979"));
		return jamesGrenning;
	}

	private List<Object> fieldToObjectList(String fieldName, String fieldValue) {
		List<Object> objectList = new ArrayList<Object>();
		objectList.add(fieldName);
		objectList.add(fieldValue);
		return objectList;
	}
}
