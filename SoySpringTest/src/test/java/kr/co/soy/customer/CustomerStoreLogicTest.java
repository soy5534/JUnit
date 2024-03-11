package kr.co.soy.customer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.soy.customer.domain.CustomerVO;
import kr.co.soy.customer.store.logic.CustomerStoreLogic;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"
		,"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class CustomerStoreLogicTest {

	@Autowired
	private CustomerStoreLogic cStore;
	
	@Test
	public void testInsertCustomer() {
		CustomerVO customer = new CustomerVO();
		customer.setCustomerId("khuser01");
		customer.setCustomerPw("pass01");
		customer.setCustomerName("일용자");
		customer.setCustomerEmail("khuser01@kh.com");
		assertEquals(1, cStore.insertCustomer(customer));
	}
	
	// 수정하기
	@Test
	public void testUpdateCustomer() {
		CustomerVO customer = new CustomerVO();
		customer.setCustomerPw("3333");
		customer.setCustomerEmail("khuser3333@naver.com");
		customer.setCustomerNo(3);
		assertEquals(1, cStore.updateCustomer(customer));
	}
	
	// 삭제하기
	@Test
	public void testDeleteCustomer() {
		assertEquals(1, cStore.deleteCustomer(3));
	}
	
	@Test
	public void testSelectCustomerList() {
		List<CustomerVO> cList = cStore.selectCustomerList();
		assertEquals(3, cList.size());
	}
	
	// 아이디로 검색하기
	@Test
	public void testSelectOneByNo() {
//		assertEquals(null, cStore.selectOneByNo(3));
		assertNotEquals(null, cStore.selectOneByNo(2));
	}
	
}
