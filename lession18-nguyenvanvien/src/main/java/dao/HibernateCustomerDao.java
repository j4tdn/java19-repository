package dao;

import java.util.List;

import persistence.entities.Customer;

public class HibernateCustomerDao extends BaseHibernateDao implements CustomerDao {
	private static final String QUERY_FIND_EMPLOYEES_WITH_HIGHER_SALARY_THAN_MANAGER = 
	        "SELECT e1.Name, e1.salary " +
	        "FROM employee e1 " +
	        "JOIN employee e2 ON e1.managerId = e2.id " +
	        "WHERE e1.salary > e2.salary";

	
	@Override
	public List<Customer> getCustomer() {
		return openSession().createNativeQuery(QUERY_FIND_EMPLOYEES_WITH_HIGHER_SALARY_THAN_MANAGER)
				.getResultList();
	}
}
