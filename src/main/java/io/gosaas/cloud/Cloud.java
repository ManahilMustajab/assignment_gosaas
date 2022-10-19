package io.gosaas.cloud;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "items", "count", "hasMore", "limit", "offset", "links" })
@Generated("jsonschema2pojo")
public class Cloud {

	@JsonProperty("items")
	private List<ItemCloud> items = null;
	@JsonProperty("count")
	private Integer count;
	@JsonProperty("hasMore")
	private Boolean hasMore;
	@JsonProperty("limit")
	private Integer limit;
	@JsonProperty("offset")
	private Integer offset;
	@JsonProperty("links")
	private List<Link__1> links = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("items")
	public List<ItemCloud> getItems() {
		return items;
	}

	@JsonProperty("items")
	public void setItems(List<ItemCloud> items) {
		this.items = items;
	}

	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	@JsonProperty("hasMore")
	public Boolean getHasMore() {
		return hasMore;
	}

	@JsonProperty("hasMore")
	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	@JsonProperty("limit")
	public Integer getLimit() {
		return limit;
	}

	@JsonProperty("limit")
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	@JsonProperty("offset")
	public Integer getOffset() {
		return offset;
	}

	@JsonProperty("offset")
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	@JsonProperty("links")
	public List<Link__1> getLinks() {
		return links;
	}

	@JsonProperty("links")
	public void setLinks(List<Link__1> links) {
		this.links = links;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Cloud [items=" + items + ", count=" + count + ", hasMore=" + hasMore + ", limit=" + limit + ", offset="
				+ offset + ", links=" + links + ", additionalProperties=" + additionalProperties + "]";
	}
	
	

}