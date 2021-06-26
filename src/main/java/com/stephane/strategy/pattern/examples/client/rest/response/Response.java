package com.stephane.strategy.pattern.examples.client.rest.response;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

public @Data class Response{
	private List<ResponseItem> response = new ArrayList<>();
}