package kr.co.soy.customer.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.soy.customer.domain.CustomerVO;
import kr.co.soy.customer.store.CustomerStore;

// logic = impl
@Repository
public class CustomerStoreLogic implements CustomerStore{

	@Autowired
	private SqlSession session;		
	
	@Override
	public int insertCustomer(CustomerVO customer) {
		int result = session.insert("CustomerMapper.insertCustomer", customer);
		return result;
	}

	@Override
	public int updateCustomer(CustomerVO customer) {
		int result = session.update("CustomerMapper.updateCustomer", customer);
		return result;
	}

	@Override
	public int deleteCustomer(Integer customerNo) {
		int result = session.delete("CustomerMapper.deleteCustomer", customerNo);
		return result;
	}
	
	@Override
	public List<CustomerVO> selectCustomerList() {
		List<CustomerVO> cList = session.selectList("CustomerMapper.selectCustomerList");
		return cList;
	}

	@Override
	public CustomerVO selectOneByNo(Integer customerNo) {
		CustomerVO customer = session.selectOne("CustomerMapper.selectOneByNo", customerNo);
		return customer;
	}

	
	
}
