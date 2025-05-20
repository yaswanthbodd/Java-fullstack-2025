package com.product;
import java.util.List;
import java.util.Map;

public interface ProductDao {
	public void productInsert(int id,String name,int pieces);
	public void productUpdate(int id,int pieces);
	public void productDelete(int id);
	public List<Map<String,Object>> productLists();
}
