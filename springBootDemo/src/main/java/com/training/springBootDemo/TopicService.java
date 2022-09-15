package com.training.springBootDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	public List<Topic> topicList = Arrays.asList(new Topic("1", "java"), new Topic("2", "dbms"),
			new Topic("3", "hindi"));

	public List<Topic> getAllTopic() {
		return topicList;
	}

	public Stream<Topic> getTopic(String id) {
		return topicList.stream().filter(data -> data.getId().equals(id));
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
	}

	public void deleteTopic(int id) {

		topicList.removeIf(data -> data.getId().equals(id));
	}
}
