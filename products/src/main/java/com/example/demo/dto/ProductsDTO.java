package com.example.demo.dto;


public class ProductsDTO{
	
	private String id;
	private String Name;
	private String Title;
	private String Categories;
	private String Tag;
	private Integer Price;
	private String Currency;
	private String Description;
	private String Image;
	
	public ProductsDTO() {
	}
	
	
	public ProductsDTO(String id, String Name, String Title, String Categories, String Tag, Integer Price, String Currency, String Description,String Image) {
		this.id = id;
		this.Name = Name;
		this.Title = Title;
		this.Categories = Categories;
		this.Tag = Tag;
		this.Price = Price;
		this.Currency = Currency;
		this.Description = Description;
		this.Image = Image;
	}
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public void setTitle(String Title) {
		this.Title = Title;
	}
	
	public String getCategories() {
		return Categories;
	}
	
	public void setCategories(String Categories) {
		this.Categories = Categories;
	}
	
	public String getTag() {
		return Tag;
	}
	
	public void setTag(String Tag) {
		this.Tag = Tag;
	}
	
	public Integer getPrice() {
		return Price;
	}
	
	public void setPrice(Integer Price) {
		this.Price = Price;
	}
	
	public String getCurrency() {
		return Currency;
	}
	
	public void setCurrency(String Currency) {
		this.Currency = Currency;
	}
	
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String Description) {
		this.Description = Description;
	}
	
	public String getImage() {
		return Image;
	}
	
	public void setImage(String Image) {
		this.Image = Image;
	}
}