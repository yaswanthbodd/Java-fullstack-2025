package com.product;

import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProductDaoImpl implements ProductDao {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void productInsert(int id, String name, int pieces) {
		String SQL = "insert into product_spring values (?,?,?)";
		jdbcTemplate.update(SQL,id,name,pieces);
		System.out.println("Inserted ....");
	}

	@Override
	public void productUpdate(int id, int pieces) {
		String SQL = "update product_spring set pieces = ? where id = ?";
		jdbcTemplate.update(SQL,pieces,id);
		System.out.println("Updated......");
	}

	@Override
	public void productDelete(int id) {
		String SQL = "delete from product_spring where id = ?";
		jdbcTemplate.update(SQL,id);
		System.out.println("Deleted....");
	}

	@Override
	public List<Map<String, Object>> productLists() {
		String SQL = "select * from product_spring";
		return jdbcTemplate.queryForList(SQL);
	}
	
}
