package com.coderscampus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.domain.Channel;
import com.coderscampus.repository.ChannelRepository;


@Service
public class ChannelService {
	
	@Autowired
	private ChannelRepository channelRepo;
	
	public Channel findChannelById(Long channelId) {
		return channelRepo.findById(channelId).orElse(new Channel());
	}
	
	public List<Channel> findAll() {
		return channelRepo.findAll();
	}
	
}	
