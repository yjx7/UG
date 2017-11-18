package com.dto;

	/**
	 * ��װjson�������з��ؽ����ʹ����
	 */
	public class Result<T> {


		private boolean success;// 判断是否成功

		private T data;// 信息

		private String error;//错误的信息

		public Result() {
		}

		public Result(boolean success, T data) {
			this.success = success;
			this.data = data;
		}

		public Result(boolean success, String error) {
			this.success = success;
			this.error = error;
		}
		public boolean isSuccess() {
			return success;
		}

		public void setSuccess(boolean success) {
			this.success = success;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}
	
	}

