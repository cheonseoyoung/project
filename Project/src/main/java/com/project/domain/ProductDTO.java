package com.project.domain;

public class ProductDTO {
   private int pNo;
   private String pCategory_fk;
   private String pName;
   private String pCompany;
   private String pImage_1;
   private String pImage_2;
   private int pQty;
   private int Price;
   private String pSpec;
   private String pContent;
   /*
    * private String pInputImage_1; private String pInputImage_2; private String
    * pInputImage_3;
    */
   
   //기본 생성자
   public ProductDTO() {}

   public int getpNo() {
      return pNo;
   }

   public void setpNo(int pNo) {
      this.pNo = pNo;
   }

   public String getpCategory_fk() {
      return pCategory_fk;
   }

   public void setpCategory_fk(String pCategory_fk) {
      this.pCategory_fk = pCategory_fk;
   }

   public String getpName() {
      return pName;
   }

   public void setpName(String pName) {
      this.pName = pName;
   }

   public String getpCompany() {
      return pCompany;
   }

   public void setpCompany(String pCompany) {
      this.pCompany = pCompany;
   }

   public String getpImage_1() {
      return pImage_1;
   }

   public void setpImage_1(String pImage_1) {
      this.pImage_1 = pImage_1;
   }

   public String getpImage_2() {
      return pImage_2;
   }

   public void setpImage_2(String pImage_2) {
      this.pImage_2 = pImage_2;
   }

   public int getpQty() {
      return pQty;
   }

   public void setpQty(int pQty) {
      this.pQty = pQty;
   }

   public int getPrice() {
      return Price;
   }

   public void setPrice(int price) {
      Price = price;
   }

   public String getpSpec() {
      return pSpec;
   }

   public void setpSpec(String pSpec) {
      this.pSpec = pSpec;
   }

   public String getpContent() {
      return pContent;
   }

   public void setpContent(String pContent) {
      this.pContent = pContent;
   }

   public ProductDTO(int pNo, String pCategory_fk, String pName, String pCompany, String pImage_1, String pImage_2,
         int pQty, int price, String pSpec, String pContent) {
      super();
      this.pNo = pNo;
      this.pCategory_fk = pCategory_fk;
      this.pName = pName;
      this.pCompany = pCompany;
      this.pImage_1 = pImage_1;
      this.pImage_2 = pImage_2;
      this.pQty = pQty;
      Price = price;
      this.pSpec = pSpec;
      this.pContent = pContent;
   }

   public ProductDTO(String pCategory_fk, String pName, String pCompany, String pImage_1, String pImage_2, int pQty,
         int price, String pSpec, String pContent) {
      super();
      this.pCategory_fk = pCategory_fk;
      this.pName = pName;
      this.pCompany = pCompany;
      this.pImage_1 = pImage_1;
      this.pImage_2 = pImage_2;
      this.pQty = pQty;
      Price = price;
      this.pSpec = pSpec;
      this.pContent = pContent;
   }

   @Override
   public String toString() {
      return "ProductDTO [pNo=" + pNo + ", pCategory_fk=" + pCategory_fk + ", pName=" + pName + ", pCompany="
            + pCompany + ", pImage_1=" + pImage_1 + ", pImage_2=" + pImage_2 + ", pQty=" + pQty + ", Price=" + Price
            + ", pSpec=" + pSpec + ", pContent=" + pContent + "]";
   }

}
