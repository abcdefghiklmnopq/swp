/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author thand
 */
public class Course implements java.io.Serializable {

    private int courseId;
    private Date createdate;
    private String shortdecription;
    private String thumnailURL;
    private String title;
    private boolean feature;
    private Category category;
    private Status status;
    private ArrayList<PricePackage> Prices;

    public Course() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ArrayList<PricePackage> getPrices() {
        return Prices;
    }

    public void setPrices(ArrayList<PricePackage> Prices) {
        this.Prices = Prices;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getShortdecription() {
        return shortdecription;
    }

    public void setShortdecription(String shortdecription) {
        this.shortdecription = shortdecription;
    }

    public String getThumnailURL() {
        return thumnailURL;
    }

    public void setThumnailURL(String thumnailURL) {
        this.thumnailURL = thumnailURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFeature() {
        return feature;
    }

    public void setFeature(boolean feature) {
        this.feature = feature;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
