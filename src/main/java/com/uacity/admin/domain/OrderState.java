package com.uacity.admin.domain;

//存储 类Order （订单主表  HC_BIZ_ORDER） 中的   orderstate 状态

	public enum OrderState {
	
		未付款("notpaying" , 1) ,//未付款
		已付款("payment" , 2),//已付款
		已发货("shipped" , 3),//已发货
		已完成("completed" , 4),//已完成
		退货("Regoods" , 5),//退货
		取消("cancel" , 6),//取消
		未知("unknown" , 0);//未知
		
		private String text;
		private int value;
		OrderState(String text, int value){
			this.text = text;
			this.value = value;
		}
		public String getText() {
			return text;
		}

		public int getValue() {
			return value;
		}	
		
	}
