package com.saler.dummy.modal;

import java.io.Serializable;

public class Product implements Serializable {
	private Long id;
	private String Title;
	private String subTitle;
	private String description;
	private String thumbnail;
	private int price;
	private boolean offer;
	private int offerPrice;

	public Product() {

	}

	public Product(Long id, String title, String subTitle, String description, String thumbnail, int price,
			boolean offer, int offerPrice) {
		super();
		this.id = id;
		this.Title = title;
		this.subTitle = subTitle;
		this.description = description;
		this.price = price;
		this.offer = offer;
		this.offerPrice = offerPrice;
		this.thumbnail = thumbnail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isOffer() {
		return offer;
	}

	public void setOffer(boolean offer) {
		this.offer = offer;
	}

	public int getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(int offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Title=" + Title + ", subTitle=" + subTitle + ", description=" + description
				+ ", thumbnail=" + thumbnail + ", price=" + price + ", offer=" + offer + ", offerPrice=" + offerPrice
				+ "]";
	}

}
