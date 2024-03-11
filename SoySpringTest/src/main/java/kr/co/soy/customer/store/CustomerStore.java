package kr.co.soy.customer.store;

import java.util.List;

import kr.co.soy.customer.domain.CustomerVO;

public interface CustomerStore {

	public int insertCustomer(CustomerVO customer);
	public int updateCustomer(CustomerVO customer);
	public int deleteCustomer(Integer customerNo);
	public List<CustomerVO> selectCustomerList();
	public CustomerVO selectOneByNo(Integer customerNo);
}
