package com.project.domain;

public class CategoryDTO {
	private int cat_no;
	private String cat_code;
	private String cat_name;
	

	public int getCat_no() {
		return cat_no;
	}
	// 기본생성자
	public CategoryDTO() {}

	
	// DB에서 조회한 결과를 이용할 때 catNo 필요
     	public CategoryDTO(int cat_no, String cat_code, String cat_name) {
		super();
		this.cat_no = cat_no;
		this.cat_code = cat_code;
		this.cat_name = cat_name;
	}
	// DB에 데이터 입력시 catNo 필요 없음
		public CategoryDTO(String cat_code, String cat_name) {
			super();
			this.cat_code = cat_code;
			this.cat_name = cat_name;
		}
		public String getCat_code() {
			return cat_code;
		}
		public void setCat_code(String cat_code) {
			this.cat_code = cat_code;
		}
		public String getCat_name() {
			return cat_name;
		}
		public void setCat_name(String cat_name) {
			this.cat_name = cat_name;
		}
		public void setCat_no(int cat_no) {
			this.cat_no = cat_no;
		}
		@Override
		public String toString() {
			return "CategoryDTO [cat_no=" + cat_no + ", cat_code=" + cat_code + ", cat_name=" + cat_name + "]";
		}

     	
     	
     	
}
	