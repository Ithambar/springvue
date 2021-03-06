package hhd.demo.springvuebackend.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * Stats
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {
	private Map<String, Map<String, Object>> namedChunkGroups;
}
