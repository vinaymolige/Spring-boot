package com.example.demo.com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
private  List<Topic> topics = new ArrayList<> (Arrays.asList(
        new Topic("java", "Spring framework","Discription"),
        new Topic("java","core java","java core"),
        new Topic("python","python","python course")
));
    public List<Topic> getTopics(){
    return topics;
}
public Topic getTopic(String id){
    return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}
    public void addTopic(Topic topic){
    topics.add(topic);
    }
}
