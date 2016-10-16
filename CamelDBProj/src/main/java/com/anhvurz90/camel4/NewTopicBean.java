package com.anhvurz90.camel4;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Bean that generates and process NewTopic.
 *
 */
public class NewTopicBean {

    private Random ran = new Random();
    
    public Map<String, Object> generateNewTopic() {
        Map<String, Object> answer = new HashMap<>();
        
        answer.put("TopicId", ran.nextInt());
        answer.put("TopicName", "Camel in Action");
        answer.put("url", "Camel in Action");
        answer.put("ModuleId", ran.nextInt());
        answer.put("CreateDate", new Date());
        
        return answer;
    }
    
    public String processNewTopic(Map<String, Object> data) {
        return "Processed NewTopic id " + data.get("TopicId") + ", TopicName "
                + data.get("TopicName") 
                + " of " + data.get("ModuleId") + " copies of " + data.get("url");
    }
}
