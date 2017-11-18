package com.service;

import com.dto.Result;
import com.entity.goods;
import com.entity.goodsWithBLOBs;
import com.entity.user;

public interface GoodsService {
  		
		public Result<goods>[] showGoods();
		void addGoods(goodsWithBLOBs goods);

}
