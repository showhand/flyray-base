package me.flyray.crm.api;

import java.util.List;
import java.util.Map;

import me.flyray.crm.model.MerchantBase;

/** 
* @author: bolei
* @date：2017年3月15日 下午10:58:55 
* @description：类说明 
*/

public interface MerchantBaseService {

	MerchantBase queryObject(Long merchantId);
	
	List<MerchantBase> queryList(Map<String, Object> map);
	
	void save(MerchantBase merchantBase);
	
	void update(MerchantBase merchantBase);
	
	void deleteBatch(Long[] ids);
}
