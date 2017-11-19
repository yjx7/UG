package com.service.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.goodsMapper;
import com.dto.Result;
import com.entity.goods;
import com.entity.goodsWithBLOBs;
import com.service.GoodsService;
@Service("goodsService")
public class goodsServiceImpl implements GoodsService {
		    @Resource  
		    private goodsMapper goodsMapper;  
			@Override
			public Result<goods>[] showGoods() {
				String type="Digital";
				goodsWithBLOBs goods=this.goodsMapper.selectByType(type);
				
				return null;
			}
			@Override
			public void addGoods(goodsWithBLOBs goods) {
				this.goodsMapper.insert(goods);//前端判断goods属性非空
			}
	

}
