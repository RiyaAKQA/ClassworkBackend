package com.training.springBootDemo;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;

	@RequestMapping("/topic")

	public List<Topic> getAllTopic() {
		return topicService.getAllTopic();

	}

	@RequestMapping("/topic/{id}")
	public Stream<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@DeleteMapping("/topic/{id}")
	public List<Topic> deleteTopic(@PathVariable("id") int id) {
		topicService.deleteTopic(id);
		return topicService.getAllTopic();
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
	public void updateTopic(@RequestBody Topic topic ,@PathVariable String id) {
		
	}
	
	

}