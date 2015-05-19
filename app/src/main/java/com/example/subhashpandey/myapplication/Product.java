package com.example.subhashpandey.myapplication;

import com.google.gson.annotations.Expose;

public class Product {

@Expose
private String $id;
@Expose
private Integer ProductId;
@Expose
private String ProductName;
@Expose
private String ProductTitle;
@Expose
private String Duration;
@Expose
private String ProductDescription;
@Expose
private String ProductCode;
@Expose
private Integer ProductDetailId;
@Expose
private String ProductDetailDescription;
@Expose
private String PdfUrl;
@Expose
private String ImageUrl;

/**
* 
* @return
* The $id
*/
public String get$id() {
return $id;
}

/**
* 
* @param $id
* The $id
*/
public void set$id(String $id) {
this.$id = $id;
}

/**
* 
* @return
* The ProductId
*/
public Integer getProductId() {
return ProductId;
}

/**
* 
* @param ProductId
* The ProductId
*/
public void setProductId(Integer ProductId) {
this.ProductId = ProductId;
}

/**
* 
* @return
* The ProductName
*/
public String getProductName() {
return ProductName;
}

/**
* 
* @param ProductName
* The ProductName
*/
public void setProductName(String ProductName) {
this.ProductName = ProductName;
}

/**
* 
* @return
* The ProductTitle
*/
public String getProductTitle() {
return ProductTitle;
}

/**
* 
* @param ProductTitle
* The ProductTitle
*/
public void setProductTitle(String ProductTitle) {
this.ProductTitle = ProductTitle;
}

/**
* 
* @return
* The Duration
*/
public String getDuration() {
return Duration;
}

/**
* 
* @param Duration
* The Duration
*/
public void setDuration(String Duration) {
this.Duration = Duration;
}

/**
* 
* @return
* The ProductDescription
*/
public String getProductDescription() {
return ProductDescription;
}

/**
* 
* @param ProductDescription
* The ProductDescription
*/
public void setProductDescription(String ProductDescription) {
this.ProductDescription = ProductDescription;
}

/**
* 
* @return
* The ProductCode
*/
public String getProductCode() {
return ProductCode;
}

/**
* 
* @param ProductCode
* The ProductCode
*/
public void setProductCode(String ProductCode) {
this.ProductCode = ProductCode;
}

/**
* 
* @return
* The ProductDetailId
*/
public Integer getProductDetailId() {
return ProductDetailId;
}

/**
* 
* @param ProductDetailId
* The ProductDetailId
*/
public void setProductDetailId(Integer ProductDetailId) {
this.ProductDetailId = ProductDetailId;
}

/**
* 
* @return
* The ProductDetailDescription
*/
public String getProductDetailDescription() {
return ProductDetailDescription;
}

/**
* 
* @param ProductDetailDescription
* The ProductDetailDescription
*/
public void setProductDetailDescription(String ProductDetailDescription) {
this.ProductDetailDescription = ProductDetailDescription;
}

/**
* 
* @return
* The PdfUrl
*/
public String getPdfUrl() {
return PdfUrl;
}

/**
* 
* @param PdfUrl
* The PdfUrl
*/
public void setPdfUrl(String PdfUrl) {
this.PdfUrl = PdfUrl;
}

/**
* 
* @return
* The ImageUrl
*/
public String getImageUrl() {
return ImageUrl;
}

/**
* 
* @param ImageUrl
* The ImageUrl
*/
public void setImageUrl(String ImageUrl) {
this.ImageUrl = ImageUrl;
}

}