/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thand
 */
public class Topic {
    private int Id;
    private int TopicOrder;
    private String TopicName;
    private String description;

    public Topic() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTopicOrder() {
        return TopicOrder;
    }

    public void setTopicOrder(int TopicOrder) {
        this.TopicOrder = TopicOrder;
    }

    public String getTopicName() {
        return TopicName;
    }

    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
