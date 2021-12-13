package com.example.demo;

import com.example.demo.com.example.demo.TopicService;
import com.example.demo.com.example.demo.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getTopics();
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopicid(@PathVariable String id){
        return topicService.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topics){
        topicService.addTopic(topics);

    }
}
