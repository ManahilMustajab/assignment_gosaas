package io.gosaas.cloud;

import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import freemarker.template.Configuration;

@RestController
public class CloudItemController {
	@Autowired
	Configuration fmConfiguration;
	@Value("${serviceUrl}")
	String serviceUrl;
	@Value("${endPoint}")
	String endPoint;
	@Value("${organizationCode}")
	String organizationCode;
	@Value("${changeServiceUrl}")
	String changeServiceUrl;
	@Value("${ChangeTypeValue}")
	String ChangeTypeValue;
	@Value("${StructureName}")
	String StructureName;
	@Value("${ACDTypeValue}")
	String ACDTypeValue;
	@Value("${sequenceNumber}")
	String sequenceNumber;
	@Autowired
	RestTemplate restTemplate;
	Logger logger = LoggerFactory.getLogger(CloudItemController.class);

	// API to sync items locally created to cloud
	@RequestMapping(method = RequestMethod.POST, value = "syncitems")
	public String syncAllItems(@RequestBody ItemCloud cloudItems) {
		cloudItems.setOrganizationCode("GOSAAS");
		cloudItems.setItemClass("Root Item Class");
		URI uri = UriComponentsBuilder.fromHttpUrl(serviceUrl).path(endPoint).build().toUri();
		logger.trace("setting headers for syncing item on cloud...");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		try {
			headers.set("Authorization", "Basic Q3VzdG9taXphdGlvbjpHb3NhYXMhQCMxMjM=");
			HttpEntity<ItemCloud> entity = new HttpEntity<ItemCloud>(cloudItems, headers);
			logger.trace("Hitting endPoint to sync item created on DB to Cloud...");
			return restTemplate.exchange(uri, HttpMethod.POST, entity, String.class).getBody();
		} catch (Exception e) {
			logger.trace("failed to sync object..." + e.getLocalizedMessage());
			return "false";
		}
	}

	// API to create change order on cloud
	@RequestMapping(method = RequestMethod.POST, value = "createChangeOrderr")
	public String createChangeOrderOnCloud(@RequestBody ChangeOrder changeOrder) throws Exception {
		Map<String, String> data = new HashMap<>();
		data.put("changeNotice", changeOrder.getChangeNotice());
		data.put("changeName", changeOrder.getChangeName());
		data.put("changeDescription", changeOrder.getChangeDescription());
		// data.put(" ChangeTypeValue", ChangeTypeValue);
		data.put("organizationCode", organizationCode);
		// String url =
		// "https://fa-etia-test-saasfaprod1.fa.ocs.oraclecloud.com:443/fscmService/ProductDesignChangeOrderService";
		logger.trace("setting FTLclass configurations...");
		String requestString = FreeMarkerTemplateUtils
				.processTemplateIntoString(fmConfiguration.getTemplate("createChangeOrder.ftl"), data);
		logger.trace("setting headers for creating chnage order...");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_XML);
		headers.setBasicAuth("Q3VzdG9taXphdGlvbjpHb3NhYXMhQCMxMjM=");
		try {
			HttpEntity<String> entity = new HttpEntity<String>(requestString, headers);
			logger.trace("hitting endpoint for creating chnage order...");
			ResponseEntity<String> response = restTemplate.postForEntity(changeServiceUrl, entity, String.class);
			logger.trace(response.getStatusCode() + " returned status code for change order:  "
					+ changeOrder.getChangeNotice());
			return "true";
		} catch (Exception e) {
			logger.trace("failed at creating change order... " + e.getLocalizedMessage());
			return "false";
		}
	}

	// API to add affected objects on change order in cloud
	@RequestMapping(method = RequestMethod.POST, value = "addAffectedObjects")
	public String AddAffectedItemToChangeOrder(@RequestBody AffectedObjects affectedobject) throws Exception {
		logger.trace(" adding affected objects to  change notice :" + affectedobject.getChangeNotice());
		Map<String, String> data = new HashMap<>();
		// String url =
		// "https://fa-etia-test-saasfaprod1.fa.ocs.oraclecloud.com:443/fscmService/ProductDesignChangeOrderService";
		data.put("changeNotice", affectedobject.getChangeNotice());
		data.put("affectedItemNumber", affectedobject.getAffectedItemNumber());
		data.put("organizationCode", organizationCode);
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("Q3VzdG9taXphdGlvbjpHb3NhYXMhQCMxMjM=");
		// headers.set("Authorization", "Basic Q3VzdG9taXphdGlvbjpHb3NhYXMhQCMxMjM=");
		headers.setContentType(MediaType.TEXT_XML);
		try {
			String requestString = FreeMarkerTemplateUtils
					.processTemplateIntoString(fmConfiguration.getTemplate("addAffectedObjects.ftl"), data);
			HttpEntity<String> entity = new HttpEntity<String>(requestString, headers);
			ResponseEntity<String> response = restTemplate.postForEntity(changeServiceUrl, entity, String.class);
			System.out.println("status for adding affected object " + affectedobject.getAffectedItemNumber() + " --> "
					+ response.getStatusCode());
			return "true";
		} catch (Exception e) {
			logger.trace("failed in adding affceted object..." + e.getLocalizedMessage());
			return "false";
		}
	}

	// API to red-line structure on cloud
	@RequestMapping(method = RequestMethod.POST, value = "RedlineStructure/{componentId}")
	public String RedliningStructures(@RequestBody redlineStructure redlining, @PathVariable String componentId)
			throws Exception {
		logger.trace(" redlining a structure to change notice id :" + redlining.getChangeNotice());
		Map<String, String> data = new HashMap<>();
		// String url =
		// "https://fa-etia-test-saasfaprod1.fa.ocs.oraclecloud.com:443/fscmService/ProductDesignChangeOrderService";
		data.put("changeNotice", redlining.getChangeNotice());
		data.put("structureNumber", componentId);
		data.put("structureQuantity", redlining.getStructureQuantity());
		data.put("organizationCode", organizationCode);
		data.put("StructureName", StructureName);
		data.put("ACDTypeValue", ACDTypeValue);
		data.put("sequenceNumber", sequenceNumber);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_XML);
		headers.setBasicAuth("Q3VzdG9taXphdGlvbjpHb3NhYXMhQCMxMjM=");
		try {
			String requestString = FreeMarkerTemplateUtils
					.processTemplateIntoString(fmConfiguration.getTemplate("redliningStructure.ftl"), data);
			HttpEntity<String> entity = new HttpEntity<String>(requestString, headers);
			ResponseEntity<String> response = restTemplate.postForEntity(changeServiceUrl, entity, String.class);
			logger.trace(componentId + " --> " + response.getStatusCode());
			return "true";
		} catch (Exception e) {
			logger.trace("failed in redlining structure..." + e.getLocalizedMessage());
			return "false";
		}
	}

}
